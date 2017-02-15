package com.oauth;

import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.validators.AbstractValidator;
import org.apache.oltu.oauth2.common.validators.OAuthValidator;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by alan on 17/2/15.
 */
public class OAuthExtendTokenRequest extends OAuthTokenRequest {

    public OAuthExtendTokenRequest(HttpServletRequest request) throws OAuthProblemException, OAuthSystemException {
        super(request);
    }

    @Override
    public OAuthValidator<HttpServletRequest> initValidator() throws OAuthProblemException, OAuthSystemException {
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
