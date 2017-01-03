package com.reader.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by alan on 17/1/3.
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String ISBN;

    private String bookName;

    private String author;

    private Date startDate;

    private Date endDate;

    private String libraryAddress;

}
