package com.alan.book.config;

import com.alan.book.service.BookRestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 17/1/3.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(BookRestService.class);
    }
}