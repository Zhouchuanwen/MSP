package com.alan.reader.impl;

import com.alan.common.util.Wrapper;
import com.alan.reader.bean.User;
import com.alan.reader.model.UserReq;
import com.alan.reader.repo.UserRepo;
import com.alan.reader.service.ReaderRestServcie;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public Wrapper register(UserReq userReq) {
        if (userRepo.getUserByStuId(userReq.getStuId()) != null) {
            return Wrapper.builder().code(-1).msg("用户id已经存在").build();
        }

        User user = User.builder().stuName(userReq.getStuName()).stuId(userReq.getStuId()).stuType(userReq.getStuType())
                .idCard(userReq.getIdCard()).joinSchool(userReq.getJoinSchool()).sdept(userReq.getSdept())
                .phone(userReq.getPhone()).password(userReq.getPassword()).salt(userReq.getSalt())
                .gender(userReq.getGender()).email(userReq.getEmail()).rank(userReq.getRank())
                .major(userReq.getMajor()).register(new Date()).build();
        user.secure();
        if (userRepo.create(user) != null) {
            return Wrapper.builder().code(0).msg("SUCCESS").data(user).build();
        }
        return Wrapper.ERROR;
    }

    @Override
    public Wrapper delete(UserReq userReq) {
        if (userRepo.getUserByStuId(userReq.getStuId()) == null) {
            return Wrapper.builder().code(-1).msg("删除失败，用户不存在!").build();
        }
        userRepo.delete(userReq.getStuId());
        return Wrapper.SUCCESS;
    }

    @Override
    public Wrapper updateUser(UserReq userReq) {
        return Wrapper.builder().code(0).msg("更新用户信息成功").data(true).build();
    }

    @Override
    public Wrapper userLogin(UserReq userReq) {
        String password = userReq.getPassword();
        User user = userRepo.getUserByStuId(userReq.getStuId());
        if (!Strings.isNullOrEmpty(password) && user.checkCredentials(password)) {
            return Wrapper.SUCCESS;
        }
        return Wrapper.ERROR;
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
