package com.example.model;

import java.time.LocalDate;
import java.util.HashMap;

public class BootCamp {
    // Data de início do bootcamp
    private LocalDate startLocalDate;
    // Data de término do bootcamp
    private LocalDate endLocalDate;
    // Nome do bootcamp
    private String name;
    // Descrição do bootcamp
    private String description;

    // HashMap para armazenar alunos (Dev) com ID como chave
    private HashMap<Integer,Dev> listaAlunos = new HashMap<>();
    // HashMap para armazenar conteúdos com título como chave
    private HashMap<String,Activity> listaConteudos = new HashMap<>();
    // HashMap para armazenar mentorias com título como chave
    private HashMap<String,Mentorship> listaMentorias = new HashMap<>();

    /**
     * Construtor do BootCamp
     */
    public BootCamp(LocalDate startLocalDate, LocalDate endLocalDate, String name, String description) {
        this.startLocalDate = startLocalDate;
        this.endLocalDate = endLocalDate;
        this.name = name;
        this.description = description;
    }

    // Getters e setters
    public LocalDate getStartLocalDate() {
        return startLocalDate;
    }

    public void setStartLocalDate(LocalDate startLocalDate) {
        this.startLocalDate = startLocalDate;
    }

    public LocalDate getEndLocalDate() {
        return endLocalDate;
    }

    public void setEndLocalDate(LocalDate endLocalDate) {
        this.endLocalDate = endLocalDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<Integer, Dev> getListaAlunos() {
        return listaAlunos;
    }

    public HashMap<String, Activity> getListaConteudos() {
        return listaConteudos;
    }

    public HashMap<String, Mentorship> getListaMentorias() {
        return listaMentorias;
    }


    //operdores de inserção e remoção
    public void addatividade(Activity atividade) {
        listaConteudos.put(atividade.getTitle(), atividade);
    }

    public void addMentorship(Mentorship mentorship) {
        listaMentorias.put(mentorship.getTitle(), mentorship);
    }

    public void enrollDev(Dev dev) {
        listaAlunos.put(dev.getId(), dev);
    }

    public void removeDev(Dev dev) {
        listaAlunos.remove(dev.getId());
    }

    public void removeatividade(Activity atividade) {
        listaConteudos.remove(atividade.getTitle());
    }

    public void removeMentorship(Mentorship mentorship) {
        listaMentorias.remove(mentorship.getTitle());
    }   
}
