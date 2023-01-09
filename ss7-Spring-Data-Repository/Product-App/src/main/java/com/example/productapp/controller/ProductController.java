package com.example.productapp.controller;

import com.example.productapp.model.Product;
import com.example.productapp.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/product")
@Transactional
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping("")
    public String index(@PageableDefault(5) Pageable pageable, Model model) {
        Page<Product> productList = productService.findAll(pageable);
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Create product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product);
        redirectAttributes.addFlashAttribute("success", "Update customer successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search")Optional<String> search, @PageableDefault(5) Pageable pageable, Model model) {
        Page<Product> products;
        if (search.isPresent()) {
            products = productService.findByName(search.get(), pageable);
        } else {
            products = productService.findAll(pageable);
        }
        model.addAttribute("products", products);
        return "index";
    }
}
