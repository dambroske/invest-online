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

public class Question6Controller {
    @GetMapping("/sixth")
    public String questionSix(Model model,
                              @SessionAttribute("response")
                                      AssessmentResponses assessmentResponses){

        model.addAttribute("response",assessmentResponses);

        return "questionnaireQuestion6";

    }

    @PostMapping("/sixth")
    public String getQuestionResponse(@RequestParam(value = "option", required = true) String option,
                                      @SessionAttribute("response")
                                              AssessmentResponses assessmentResponses){
        if (option.equals("")){
            return "/sixth";
        } else {

            assessmentResponses.setQuestionSix(option);

            return "redirect:/result";
        }
    }

}
