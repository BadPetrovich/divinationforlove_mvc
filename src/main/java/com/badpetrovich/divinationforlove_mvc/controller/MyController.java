package com.badpetrovich.divinationforlove_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcomePage(){
        return "first_page";
    }
    @GetMapping("/starting")
    public String startingPage(){
        return "starting_page";
    }

    @GetMapping("/game")
    public String gamePage(){
        return "game_page";
    }
}
