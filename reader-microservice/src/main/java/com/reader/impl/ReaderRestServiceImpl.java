package com.reader.impl;

import com.reader.bean.User;
import com.reader.model.UserReq;
import com.reader.repo.BookRepo;
import com.reader.repo.UserRepo;
import com.reader.service.ReaderRestServcie;
import com.reader.util.Wrapper;
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
