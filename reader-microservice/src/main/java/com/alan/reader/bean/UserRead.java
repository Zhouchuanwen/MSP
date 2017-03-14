package com.alan.reader.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private int socre;

    private String comments;

}
