package com.company;
import java.util.ArrayList;

public class Person {
    private String name;
    private String eAddress;
    private String phoneNumber;

    private ArrayList<Education> listEducations;
    private ArrayList<Experience> listExperiences;
    private ArrayList<Skill> litSkills;

    public Person(){
        listEducations = new ArrayList<>();
        listExperiences = new ArrayList<>();
        litSkills = new ArrayList<>();

    }

    public Person(String name, String eAddress, String phoneNumber, ArrayList<Education> listEducations,
                  ArrayList<Experience> listExperiences, ArrayList<Skill> litSkills){
        this.name = name;
        this.eAddress = eAddress;
        this.phoneNumber = phoneNumber;
        this.listEducations = listEducations;
        this.listExperiences = listExperiences;
        this.litSkills = litSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Name: " +            name + "\n" +
               "Email address: " +   eAddress + "\n" +
               "Phone number: " +    phoneNumber + "\n";
    }

    public ArrayList<Education> getListEducations() {
        return listEducations;
    }

    public void setListEducations(ArrayList<Education> listEducations) {
        this.listEducations = listEducations;
    }

    public ArrayList<Experience> getListExperience() {
        return listExperiences;
    }

    public void setListExperience(ArrayList<Experience> listExperiences) {
        this.listExperiences = listExperiences;
    }

    public ArrayList<Skill> getLitSkills() {
        return litSkills;
    }

    public void setLitSkills(ArrayList<Skill> litSkills) {
        this.litSkills = litSkills;
    }

    public void addEducation(Education edu){
        this.listEducations.add(edu);
    }

    public void addExperience(Experience exp){
        this.listExperiences.add(exp);
    }

    public void addSkill(Skill ski){
        this.litSkills.add(ski);
    }
}
