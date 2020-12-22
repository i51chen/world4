package com.world4.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class World4Application {

    public static void main(String[] args) {
        SpringApplication.run(World4Application.class, args);
    }

    @GetMapping("/")
    public String demo() {
        return "Hello World  4444!";
    }

}
