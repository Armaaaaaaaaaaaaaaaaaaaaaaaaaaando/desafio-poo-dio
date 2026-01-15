package com.example.model;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dev {
    private String name;
    private int id;
    private double totalXp;

    private Map<String,Content> enrolledContents = new LinkedHashMap<>();
    private Map<String,Content> completedContents = new LinkedHashMap<>();

    private Map<String,Mentorship> enrolledMentorships = new LinkedHashMap<>();
    private Map<String,Mentorship> completedMentorships = new LinkedHashMap<>();


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

    private void setTotalXp(Double xp){
        this.totalXp = xp;
    }

    public void setName(String name) {
        this.name = name;
    } 


    public void inscreverBootCamp(BootCamp bootCamp) {
        // Inscreve o Dev em todos os conteúdos do BootCamp
        for (Content content : bootCamp.getListaConteudos().values()) {
            enrolledContents.put(content.getTitle(), content);
        }
        // Inscreve o Dev em todas as mentorias do BootCamp
        for (Mentorship mentorship : bootCamp.getListaMentorias().values()) {
            enrolledMentorships.put(mentorship.getTitle(), mentorship);
        }
        // Adiciona o Dev à lista de alunos do BootCamp
        bootCamp.getListaAlunos().put(this.id, this);
    }


    public Map<String, Content> getContentEnrolled(){
        return this.enrolledContents;
    }

    public Map<String,Content> getCompletedContent(){
        return this.completedContents;
    }

    public Map<String,Mentorship> getMentorshipEnrroled(){
        return this.enrolledMentorships;
    }

    public Map<String,Mentorship> getCompletedMentorship(){
        return this.completedMentorships;
    }


    public Double getTotalXPAll(){
        double xp = 0;
        for (Content content : getCompletedContent().values()){
            xp += content.getXp();
        }

        for (Mentorship mentorship : getCompletedMentorship().values()){
            xp += mentorship.getXp();
        }

        setTotalXp(xp);
        return getTotalXp();
    }


    public void progress() {
    if (!this.enrolledContents.isEmpty()) {
        Iterator<Map.Entry<String, Content>> iterator =
                this.enrolledContents.entrySet().iterator();

        Map.Entry<String, Content> entry = iterator.next();
        this.completedContents.put(entry.getKey(), entry.getValue());
        iterator.remove();
    }

    if (!this.enrolledMentorships.isEmpty()) {
        Iterator<Map.Entry<String, Mentorship>> iterator =
                this.enrolledMentorships.entrySet().iterator();

        Map.Entry<String, Mentorship> entry = iterator.next();
        this.completedMentorships.put(entry.getKey(), entry.getValue());
        iterator.remove();
    }
}
    

    
}
