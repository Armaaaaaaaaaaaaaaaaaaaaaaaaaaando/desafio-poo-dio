package com.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DevTest {
    Dev aluno = new Dev("Armando");

    BootCamp bootcamp = new BootCamp(LocalDate.of(2026,1,1),LocalDate.of(2026,2,1),"Aprendendo python","python para iniciantes");

    Activity atividade1 = new Activity("Condicoes","CondicoesPython",2,LocalDate.of(2026,1,19));

    Mentorship mentorship1 = new Mentorship("Python para computacao","inicio em python", LocalDate.of(2026,1,23));

    @Test
    void getInformationDev(){
        assertEquals("Armando",aluno.getName());
    }

    @Test
    void getTotalXpSemConteudo(){
        assertEquals(0,aluno.getTotalXp());
    }

    @Test
    void getTotalXpComConteudo(){
        bootcamp.addatividade(atividade1);
        aluno.inscreverBootCamp(bootcamp);
        

        aluno.progress();

        assertEquals(20, aluno.getTotalXp());
    }

    @Test
    void insercaoDevNoBootCamp(){
        aluno.inscreverBootCamp(bootcamp);

        assertEquals(aluno.getId(),bootcamp.getListaAlunos().get(aluno.getId()).getId());
    }

    @Test
    void getTotalXpComMentoria(){
        bootcamp.addMentorship(mentorship1);

        aluno.inscreverBootCamp(bootcamp);

        aluno.progress();

        assertEquals(20, aluno.getTotalXp());
    }

    @Test
    void getTotalXpComMentoriaEComConteudo(){
        bootcamp.addMentorship(mentorship1);
        bootcamp.addatividade(atividade1);

        aluno.inscreverBootCamp(bootcamp);

        aluno.progress();

        assertEquals(40, aluno.getTotalXp());
    }
}
