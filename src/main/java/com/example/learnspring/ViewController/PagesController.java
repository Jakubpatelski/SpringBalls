package com.example.learnspring.ViewController;

import org.springframework.web.bind.annotation.GetMapping;

public class PagesController {

    @GetMapping("/")
    public String frontPage(){
        return "index";
    }
}
