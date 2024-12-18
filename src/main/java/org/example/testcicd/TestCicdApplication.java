package org.example.testcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestCicdApplication {
    @GetMapping("/test")
    public String test(){
        return "test CICD is working";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestCicdApplication.class, args);
    }

}
