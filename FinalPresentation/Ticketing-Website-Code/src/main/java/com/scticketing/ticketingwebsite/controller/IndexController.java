package com.scticketing.ticketingwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("date", new Date());

        return "views/loginForm";
    }
}