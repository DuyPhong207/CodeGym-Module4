package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("shop")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart createCart() {
        return new Cart();
    }

    @GetMapping("/addProduct/{id}")
    public String addProduct(@PathVariable Integer id, @ModelAttribute("cart") Cart cart, Model model) {
        Product product = iProductService.findById(id);
        cart.addProduct(product);
        List<Product> products = cart.getListProductInCart();
        model.addAttribute("products", products);
        Integer totalPay = cart.totalPay();
        model.addAttribute("totalPay", totalPay);
        return "/cart";
    }

    @GetMapping("")
    public String showListProduct(Model model) {
        model.addAttribute("products", iProductService.findAll());
        return "/list-product";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/detail-product";
    }
}
