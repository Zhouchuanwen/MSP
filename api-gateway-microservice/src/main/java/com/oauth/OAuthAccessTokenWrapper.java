package com.oauth;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by alan on 17/2/15.
 */
public class OAuthAccessTokenWrapper extends OAuthWrapper{

    public OAuthAccessTokenWrapper(HttpServletRequest req) {
        super(req);
    }
}
