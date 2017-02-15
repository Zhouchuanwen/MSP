package com.api;

import util.Wrapper;
import util.WrapperProvider;

/**
 * 授权管理异常 200 段
 */
public enum AuthorizeExceptions implements WrapperProvider {

    ILLEGAL_TOKEN_TYPE(202, "不合法的access_token类型"),

    ILLEGAL_OPENID(203, "不合法的OpenID"),

    ILLEGAL_ACCESS_TOKEN(205, "不合法的access_token"),

    ILLEGAL_USERNAME_LENGTH(206, "不合法的用户名长度"),

    ILLEGAL_OAUTH_CODE(209, "不合法的authorization_code"),

    ILLEGAL_REFRESH_TOKEN(210, "不合法的refresh_token"),

    ILLEGAL_RESPONSE_TYPE(211, "不合法的response_type"),

    ILLEGAL_REQUEST_CHARACTER(212, "不合法的请求字符，不能包含\\uxxxx格式的字符"),

    ILLEGAL_ARGS(213, "不合法的参数"),

    ILLEGAL_REQUEST_TYPE(214, "不合法的请求格式"),

    ILLEGAL_URL_LENGTH(215, "不合法的URL长度"),

    MISSING_PARAMETER_ACCESS_TOKEN(216, "缺少access_token参数"),

    MISSING_PARAMETER_REFRESH_TOKEN(218, "缺少refresh_token参数"),

    MISSING_PARAMETER_APP_SECRECT(219, "缺少app_secret参数"),

    MISSING_PARAMETER_AUTHORIZATION_CODE(220, "缺少authorization_code"),

    MISSING_PARAMETER_OPENID(221, "缺少openid"),

    EXPIRE_ACCESS_TOKEN(222, "access_token超时"),

    EXPIRE_REFRESH_TOKEN(223, "refresh_token超时"),

    EXPIRE_AUTHORIZATION_CODE(224, "authorization_code超时"),

    UNSUPPORTED_GRANT_TYPE(225, "unsupported_grant_type"),

    INVALID_USER_PASS(226, "用户名或密码错误"),

    INVALID_USER_TYPE(227, "禁止访问"),

    NOT_FOUND_USER(228, "用户不存在"),

    MISSING_VCODE_CODE(229, "缺少参数code、vcode"),

    MISSING_AUTH_PARAMATER(230, "缺少权限相关参数"),

    MISSING_SYS_PARAMETER(231, "缺少系统配置相关参数"),

    ERROR_VCODE_CODE(315, "验证码错误");


    private int code;
    private String msg;

    AuthorizeExceptions(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Wrapper get() {
        return Wrapper.builder().code(code).msg(msg).build();
    }
}
