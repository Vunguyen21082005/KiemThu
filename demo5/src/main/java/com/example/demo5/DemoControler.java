package com.example.demo5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//Để đánh dấu lầ 1 bean thì sẽ đc đánh dấu bằng các annotation :@
//Tat ca cac ham trong controler luon luon tra vef string
@Controller
public class DemoControler {
    @GetMapping("demo")
    public String demo(Model model){
//        Đây là giá trị từ controler đến html
//      addAtribiu
        model.addAttribute("mess","demo");
        return "demo";

    }

}
