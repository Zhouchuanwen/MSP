package com.reader.config;

import com.reader.service.RestServcie;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 17/1/3.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(RestServcie.class);
    }
}