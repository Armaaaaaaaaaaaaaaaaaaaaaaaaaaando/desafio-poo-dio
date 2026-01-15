package com.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class BootCampTest {
    BootCamp bootcamp = new BootCamp(LocalDate.of(2025,3,20), LocalDate.of(2025,3,31), "Aprendendo Java", "Domine o java do zero");

    Activity activity = new Activity("Strings","Introdução a classe de strings", 2, LocalDate.of(2025,3,23));

    Mentorship mentorship = new Mentorship("Java para iniciantes", "Vamos mostrar como trabalha com java", LocalDate.of(2025,3,29));

    @Test
    void getBootcampInformations(){
        assertEquals("Aprendendo Java", bootcamp.getName());
        assertEquals("Domine o java do zero", bootcamp.getDescription());
        assertEquals(LocalDate.of(2025,3,20), bootcamp.getStartLocalDate());
        assertEquals(LocalDate.of(2025,3,31), bootcamp.getEndLocalDate());
    }

    @Test
    void insercaoAtividadeBootcamp(){
        bootcamp.addatividade(activity);
        assertEquals(activity.getTitle(),bootcamp.getListaConteudos().get(activity.getTitle()).getTitle());
    }

    @Test
    void remocaoAtividadeBootcamp(){
        bootcamp.addatividade(activity);
        bootcamp.removeatividade(activity);

        assertEquals(0,bootcamp.getListaConteudos().size());
    }


    @Test 
    void insercaoMentorshipBootcamp(){
        bootcamp.addMentorship(mentorship);
        assertEquals(mentorship.getTitle(), bootcamp.getListaMentorias().get(mentorship.getTitle()).getTitle());
    }

    @Test 
    void remocaoMentorshipBootcamp(){
        bootcamp.addMentorship(mentorship);
        bootcamp.removeMentorship(mentorship);

        assertEquals(0,bootcamp.getListaMentorias().size());
    }
}
