package com.example.demo.domain;

public class InvestorProfile {

    private String riskProfileName;
    private String riskProfileRecommendation;
    private String debitRecommendation;
    private String equityRecommendation;

    public String getRiskProfileName() {
        return riskProfileName;
    }

    public String getRiskProfileRecommendation() {
        return riskProfileRecommendation;
    }

    public String getDebitRecommendation() {
        return debitRecommendation;
    }

    public String getEquityRecommendation() {
        return equityRecommendation;
    }

    public void getInvestorDetailedProfile(int riskScore){

        if (riskScore >= 16 && riskScore <=22){

            this.riskProfileName = "Conservative";
            this.riskProfileRecommendation = "Investment Strategy should be conservative, " +
                                               "with entire amount invested in Debt funds";
            this.debitRecommendation = "100";
            this.equityRecommendation = "0";

        } else if (riskScore >= 23 && riskScore <= 32){

            this.riskProfileName = "Moderately Conservative";
            this.riskProfileRecommendation = "Investment Strategy should be moderately conservative, " +
                                             "with 80% of investment in debt funds and 20% in equity funds";
            this.debitRecommendation = "80";
            this.equityRecommendation = "20";

        } else if (riskScore >= 33 && riskScore <=42){

            this.riskProfileName = "Moderate";
            this.riskProfileRecommendation = "Investment Strategy should be moderate, " +
                                            "with 50% of investment in debt funds and 50% in equity funds";
            this.debitRecommendation = "50";
            this.equityRecommendation = "50";

        } else if (riskScore >= 43 && riskScore <= 52){

            this.riskProfileName = "Moderately Aggressive";
            this.riskProfileRecommendation = "Investment Strategy should be moderately aggressive, " +
                                         "with 20% of investment in debt funds and 80% in equity funds";
            this.debitRecommendation = "20";
            this.equityRecommendation = "80";

        } else {

            this.riskProfileName = "Aggressive";
            this.riskProfileRecommendation = "Investment Strategy should be aggressive, " +
                                         "with 0% of investment in debt funds and 100% in equity funds";
            this.debitRecommendation = "0";
            this.equityRecommendation = "100";

        }
    }
}
