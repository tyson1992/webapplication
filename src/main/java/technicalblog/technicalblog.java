package technicalblog;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import technicalblog.Controller.HomeController;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class technicalblog {

    public static void main(String [] args) throws Exception{

        SpringApplication.run(technicalblog.class,args);
    }
}
