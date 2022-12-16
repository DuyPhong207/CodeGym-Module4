package com.example.controller;

import com.example.model.Category;
import com.example.model.Product;
import com.example.service.CategoryService;
import com.example.service.Impl.CategoryServiceImpl;
import com.example.service.Impl.ProductServiceImpl;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService = new ProductServiceImpl();
    private CategoryService categoryService = new CategoryServiceImpl();

    @GetMapping("/list")
    public String list(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "/list";
    }

    @GetMapping("/edit")
    public String showEdit(Integer id, Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("productId", id);
        model.addAttribute("categoryList", categoryList);
        return "/edit";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "/create";
    }

    @PostMapping("/edit")
    public String edit(Product product, Integer categoryId) {
        Category category = categoryService.getById(categoryId);
        product.setCategory(category);
        productService.update(product.getId(), product);
        return "redirect:/product/list";
    }

    @PostMapping("/create")
    public String doCreate(Product product, Integer categoryId) {
        Category category = categoryService.getById(categoryId);
        product.setCategory(category);
        productService.save(product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        productService.delete(id);
        return "redirect:/product/list";
    }
}
