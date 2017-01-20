package com.reader.impl;

import com.reader.bean.User;
import com.reader.core.Wrapper;
import com.reader.model.UserReq;
import com.reader.repo.UserRepo;
import com.reader.service.ReaderRestServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

}
