package com.example.book.controller;

import com.example.book.service.IBookService;
import com.example.book.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    IBookService iBookService;

    @Autowired
    IReceiptService iReceiptService;


}
