package com.reader.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Created by alan on 17/1/3.
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StuBook {

    private String studId;

    private List<Book> visited;

}
