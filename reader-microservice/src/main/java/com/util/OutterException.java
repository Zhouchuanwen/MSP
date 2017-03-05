package com.util;

/**
 * Created by alan on 17/2/15.
 */
public class OutterException extends RuntimeException implements WrapperProvider{

    private Wrapper wrapper;

    public OutterException(int code,String msg){
        this(Wrapper.builder().code(code).msg(msg).build());
    }

    public OutterException(int code,String msg,String des){
        this(Wrapper.builder().code(code).msg(msg).description(des).build());
    }

    public OutterException(Wrapper wrapper){
        this.wrapper=wrapper;
    }

    public OutterException(WrapperProvider wrapperProvider){
        this.wrapper=wrapperProvider.get();
    }

    @Override
    public Wrapper get() {
        return wrapper;
    }
}
