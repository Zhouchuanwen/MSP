package com.reader.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alan on 16/12/26.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User{

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
     * 是否可用：0代表状态正常，1代表已经删除,2代表禁用;
     */
    private int mask;

}
