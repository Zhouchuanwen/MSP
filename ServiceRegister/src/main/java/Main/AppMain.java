package Main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by alan on 16/12/26.
 */
@EnableEurekaServer
@SpringBootApplication
public class AppMain {
    public static void main(String[] args){
        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }
}
