package com.oauth;

import com.reader.bean.User;
import com.reader.repo.UserRepo;
import com.reader.service.UserService;
import com.reader.util.Wrapper;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;

/**
 * Created by alan on 17/2/15.
 */


public class AccessTokenEndpoint extends HttpServlet {

    @Autowired
    private UserRepo userRepo;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpServletRequest req = new OAuthAccessTokenWrapper(request);
            OAuthTokenRequest oAuthTokenRequest = new OAuthExtendTokenRequest(req);

            if(OAuthUtils.isEmpty(oAuthTokenRequest.getGrantType())){
                printError(response, AuthorizeExceptions.UNSUPPORTED_GRANT_TYPE);
                return;
            }
            OAuthASResponse.OAuthTokenResponseBuilder builder= OAuthASResponse.tokenResponse(HttpServletResponse.SC_OK);

            User user;
            switch (oAuthTokenRequest.getGrantType()){
                case "password":
                    String username=request.getParameter("username");
                    String password=request.getParameter("password");

                    System.out.println(username+"==>"+password);

                    if (OAuthUtils.isEmpty(username) || OAuthUtils.isEmpty(password)) {
                        printError(response, AuthorizeExceptions.ILLEGAL_USERNAME_LENGTH);
                        return;
                    }
                    user = userRepo.getUserByStuName(username);
                    if (user == null) {
                        printError(response, AuthorizeExceptions.NOT_FOUND_USER);
                        return;
                    }
                    if (user.checkCredentials(password)) {

                        break;
                    }
                    printError(response, AuthorizeExceptions.INVALID_USER_PASS);
                    break;
                default:
                    printError(response, AuthorizeExceptions.UNSUPPORTED_GRANT_TYPE);
                    return;
            }

            String accessToken = UserService.getAccessToken(user);
            OAuthResponse oAuthResponse = builder.setAccessToken(accessToken)
                    .setRefreshToken(UserService.getRefreshTokenByUser(user))
                    .setTokenType("Bearer")
                    .setExpiresIn(String.valueOf(30*3600))
                    .buildJSONMessage();

            response.setStatus(oAuthResponse.getResponseStatus());
            response.setHeader(HttpHeaders.CONTENT_TYPE, OAuth.ContentType.JSON + "; charset=UTF-8");
            response.getOutputStream().print(oAuthResponse.getBody());

        } catch (OAuthProblemException e) {
            try {
                OAuthResponse oAuthResponse = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
                        .error(e).buildJSONMessage();
                response.setStatus(oAuthResponse.getResponseStatus());
                response.getOutputStream().print(oAuthResponse.getBody());
            } catch (OAuthSystemException e1) {
                e.printStackTrace();
            }
        }catch (OAuthSystemException e){
            e.printStackTrace();
        }
    }

    private void printError(HttpServletResponse response, AuthorizeExceptions exceptions) throws IOException {
        printError(response, exceptions.get());
    }

    private void printError(HttpServletResponse response, Wrapper wrapper) throws IOException {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        response.setHeader(HttpHeaders.CONTENT_TYPE, OAuth.ContentType.JSON + "; charset=UTF-8");
        response.getOutputStream().print(wrapper.json());
    }

}
