package com.impl;

import com.bean.User;
import com.model.UserReq;
import com.repo.BookRepo;
import com.repo.UserRepo;
import com.service.ReaderRestServcie;
import com.util.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by alan on 16/12/26.
 */

@Service
public class ReaderRestServiceImpl implements ReaderRestServcie {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Wrapper test() {
        return Wrapper.builder().code(0).msg("SUCCESS").data("hi").build();
    }

    @Override
    public Wrapper testMongo() {
        return Wrapper.builder().code(0).msg("SUCCESS").data(bookRepo.findBelow()).build();
    }

    @Override
    public Wrapper userLogin(UserReq userReq) {
        return null;
    }

    @Override
    public Wrapper userInfo(String id) {
        User user=userRepo.getUserByStuId(id);
        if(user!=null){
            return Wrapper.builder().code(0).msg("SUCCESS").data(user).build();
        }
        return Wrapper.ERROR;
    }

}
