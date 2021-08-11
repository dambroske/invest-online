package com.example.demo.web;

import com.example.demo.domain.AssessmentResponses;
import com.example.demo.domain.InvestorProfile;
import com.example.demo.domain.RiskScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller

public class RiskProfileResultController {

    @GetMapping("/result")
    public String riskProfileResult(Model model,
                                    @SessionAttribute("response")
                                            AssessmentResponses assessmentResponses,
                                    @SessionAttribute("riskScore")
                                                RiskScore riskScore){

        InvestorProfile investorProfile = new InvestorProfile();

        riskScore.updateRiskScore(assessmentResponses.getUpdatedScore());
        investorProfile.getInvestorDetailedProfile(riskScore.getRiskScore());

        assessmentResponses.resetResponses();
        model.addAttribute("riskScore", riskScore.getRiskScore());
        model.addAttribute("riskProfile", investorProfile.getRiskProfileName());

        return "riskProfileResult";
    }

}
