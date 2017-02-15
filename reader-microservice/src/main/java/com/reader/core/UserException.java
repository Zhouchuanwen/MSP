package com.reader.core;

import util.Wrapper;
import util.WrapperProvider;

/**
 * Created by alan on 17/2/15.
 */
public enum UserException implements WrapperProvider{

    USER_NOT_FOUND(100,"用户不存在"),

    USER_ALREADY_EXIST(101,"用户已经存在"),

    ILLEGAL_PWD_OR_NAME(100,"用户名或密码错误！");

    private int code;

    private String msg;

    UserException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Wrapper get() {
        return null;
    }
}
