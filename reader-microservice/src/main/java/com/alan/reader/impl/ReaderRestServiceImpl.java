package com.alan.reader.impl;

import com.alan.reader.bean.User;
import com.alan.reader.model.UserReq;
import com.alan.reader.repo.UserRepo;
import com.alan.reader.util.Wrapper;
import com.alan.reader.service.ReaderRestServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alan on 16/12/26.
 */

@Service
public class ReaderRestServiceImpl implements ReaderRestServcie {

    @Autowired
    private UserRepo userRepo;


    @Override
    public Wrapper test() {
        return Wrapper.builder().code(0).msg("SUCCESS").data("hi").build();
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

    @Override
    public Wrapper queryByPage(Integer p) {
        List<User> users = userRepo.findUserByPage(p);
        if (users != null)
            return Wrapper.builder().code(0).msg("SUCCESS").data(users).build();
        return Wrapper.ERROR;
    }













}
