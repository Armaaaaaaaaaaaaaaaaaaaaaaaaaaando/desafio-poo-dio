package com.example.model;

public class Content {
    private String title;
    private String description;
    private int workload; // carga horária em horas
    private double xp; // experiência oferecida

    public Content(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
        this.xp = workload * 10.0; // Exemplo: 10 XP por hora de carga horária
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkload() {
        return workload;
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
