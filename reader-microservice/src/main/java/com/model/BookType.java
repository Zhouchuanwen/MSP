package com.model;


import com.util.Wrapper;
import com.util.WrapperProvider;

/**
 * Created by alan on 17/2/27.
 */

public enum BookType implements WrapperProvider{

    Wenxue(1,"");

    private int code;
    private String type;


    BookType(int code,String type){
        this.code=code;
        this.type=type;
    }


    @Override
    public Wrapper get() {
        return Wrapper.builder().code(code).msg(type).build();
    }

}
