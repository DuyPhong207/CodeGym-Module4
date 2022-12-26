package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DictionaryController {
    private Dictionary dictionary = new Dictionary();
    @GetMapping("search")
    public String showForm() {
        return "/home";
    }

    @PostMapping("search")
    public String search(@RequestParam("english") String english, RedirectAttributes redirectAttributes) {
        String result = "Not found";
        if (dictionary.check(english) == null) {
            redirectAttributes.addFlashAttribute("result", result);
        } else {
            redirectAttributes.addFlashAttribute("result", dictionary.check(english));
        }
        return "redirect:/home";
    }
}
