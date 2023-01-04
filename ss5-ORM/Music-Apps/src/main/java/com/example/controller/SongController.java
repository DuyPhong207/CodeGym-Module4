package com.example.controller;

import com.example.model.Song;
import com.example.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("")
    public String index(Model model) {

        List<Song> productList = songService.findAll();
        model.addAttribute("songs", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Song song, RedirectAttributes redirectAttributes) {
        song.setId((int) (Math.random() * 10000));
        songService.save(song);
        redirectAttributes.addFlashAttribute("success", "Create song successfully!");
        return "redirect:/song";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Song song, RedirectAttributes redirectAttributes) {
        songService.update(song);
        redirectAttributes.addFlashAttribute("success", "Update song successfully!");
        return "redirect:/song";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Song song, RedirectAttributes redirect) {
        songService.remove(song.getId());
        redirect.addFlashAttribute("success", "Removed song successfully!");
        return "redirect:/song";
    }

}
