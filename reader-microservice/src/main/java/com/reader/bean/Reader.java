package com.reader.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by alan on 16/12/26.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reader {

    private String stuName;

    private String stuId;

    /**
     * 身份证号
     */
    private String idCard;

    private int gender;

    /**
     * 入学时间
     */
    private String joinSchool;

    /**
     * 学生院系
     */
    private String sdept;

    /**
     * 学生教育类型
     */
    private String stuType;

    private String major;

    private String phone;

    private String email;

}
