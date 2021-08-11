package com.example.demo.domain;

public class AssessmentResponses {

    private String[] responses = new String[6];

    public void setQuestionOne(String selectedOption) {
        this.responses[0] = selectedOption;
    }

    public void setQuestionTwo(String selectedOption) {
        this.responses[1] = selectedOption;
    }

    public void setQuestionThree(String selectedOption) {
        this.responses[2] = selectedOption;
    }

    public void setQuestionFour(String selectedOption) {
        this.responses[3] = selectedOption;
    }

    public void setQuestionFive(String selectedOption) {
        this.responses[4] = selectedOption;
    }

    public void setQuestionSix(String selectedOption) {
        this.responses[5] = selectedOption;
    }

    private int evaluateQuestionOne() {
        String selectedOption1 = this.responses[0];
        switch (selectedOption1) {
            case "lessThan18":
                return 10;

            case "18-40":
                return 8;

            case "40-50":
                return 6;

            case "50-60":
                return 4;

            default:
                return 2;
        }
    }

    public int evaluateQuestionTwo() {
        String selectedOption2 = this.responses[1];
        switch (selectedOption2) {
            case "lessThan1Lakh":
                return 2;

            case "1to5":
                return 4;

            case "5to10":
                return 6;

            case "10to30":
                return 8;

            default:
                return 10;
        }
    }

    public int evaluateQuestionThree() {
        String selectedOption3 = this.responses[2];
        switch (selectedOption3) {
            case "lessThan3":
                return 3;

            case "3to5":
                return 6;

            case "6to10":
                return 8;

            default:
                return 10;
        }
    }

    public int evaluateQuestionFour() {
        String selectedOption4 = this.responses[3];
        switch (selectedOption4) {
            case "lessThan2":
                return 3;

            case "2to5":
                return 6;

            case "6to10":
                return 8;

            default:
                return 10;
        }
    }

    public int evaluateQuestionFive() {
        String selectedOption5 = this.responses[4];
        switch (selectedOption5) {
            case "losing":
                return 3;

            case "losingOrGaining":
                return 7;

            default:
                return 10;
        }
    }

    public int evaluateQuestionSix() {
        String selectedOption6 = this.responses[5];
        switch (selectedOption6) {
            case "sellAll":
                return 3;

            case "sellSome":
                return 6;

            case "doNothing":
                return 8;

            default:
                return 10;
        }
    }

    public String[] getResponses() {
        return responses;
    }

    public void resetResponses() {
        this.responses = new String[6];
    }

    public int getUpdatedScore() {
        int riskScore = 0;
        riskScore += this.evaluateQuestionOne();
        riskScore += this.evaluateQuestionTwo();
        riskScore += this.evaluateQuestionThree();
        riskScore += this.evaluateQuestionFour();
        riskScore += this.evaluateQuestionFive();
        riskScore += this.evaluateQuestionSix();
        return riskScore;
    }


}
