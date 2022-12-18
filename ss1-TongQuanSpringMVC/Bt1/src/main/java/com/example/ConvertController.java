package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ConvertController {
    @GetMapping("convert")
    public String showForm() {
        return "/convert";
    }

    @PostMapping("convert")
    public String convert(@RequestParam(value = "usd") String usd, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("usd", usd);
        redirectAttributes.addFlashAttribute("vnd", Integer.parseInt(usd) * 23000);
    return "redirect:/convert";
    }
}
