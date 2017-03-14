package com.alan.reader.model;

import lombok.*;

import java.util.Date;

/**
 * Created by alan on 17/1/17.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {

    private int readerId;

    private String stuName;

    private String stuId;

    private String idCard;

    private int gender;

    private Date joinSchool;

    private String sdept;

    private String stuType;

    private String major;

    private String phone;

    private String email;

    private int rank;

    private int mask;

    private Date register;

    private String password;

    private String salt;

}
