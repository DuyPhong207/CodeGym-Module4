package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sandwich")
public class MainController {
    @GetMapping("")
    public String showForm() {
        return "/index";
    }

    @PostMapping("")
    public String save(@RequestParam(value = "lettuce", defaultValue = "") String lettuce,
                       @RequestParam(value = "tomato", defaultValue = "") String tomato,
                       @RequestParam(value = "mustard", defaultValue = "") String mustard,
                       @RequestParam(value = "sprouts", defaultValue = "") String sprouts, Model model) {
        model.addAttribute("result", lettuce + " " + tomato + " " + mustard
                + " " + sprouts);
        return "/index";
    }
}
