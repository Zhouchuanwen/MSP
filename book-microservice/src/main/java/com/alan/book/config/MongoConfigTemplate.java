package com.alan.book.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.net.UnknownHostException;

/**
 * Created by alan on 17/1/7.
 */
@Component
public class MongoConfigTemplate {

    @Inject
    private Mongo mongo;

    @Inject
    private MongoProperties mongoProperties;

    public Datastore get() throws UnknownHostException {
        Morphia morphia = new Morphia();
        return morphia.createDatastore((MongoClient) mongo, mongoProperties.getDatabase());
    }

}