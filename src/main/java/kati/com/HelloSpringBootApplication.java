package kati.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class HelloSpringBootApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello SpringBoot!";
    }

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringBootApplication.class, args);

    }
}
