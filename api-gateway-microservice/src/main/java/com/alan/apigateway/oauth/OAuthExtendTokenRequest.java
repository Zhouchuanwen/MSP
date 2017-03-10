package com.alan.apigateway.oauth;

import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.validators.AbstractValidator;
import org.apache.oltu.oauth2.common.validators.OAuthValidator;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jianghailong on 16/6/28.
 */
public class OAuthExtendTokenRequest extends OAuthTokenRequest {

    /**
     * Create an OAuth Token request from a given HttpSerlvetRequest
     *
     * @param request the httpservletrequest that is validated and transformed into the OAuth Token Request
     * @throws OAuthSystemException  if an unexpected exception was thrown
     * @throws OAuthProblemException if the request was not a valid Token request this exception is thrown.
     */
    public OAuthExtendTokenRequest(HttpServletRequest request) throws OAuthSystemException, OAuthProblemException {
        super(request);
    }

    @Override
    protected OAuthValidator<HttpServletRequest> initValidator() throws OAuthProblemException, OAuthSystemException {
        validators.put("apply_token", ApplyTokenValidator.class);
        return super.initValidator();
    }

    public static class ApplyTokenValidator extends AbstractValidator<HttpServletRequest> {

        public ApplyTokenValidator() {
            this.requiredParams.add(OAuth.OAUTH_GRANT_TYPE);
            this.requiredParams.add(OAuth.OAUTH_ACCESS_TOKEN);
            this.requiredParams.add(OAuth.OAUTH_CLIENT_ID);
            this.requiredParams.add(OAuth.OAUTH_CLIENT_SECRET);
        }
    }
}
