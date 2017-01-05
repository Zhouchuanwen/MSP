package com.reader.impl;

import com.reader.bean.User;
import com.reader.core.Wrapper;
import com.reader.repo.UserRepo;
import com.reader.service.RestServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by alan on 16/12/26.
 */

@Service
public class RestServiceImpl implements RestServcie {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Wrapper show() {
        String test="hi,"+userRepo.test();
        return Wrapper.SUCCESS;
    }

    @Override
    public Wrapper BooksURead(String id) {
        System.out.println(id);
        User user=userRepo.getUserByStuId(id);
        if(user!=null){
            return Wrapper.builder().code(0).msg("SUCCESS").data(user).build();
        }
        return Wrapper.ERROR;
    }


}
