package com.example.model;

public class Mentorship {
    private String title;
    private String description;
    private String date; // Data da mentoria
    private double xp; // experiência oferecida


    public Mentorship(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.xp = 20.0; // valor fixo de XP para mentorias
    }

    //getters e setters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public double getXp() {
        return xp;
    }

    public void setTitle(String title) {
        this.title = title;
    }  

    public void setDescription(String description) {
        this.description = description;
    }


}
