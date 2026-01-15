package com.example.model;

public class Mentorship extends Content {
    private double xp; // experiência oferecida


    public Mentorship(String title, String description, String date) {
        super(title, description, date);
        this.xp = 20.0; // valor fixo de XP para mentorias
    }

    //getters e setters
    
    public double getXp() {
        return xp;
    }

    

}
