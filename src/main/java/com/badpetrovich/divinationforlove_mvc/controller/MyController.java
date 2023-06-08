package com.badpetrovich.divinationforlove_mvc.controller;

import com.badpetrovich.divinationforlove_mvc.model.Lover;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dfl")
public class MyController {

    @GetMapping("/first")
    public String welcomePage(){
        return "first_page";
    }
    @GetMapping("/starting")
    public String startingPage(Model model){

        model.addAttribute("firstLover", new Lover());
        model.addAttribute("secondLover", new Lover());
        model.addAttribute("thirdLover", new Lover());
        model.addAttribute("fourthLover", new Lover());

        return "starting_page";
    }

//    @GetMapping("/game")
//    public String gamePage(HttpServletRequest request, Model model){
//
//        String loverName = request.getParameter("firstName");
//        model.addAttribute("firstName", loverName);
//        loverName = request.getParameter("secondName");
//        model.addAttribute("secondName", loverName);
//        loverName = request.getParameter("thirdName");
//        model.addAttribute("thirdName", loverName);
//        loverName = request.getParameter("fourthName");
//        model.addAttribute("fourthName", loverName);
//        return "game_page";
//    }

    @GetMapping("/game")
    public String gamePage(@ModelAttribute("firstLover") Lover firstLover,
                           @ModelAttribute("secondLover") Lover secondLover,
                           @ModelAttribute("thirdLover") Lover thirdLover,
                           @ModelAttribute("fourthLover") Lover fourthLover){

        return "game_page";
    }
}
