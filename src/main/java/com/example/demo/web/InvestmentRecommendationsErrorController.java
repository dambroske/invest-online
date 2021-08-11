package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InvestmentRecommendationsErrorController {
    @GetMapping("/error")
    public String investmentRecommendationsError(){

        return "error";

    }
}
