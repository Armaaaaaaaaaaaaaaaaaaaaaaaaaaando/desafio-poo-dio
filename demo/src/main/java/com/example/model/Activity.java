package com.example.model;

public class Activity extends Content {

    private int workload; // carga horária em horas
    private double xp; // experiência oferecida

    public Activity(String title, String description, int workload, String date) {
        super(title, description, date);
        this.workload = workload;
        this.xp = workload * 10.0; // Exemplo: 10 XP por hora de carga horária

    }


    public int getWorkload() {
        return workload;
    }

    public double getXp() {
        return xp;
    }

    




}
