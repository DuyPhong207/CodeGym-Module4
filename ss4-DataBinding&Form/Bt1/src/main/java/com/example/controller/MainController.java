package com.example.controller;

import com.example.model.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/setting")
public class MainController {

    @GetMapping("")
    public String showUpdate(Model model) {
        model.addAttribute("configuration", new Configuration());
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("configuration") Configuration configuration, Model model) {
        model.addAttribute("language", configuration.getLanguage());
        model.addAttribute("pageSize", configuration.getPageSize());
        model.addAttribute("spamsFilter", configuration.getSpamsFilter());
        model.addAttribute("signature", configuration.getSignature());
        return "/result";
    }
}
