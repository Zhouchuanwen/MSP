package com.api;

import com.oauth.OAuthAccessTokenWrapper;
import com.oauth.OAuthExtendTokenRequest;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import util.Wrapper;

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

    //TODO the proj stop.
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpServletRequest req = new OAuthAccessTokenWrapper(request);
            OAuthTokenRequest oAuthTokenRequest = new OAuthExtendTokenRequest(req);

            //如果没有授权,返回打印错误
            if(OAuthUtils.isEmpty(oAuthTokenRequest.getGrantType())){
                printError(response, AuthorizeExceptions.UNSUPPORTED_GRANT_TYPE);
                return;
            }

            OAuthASResponse.OAuthTokenResponseBuilder builder= OAuthASResponse.tokenResponse(HttpServletResponse.SC_OK);

            //针对不同的授权方式(密码登陆,扫描二维码登陆,刷新access_token等等)作处理
            switch (oAuthTokenRequest.getGrantType()){
                case "password":
                    break;
                default:
                    printError(response, AuthorizeExceptions.UNSUPPORTED_GRANT_TYPE);
                    return;
            }
        } catch (OAuthProblemException e) {
            e.printStackTrace();
        } catch (OAuthSystemException e) {
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
