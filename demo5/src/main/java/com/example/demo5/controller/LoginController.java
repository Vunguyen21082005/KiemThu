package com.example.demo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("login")
    public String login(Model model){
        return "login";
    }
    @PostMapping("ket_qua")
    public String hienThi(LoginRequit req,
                          Model model){
//        model.addAttribute("name",name);
//        model.addAttribute("pass",pass);
        model.addAttribute("req",req);
        return "ket_qua";


    }
}
