package com.example.validateform.controller;

import com.example.validateform.model.User;
import com.example.validateform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService iUserService;

    @GetMapping("")
    public String showListUser(@PageableDefault(value = 20)Pageable pageable, Model model) {
        Page<User> userPageable = iUserService.findAll(pageable);
        model.addAttribute("userPage", userPageable);
        return "/index";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("user", new User());
        return "/create";
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes
                           redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        this.iUserService.save(user);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công!");
        return "redirect:/user";
    }
}
