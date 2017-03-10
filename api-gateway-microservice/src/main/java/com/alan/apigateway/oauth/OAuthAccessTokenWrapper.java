package com.alan.apigateway.oauth;

import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by alan on 17/2/15.
 */
public class OAuthAccessTokenWrapper extends OAuthWrapper {

    public OAuthAccessTokenWrapper(HttpServletRequest req) {
        super(req);
    }

    @Override
    public String getContentType() {
        String contentType = super.getContentType();
        if (!OAuthUtils.isEmpty(contentType) && contentType.contains(OAuth.ContentType.JSON)) {
            return OAuth.ContentType.URL_ENCODED;
        }
        return contentType;
    }
}
