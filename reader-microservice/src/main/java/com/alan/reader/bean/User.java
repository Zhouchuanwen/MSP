package com.alan.reader.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.alan.reader.util.Encoder;
import lombok.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created by alan on 16/12/26.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User{

    private Integer readerId;

    private String stuName;

    private String stuId;

    /**
     * 身份证号
     */
    @JsonProperty("identity")
    private String idCard;

    /**
     * 1:男，0:女
     */
    private int gender;

    /**
     * 入学时间
     */
    @JsonProperty("schoolYear")
    private Date joinSchool;

    /**
     * 学生院系
     */
    @JsonProperty("dept")
    private String sdept;

    /**
     * 学生教育类型
     */
    @JsonProperty("eduType")
    private String stuType;

    private String major;

    private String phone;

    private String email;

    private int rank;

    /**
     * 用户角色 0:普通用户 1:图书管理员 2:系统管理员
     */
    private int role;

    /**
     * 是否可用：0代表状态正常，1代表已经删除,2代表禁用;
     */
    private int mask;

    private Date register;

    @Getter(onMethod = @__(@JsonIgnore))
    private String password;

    @Getter(onMethod = @__(@JsonIgnore))
    private String salt;

    public boolean checkCredentials(String password) {
        String credentials = secure(password, this.salt);
        return this.password.equals(credentials);
    }

    public void secure() {
        salt = Encoder.random();
        password = secure(password, salt);
    }

    private String secure(String password, String salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

}
