package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("cart")
@RequestMapping("/shop")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart setUpProduct() {
        return new Cart();
    }

    @GetMapping("")
    public String showShop(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/home";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Integer id, @ModelAttribute("cart") Cart cart, )
}
