import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by alan on 16/12/26.
 */
@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class AppMain {
    public static void main(String[] args){
        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }

}
