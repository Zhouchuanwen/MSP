package com.alan.reader.service;

import com.alan.common.util.Encoder;
import com.alan.common.util.OutterException;
import com.alan.reader.bean.User;
import com.alan.reader.repo.UserRepo;
import com.google.common.base.Strings;
import com.alan.reader.core.UserException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by alan on 17/2/20.
 */
@Component
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private static Pattern VERIFY_PASSWORD_MATCHER = Pattern.compile("^\\S{6,20}$");
    private static Pattern VERIFY_PHONE = Pattern.compile("^((1[3,5,8][0-9])|(14[5,7])|(17[0,1,6,7,8]))\\d{8}$");
    private static final String secretKey = "aemI2ZfRnbm";


    public User create(User user) {
        if (Strings.isNullOrEmpty(user.getStuName())) {
            throw new OutterException(UserException.MISSING_PARAMETER);
        }
        if (Strings.isNullOrEmpty(user.getPassword())) {
            throw new OutterException(UserException.MISSING_PARAMETER);
        }
        User exists = userRepo.getUserByStuId(user.getStuId());
        if (exists != null) {
            throw new OutterException(UserException.USER_ALREADY_EXIST);
        }
        if (!VERIFY_PASSWORD_MATCHER.matcher(user.getPassword()).matches()) {
            throw new OutterException(UserException.INVALID_USER_PASS);
        }
        user.secure();
        return userRepo.create(user);
    }

    public User findUserById(String stuId) {
        return userRepo.getUserByStuId(stuId);
    }

    public User findUserByName(String userName) {
        return userRepo.getUserByStuName(userName);
    }

    public boolean isLibriran(Integer readerId) {
        User user = userRepo.getLibriranByReaderId(readerId);
        return user != null;
    }

    public boolean isSuperUser(Integer readerId) {
        User user = userRepo.getSuperUserByReaderId(readerId);
        return user != null;
    }

    public static String getAccessToken(User user) {
        JwtBuilder builder = Jwts.builder().setId(Encoder.random())
                .setExpiration(getExpireDate()).signWith(SignatureAlgorithm.HS256, secretKey);
        builder.claim("uid", user.getStuId());
        return builder.compact();
    }

    public static String getRefreshTokenByUser(User user) {
        String accessToken = Encoder.random();
        return accessToken;
    }

    private static Date getExpireDate() {
        return new Date(System.currentTimeMillis() + 30 * 3600 * 1000);
    }


    public void sayHello() {
        System.out.println("hello.......!!!!!!!!");
    }

}
