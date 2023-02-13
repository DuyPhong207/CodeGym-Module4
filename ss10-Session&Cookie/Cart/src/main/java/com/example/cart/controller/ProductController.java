package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("shop")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Map<Product, Integer> createCart() {
        return (Map<Product, Integer>) new Cart();
    }

    @GetMapping("/addProduct/{id}")
    public String addProduct(@PathVariable Integer id, @ModelAttribute("cart") Cart cart, Model model) {
        Product product = iProductService.findById(id);
        cart.addProduct(product);
        model.addAttribute("cart", cart);
        return "cart";
    }

    @GetMapping("")
    public String showListProduct(Model model) {
        model.addAttribute("products", iProductService.findAll());
        return "/list-product";
    }
}
