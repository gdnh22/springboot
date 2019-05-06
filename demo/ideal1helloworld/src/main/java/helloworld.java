//https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-pom
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class helloworld {
    @RequestMapping("/")
    String home() {
        return "Hello World! Call me Fengge";
    }
    public static void main(String[] args) {
        SpringApplication.run(helloworld.class, args);   //声明这是一个springboot程序，会启用内置的tomcat
    }

}