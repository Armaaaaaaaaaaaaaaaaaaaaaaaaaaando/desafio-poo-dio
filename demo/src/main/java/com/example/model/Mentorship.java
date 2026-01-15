package com.example.model;

import java.time.LocalDate;

public class Mentorship extends Content {
    private double xp; // experiência oferecida


    public Mentorship(String title, String description, LocalDate date) {
        super(title, description, date);
        this.xp = 20.0; // valor fixo de XP para mentorias
    }

    //getters e setters
    
    public double getXp() {
        return xp;
    }

    

}
