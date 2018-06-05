package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/helloworld")
public class HelloworldController {

    @GetMapping
    public String get() {
        return "helloworld";
    }

}
