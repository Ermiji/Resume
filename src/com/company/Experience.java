package com.company;

public class Experience {
    private String compName;
    private String title;
    private String date;
    private String description;

    public Experience(){
    }

    public Experience(String compName, String title, String date, String description){
        this.compName = compName;
        this.title = title;
        this.date = date;
        this.description = description;


    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Company name: " +     compName + "\n" +
               "Title : " +           title + "\n" +
               "Date: " +             date + "\n" +
               "Description: " +      description + "\n";
    }

}
