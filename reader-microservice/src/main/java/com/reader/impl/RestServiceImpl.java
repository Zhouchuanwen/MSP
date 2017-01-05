package com.reader.impl;

import com.reader.bean.User;
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
    public String show() {
        return "hi,"+userRepo.test();
    }

    @Override
    public User BooksURead(String id) {
        System.out.println(id);
        User u=userRepo.getUserByStuId(id);
        System.out.println(u.getStuName());
        return u;
    }


}
