package com.api;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.ws.rs.core.HttpHeaders;


import javax.servlet.http.HttpServletRequest;


/**
 * Created by alan on 17/2/15.
 */
public class AuthorizedFilter extends ZuulFilter {

    private static Logger log= LoggerFactory.getLogger(AuthorizedFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();

        log.info(String.format("%s request to %s"),request.getMethod(),request.getRequestURL().toString());

        getAccessToken(request);

        return null;
    }

    /**
     * 从Header、Cookie、Parameter中查找access_token
     * @param request
     * @return
     */
    protected String getAccessToken(HttpServletRequest request) {

        String authorization = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (authorization != null && !authorization.isEmpty()) {
            String[] splits = authorization.split(" ");
            if (splits.length > 1) {
                return splits[1];
            }
        }

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if ("access_token".equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }

        return request.getParameter("access_token");
    }
}
