package com.validate.springvalidation.controller;

import com.validate.springvalidation.entity.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping(value = "/form")
    public String openForm(Model model)
    {
        System.out.println("Opening form");
        model.addAttribute("logindata",new LoginData());
        return "form";
    }


    //handler for processing form
    @PostMapping(value = "/process")
    public String processForm(@ModelAttribute("loginData") LoginData loginData )
    {
        System.out.println(loginData);
        return "success";
    }
}
