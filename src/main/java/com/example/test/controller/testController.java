package com.example.test.controller;

import com.example.test.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/")
    public String home(){
        return "start";
    }

    @GetMapping("/loginform")
    public String loginform(Model model){
        model.addAttribute("loginDTO",new LoginDTO());
        return "login";
    }

    @PostMapping("/login")
    public String login(LoginDTO loginDTO){
        System.out.println(loginDTO.getId());
        //System.out.println(loginDTO.getPassword());
        return "redirect:/";
    }
}
