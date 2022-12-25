package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import com.example.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService service = new ProductServiceImpl();

    @GetMapping("")
    public String index(Model model) {
        List<Product> products = service.findAll();
        model.addAttribute("products", products);
        return "/index";
    }
}
