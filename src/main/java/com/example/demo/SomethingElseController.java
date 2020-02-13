package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomethingElseController {

    @RequestMapping("/something-else")
    @ResponseBody
    public String index() {
        return "What is your name?";
    }
}
