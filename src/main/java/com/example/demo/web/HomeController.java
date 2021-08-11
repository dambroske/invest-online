package com.example.demo.web;

import com.example.demo.domain.Investor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/home")
    public String homePage(Model model){

        Investor investorInformation = new Investor();

        model.addAttribute("investor", investorInformation);

        return "homePage";
    }
}
