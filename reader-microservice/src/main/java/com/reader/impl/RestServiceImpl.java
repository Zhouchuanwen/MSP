package com.reader.impl;

import com.reader.service.BookService;
import com.reader.service.RestServcie;
import com.reader.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by alan on 16/12/26.
 */

@Service
public class RestServiceImpl implements RestServcie {


    @Autowired
    private TestService testService;

    @Autowired
    private BookService bookService;

    @Override
    public String show() {
        System.out.println("service touched");
        return "hi";
    }

    @Override
    public String BooksURead(String id) {
        return bookService.getBooksBystuId(id);
    }

    @Override
    public String TestQuery() {
        return testService.addTime();
    }


}
