package com.repo;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
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

}
