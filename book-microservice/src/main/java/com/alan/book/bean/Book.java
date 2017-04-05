package com.alan.book.bean;

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

    /**
     * 出版日期
     */
    private Date publication;

    private String libraryAddress;

    /**
     * 书籍类型
     */
    private String tag;


    /**
     * 剩余数量
     */
    private int num;

    /**
     * 图片地址
     */
    private String url;

}
