package com.example.demohello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class DemoHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHelloApplication.class, args);
    }
    @GetMapping(value = "/jsp")
    public String getJSPVue() { return "home"; }

    @GetMapping(value = "thymeleaf")
    public String getThymeleafVue() { return "thymeleaf/index"; }

}
