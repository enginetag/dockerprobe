package com.example.dockerprobe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@RequestMapping(path = "/api")
public class SomeController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        LocalTime now = LocalTime.now();

        System.err.println("ERROR");
        System.out.println("> " + now);

        return "hello docker @ " + now;
    }
}
