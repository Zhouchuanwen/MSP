package com.core;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.message.Message;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alan on 17/2/14.
 */
@Slf4j
@Configuration
public class AuthInterceptor extends AbstractPhaseInterceptor<Message> {

    public AuthInterceptor() {
        super(Phase.PRE_LOGICAL);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        String content=(String)message.get(Message.CONTENT_TYPE);
        String content1=(String)message.get(Message.REST_MESSAGE);
        System.out.println("===============================================>hi");
        System.out.println(content);
        System.out.println(content1);
        System.out.println((String)message.get(Message.MIME_HEADERS));
        System.out.println((String)message.get(Message.PATH_INFO));
    }
}
