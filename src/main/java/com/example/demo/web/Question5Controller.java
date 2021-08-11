package com.example.demo.web;

import com.example.demo.domain.AssessmentResponses;
import com.example.demo.domain.RiskScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller

public class Question5Controller {
    @GetMapping("/fifth")
    public String questionFive(Model model,
                               @SessionAttribute("response")
                                       AssessmentResponses assessmentResponses){

        model.addAttribute("response",assessmentResponses);

        return "questionnaireQuestion5";

    }

    @PostMapping("/fifth")
    public String getQuestionResponse(@RequestParam(value = "option", required = true) String option,
                                      @SessionAttribute("response")
                                              AssessmentResponses assessmentResponses){
        if (option.equals("")){
            return "/fifth";
        } else {

            assessmentResponses.setQuestionFive(option);

            return "redirect:/sixth";
        }
    }

}
