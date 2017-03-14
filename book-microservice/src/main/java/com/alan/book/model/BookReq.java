package com.alan.book.model;

import com.alan.book.bean.Tag;
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
public class BookReq {

    private String ISBN;

    private String bookName;

    private String author;

    private Date publication;

    private String libraryAddress;

    private int num;

    private double score;

    private Tag tag;

}
