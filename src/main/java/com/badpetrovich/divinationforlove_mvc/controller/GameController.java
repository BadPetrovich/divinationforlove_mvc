package com.badpetrovich.divinationforlove_mvc.controller;

import com.badpetrovich.divinationforlove_mvc.model.Lover;
import com.badpetrovich.divinationforlove_mvc.service.LoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private LoverService loverService;

    @GetMapping("/game")
    public String findAll(Model model){
        List<Lover> lovers = loverService.findAll();
        Collections.shuffle(lovers);
        model.addAttribute("lovers",lovers);
        return "game";
    }

    @GetMapping("/lover-delete/{id}")
    public String deleteLoverFromGame(@PathVariable("id") Integer id, Model model) throws Exception {
        loverService.deleteById(id);
        return "redirect:/game";
    }


//    @GetMapping("/lover-update/{id}")
//    public String updateLoverForm(@PathVariable("id") Integer id, Model model) throws Exception {
//        Lover lover = loverService.findById(id);
//        model.addAttribute("lover",lover);
//        return "/lover-update";
//    }
//
//    @PostMapping("/lover-update")
//    public String updateLover(Lover lover){
//        loverService.saveLover(lover);
//        return "redirect:/lovers";
//    }
//
//
//
//    @GetMapping("/first")
//    public String welcomePage(){
//        return "first_page";
//    }
}
