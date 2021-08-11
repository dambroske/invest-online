package com.example.demo.domain;

public class RiskScore {

    private int riskScore;

    public int getRiskScore() {
        return riskScore;
    }

    public void updateRiskScore(int selectedOptionScore){

        this.riskScore = this.riskScore + selectedOptionScore;
    }

    public void resetRiskScore(){
        this.riskScore = 0;
    }

}
