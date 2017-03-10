package com.alan.reader.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.net.UnknownHostException;
import java.util.Arrays;

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
//        MongoCredential mongoCredential=MongoCredential.createMongoCRCredential(mongoProperties.getUsername(),mongoProperties.getDatabase(),mongoProperties.getPassword());
//        Mongo mg=new MongoClient(new ServerAddress(mongoProperties.getHost(),mongoProperties.getPort()), Arrays.asList(mongoCredential));
        return morphia.createDatastore((MongoClient) mongo,mongoProperties.getDatabase());
    }

}