package com.alan.reader.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by alan on 17/3/14.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRead {

    private Integer userId;

    private String ISBN;

    private Date startDate;

    private Date endDate;

    private int socre;

    private String comments;

}
