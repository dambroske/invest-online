package com.example.demo.web;

import com.example.demo.domain.AssessmentResponses;
import com.example.demo.domain.InvestorProfile;
import com.example.demo.domain.RiskScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"response", "riskScore"})

public class Question1Controller {
    @GetMapping("/questionnaire")
    public String questionOne(Model model,
                              @SessionAttribute(value = "response", required = false)
                                      AssessmentResponses assessmentResponses){

        if (assessmentResponses == null){
            assessmentResponses = new AssessmentResponses();
            model.addAttribute("response",assessmentResponses);
        }

        return "questionnaireQuestion1";

    }

    @PostMapping("/questionnaire")
    public String getQuestionResponse(@RequestParam(value = "option", required = true) String option,
                                      Model model,
                                      @SessionAttribute(value = "response", required = false)
                                                  AssessmentResponses assessmentResponses,
                                      @SessionAttribute(value = "riskScore", required = false)
                                                  RiskScore riskScore){

        if (option.equals("")){
            return "/questionnaire";
        } else {
            if (assessmentResponses == null){
                assessmentResponses = new AssessmentResponses();
                model.addAttribute("response",assessmentResponses);
            }

            if (riskScore == null){
                riskScore = new RiskScore();
                model.addAttribute("riskScore",riskScore);
            }

            if (riskScore.getRiskScore() > 0){
                riskScore.resetRiskScore();
                assessmentResponses.resetResponses();
            }

            assessmentResponses.setQuestionOne(option);

            return "redirect:/second";
        }
    }
}
