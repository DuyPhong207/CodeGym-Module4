package com.example.furamaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/furama")
public class MainController {
    @GetMapping("")
    public String showHome() {
        return "/home";
    }
}
