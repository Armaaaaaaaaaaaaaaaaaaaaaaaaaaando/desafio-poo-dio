package com.example.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;




public class MentorshipTest {
    
    @Test
    public void testGetXp() {
        Mentorship mentorship = new Mentorship("Java Basics", "Introduction to Java", LocalDate.of(2024,6,15));
        assertEquals(20.0, mentorship.getXp(), 0.01);
    }

    @Test
    public void testGetName(){
        Mentorship mentorship = new Mentorship("Java Basics", "Introduction to Java", LocalDate.of(2024,6,15));
        assertEquals("Java Basics", mentorship.getTitle());
        assertEquals("Introduction to Java", mentorship.getDescription());
        assertEquals(LocalDate.of(2024,6,15), mentorship.getDate()); 
    }
}
