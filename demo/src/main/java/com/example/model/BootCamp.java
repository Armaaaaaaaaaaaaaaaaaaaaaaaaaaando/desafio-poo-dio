package com.example.model;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public class BootCamp {
    // Data de início do bootcamp
    private Date startDate;
    // Data de término do bootcamp
    private Date endDate;
    // Nome do bootcamp
    private String name;
    // Descrição do bootcamp
    private String description;

    // HashMap para armazenar alunos (Dev) com ID como chave
    private HashMap<Integer,Dev> listaAlunos = new HashMap<>() ;
    // HashMap para armazenar conteúdos com título como chave
    private HashMap<String,Content> listaConteudos = new HashMap<>();
    // HashMap para armazenar mentorias com título como chave
    private HashMap<String,Mentorship> listaMentorias = new HashMap<>();

    /**
     * Construtor do BootCamp
     */
    public BootCamp(Date startDate, Date endDate, String name, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.description = description;
    }

    // Getters e setters
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public HashMap<String, Content> getListaConteudos() {
        return listaConteudos;
    }

    public HashMap<String, Mentorship> getListaMentorias() {
        return listaMentorias;
    }
    

    //operdores de inserção e remoção
    public void addContent(Content content) {
        listaConteudos.put(content.getTitle(), content);
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

    public void removeContent(Content content) {
        listaConteudos.remove(content.getTitle());
    }

    public void removeMentorship(Mentorship mentorship) {
        listaMentorias.remove(mentorship.getTitle());
    }   
}
