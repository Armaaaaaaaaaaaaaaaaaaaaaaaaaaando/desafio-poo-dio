package com.example.model;

public class Dev {
    private String name;
    private int id;
    private double totalXp;

    public Dev(String name) {
        this.name = name;
        this.id = name.hashCode(); // Gera um ID simples baseado no hash do nome
        this.totalXp = 0.0;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getTotalXp() {
        return totalXp;
    }

    public void setName(String name) {
        this.name = name;
    } 

    
}
