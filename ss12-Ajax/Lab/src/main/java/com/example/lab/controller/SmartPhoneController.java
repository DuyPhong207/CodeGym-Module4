package com.example.lab.controller;

import com.example.lab.model.SmartPhone;
import com.example.lab.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService iSmartPhoneService;

    @PostMapping
    public ResponseEntity<SmartPhone> createSmartphone(@RequestBody SmartPhone smartphone) {
        return new ResponseEntity<>(iSmartPhoneService.save(smartphone), HttpStatus.CREATED);
    }
    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("smartphones", iSmartPhoneService.findAll());
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView getSmartphoneEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("smartphone", iSmartPhoneService.findAllById(id));
        return modelAndView;
    }

    @PostMapping("/save")
    public String updateSmartphone(@RequestBody SmartPhone smartphone) {
        iSmartPhoneService.save(smartphone);
        return "redirect:/smartphones/list";
    }

    @GetMapping
    public ResponseEntity<Iterable<SmartPhone>> allPhones() {
        return new ResponseEntity<>(iSmartPhoneService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SmartPhone> deleteSmartphone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = iSmartPhoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iSmartPhoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }
}
