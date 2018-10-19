package com.company;

public class Skill {
    private String fundamental;
    private String novice;
    private String intermidiate;
    private String advanced;

    public Skill(){
    }

    public Skill(String fundamental, String novice, String intermidiate, String advanced){
        this.fundamental = fundamental;
        this.novice = novice;
        this.intermidiate = intermidiate;
        this.advanced = advanced;

    }

    public String getFundamental() {
        return fundamental;
    }

    public void setFundamental(String fundamental) {
        this.fundamental = fundamental;
    }

    public String getNovice() {
        return novice;
    }

    public void setNovice(String novice) {
        this.novice = novice;
    }

    public String getIntermidiate() {
        return intermidiate;
    }

    public void setIntermidiate(String intermidiate) {
        this.intermidiate = intermidiate;
    }

    public String getAdvanced() {
        return advanced;
    }

    public void setAdvanced(String advanced) {
        this.advanced = advanced;
    }

    public String toString() {
        return "Advanced: " +        advanced+ "\n" +
                "Intermidiate: " +   intermidiate + "\n" +
                "Novice: " +         novice + "\n" +
                "Fundamental: " +    fundamental + "\n";
    }

}
