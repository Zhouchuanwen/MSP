package com.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by alan on 17/1/3.
 */

@Document(collection = "test")
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

    private int num;

    //书籍评分
    private double score;

    //书籍类型
    private Tag tag;

}
