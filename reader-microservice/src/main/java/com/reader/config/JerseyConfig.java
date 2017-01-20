package com.reader.config;

import com.reader.service.ReaderRestServcie;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 17/1/3.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(ReaderRestServcie.class);
    }
}