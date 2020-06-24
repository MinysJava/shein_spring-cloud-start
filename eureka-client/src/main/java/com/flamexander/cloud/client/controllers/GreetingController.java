package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.client.entites.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    User greeting1();

    @RequestMapping("/greeting2")
    String greeting2();

    @RequestMapping("/id")
    void getIdByValue(@RequestParam("id") String fileName);
}
