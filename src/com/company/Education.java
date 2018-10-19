package com.company;

public class Education {
    private String school;
    private String major;
    private String degree;
    private String year;


    public Education() {
    }

    public Education(String school, String major, String degree, String year){
        this.school = school;
        this.major = major;
        this.degree = degree;
        this.year = year;


    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString(){
        return "School name: " +      school + "\n" +
               "Major: " +            major + "\n" +
               "Degree: " +           degree + "\n" +
               "Year: " +             year + "\n";
    }

    }

