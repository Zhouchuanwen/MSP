package com.alan.book.impl;

import com.alan.book.bean.Book;
import com.alan.book.model.BookReq;
import com.alan.book.service.BookRestService;
import com.alan.book.repo.BookRepo;
import com.alan.common.util.Wrapper;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alan on 17/3/9.
 */
@Service
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

    @Override
    public Wrapper up(BookReq bookReq) {
        Book book = Book.builder().author(bookReq.getAuthor())
                .bookName(bookReq.getBookName())
                .ISBN(bookReq.getISBN())
                .libraryAddress(bookReq.getLibraryAddress())
                .publication(bookReq.getPublication())
                .tag(bookReq.getTag()).build();
        if (bookRepo.saveBook(book)) {
            return Wrapper.SUCCESS;
        }
        return Wrapper.ERROR;
    }

    @Override
    public Wrapper down(String isbn) {
        if (bookRepo.deleteByISBN(isbn)) {
            return Wrapper.SUCCESS;
        }
        return Wrapper.ERROR;

    }

    @Override
    public Wrapper update(BookReq bookReq) {
        if (Strings.isNullOrEmpty(bookReq.getISBN()) && selectByISBN(bookReq.getISBN()) != null) {
            Book book = Book.builder().author(bookReq.getAuthor())
                    .bookName(bookReq.getBookName())
                    .ISBN(bookReq.getISBN())
                    .libraryAddress(bookReq.getLibraryAddress())
                    .publication(bookReq.getPublication())
                    .tag(bookReq.getTag()).build();
            if (bookRepo.updateBook(book))
                return Wrapper.builder().code(0).msg("SUCCESS").data(book).build();

            return Wrapper.ERROR;
        }
        return Wrapper.ERROR;
    }

    @Override
    public Wrapper selectByISBN(String ISBN) {
        Book book = bookRepo.selectByISBN(ISBN);
        return book != null ? Wrapper.builder().code(0).msg("SUCCESS").data(book).build() : Wrapper.ERROR;
    }




    /**
     * 按照 mongodb regx 检索,对关键字段检索
     * @param key
     * @return
     */
    @Override
    public Wrapper selectBookByKey(String key) {
        if (Strings.isNullOrEmpty(key)) {
            return Wrapper.ERROR;
        }
        return Wrapper.builder().code(0).msg("SUCCESS").data(bookRepo.selectBookByKey(key)).build();
    }
}
