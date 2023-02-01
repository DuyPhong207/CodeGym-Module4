package com.example.musicapp.controller;

import com.example.musicapp.model.Song;
import com.example.musicapp.service.ISongService;
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
@RequestMapping("song")
public class SongController {
    @Autowired
    ISongService iSongService;

    @GetMapping("")
    public String showListUser(@PageableDefault(value = 20)Pageable pageable, Model model) {
        Page<Song> songPage = iSongService.findAll(pageable);
        model.addAttribute("songPage", songPage);
        return "/index";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("song") Song song, BindingResult bindingResult, RedirectAttributes
            redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        this.iSongService.save(song);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công!");
        return "redirect:/song";
    }
}
