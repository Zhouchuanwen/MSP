package com.alan.book.repo;


import com.alan.book.bean.Book;
import com.google.common.base.Strings;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alan on 17/2/22.
 */

@Repository
public class BookRepo {

    @Inject
    private MongoTemplate mongoTemplate;

    public List<Book> findBelow() {

        mongoTemplate.find(new Query(Criteria.where("bookName").is("鲁滨逊漂流记")), Book.class).stream().forEach(i->{
            System.out.println(i);
        });

        BasicQuery query1 = new BasicQuery("{num:{$gt:10}}");
        mongoTemplate.find(query1, Book.class).stream().forEach(i->{
            System.out.println(i);
        });

        BasicQuery query2 = new BasicQuery("{num:{$lt:10}}");
        mongoTemplate.find(query2, Book.class).stream().forEach(i->{
            System.out.println(i);
        });

        return mongoTemplate.findAll(Book.class);
    }


    public List<Book> selectByName(String bookName) {
        BasicQuery query = new BasicQuery("{bookName:" + bookName + "}");
        return mongoTemplate.find(query, Book.class);
    }


    public List<Book> selectByTag(String tag) {
        BasicQuery query = new BasicQuery("{tag:" + tag + "}");
        return mongoTemplate.find(query, Book.class);
    }


    public List<Book> selectByAuthor(String author) {
        BasicQuery query = new BasicQuery("{author:" + author + "}");
        return mongoTemplate.find(query, Book.class);
    }


    public Book selectByISBN(String isbn) {
        BasicQuery query = new BasicQuery("{ISBN:" + isbn + "}");
        return mongoTemplate.findOne(query, Book.class);
    }


    public boolean saveBook(Book book) {
        try {
            mongoTemplate.save(book);
            return true;
        } catch (DataAccessException e) {
            return false;
        }
    }

    public boolean deleteByISBN(String ISBN) {
        try {
            Book book = selectByISBN(ISBN);
            if (!Strings.isNullOrEmpty(ISBN) && book != null) {
                mongoTemplate.remove(book);
                return true;
            }
        } catch (DataAccessException e) {
            return false;
        }
        return false;
    }


    @Transactional
    public boolean updateBook(Book book) {
        try {
            if (deleteByISBN(book.getISBN())) {
                return saveBook(book);
            }
            return false;
        } catch (DataAccessException e) {
            return false;
        }
    }


    public List<Book> selectBookByKey(String key) {
        List<Book> books = new ArrayList<>();
        try {
            Criteria criteria = new Criteria();
            criteria.orOperator(
                    Criteria.where("bookName").regex(".*?" + key + ".*"), Criteria.where("author").regex(".*?" + key + ".*")
                    , Criteria.where("libraryAddress").regex(".*?" + key + ".*"), Criteria.where("tag").regex(".*?" + key + ".*")
                    , Criteria.where("isbn").is(key)
            );
            books = mongoTemplate.find(new Query(criteria), Book.class);
        } catch (DataAccessException e) {
        }
        return books;
    }

}
