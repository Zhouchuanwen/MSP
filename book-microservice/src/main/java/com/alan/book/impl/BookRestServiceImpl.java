package com.alan.book.impl;

import com.alan.book.bean.Book;
import com.alan.book.service.BookRestService;
import com.alan.book.repo.BookRepo;
import com.alan.reader.util.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alan on 17/3/9.
 */
public class BookRestServiceImpl implements BookRestService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Wrapper test() {
        return Wrapper.builder().code(0).data("hi,book").msg("SUCCESS").build();
    }

    @Override
    public Wrapper testMongo() {
        List<Book> books = bookRepo.findBelow();
        if (books != null) {
            return Wrapper.builder().code(0).data(bookRepo.findBelow()).msg("SUCCESS").build();
        }
        return Wrapper.ERROR;
    }
}
