package com.example.demo.web;

import com.example.demo.domain.InvestorProfile;
import com.example.demo.domain.RiskScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller

public class InvestmentRecommendationsController {

    @GetMapping("/summary")
    public String investmentRecommendations(Model model,
                                            @SessionAttribute("riskScore")
                                            RiskScore riskScore){


        InvestorProfile investorProfile = new InvestorProfile();
        investorProfile.getInvestorDetailedProfile(riskScore.getRiskScore());

        model.addAttribute("investorProfile", investorProfile);

        return "investmentRecommendations";
    }
}
