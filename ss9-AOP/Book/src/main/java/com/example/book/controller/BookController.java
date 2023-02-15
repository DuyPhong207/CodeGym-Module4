package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.Receipt;
import com.example.book.service.IBookService;
import com.example.book.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    IBookService iBookService;

    @Autowired
    IReceiptService iReceiptService;

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("book", new Book());
        return "/create";
    }

    @GetMapping("")
    public String index(Model model, Pageable pageable) {
        Page<Book> books = iBookService.findAll(pageable);
        model.addAttribute("books", books);
        return "/index";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes, Model model) {
        this.iBookService.save(book);
        redirectAttributes.addFlashAttribute("msg", "Successfully!");
        return "redirect:/book";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("book", iBookService.findById(id));
        return "/view";
    }

    @GetMapping("/{id}/borrow")
    public String showBorrow(@PathVariable int id, Model model) {
        model.addAttribute("book", iBookService.findById(id));
        model.addAttribute("receipt", new Receipt());
        return "/borrow";
    }
}
