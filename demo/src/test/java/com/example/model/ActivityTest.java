package com.example.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;


public class ActivityTest {
    Activity activity = new Activity("Java Course", "Learn Java", 5, LocalDate.of(2024,6,10));

    @Test
    public void testGetXp() {
        assertEquals(50.0, activity.getXp(), 0.01);
    }

    @Test
    public void testGetWorkload() {
        assertEquals(5, activity.getWorkload());
    }

    @Test
    public void testGetName(){
        assertEquals("Java Course", activity.getTitle());
        assertEquals("Learn Java", activity.getDescription());
        assertEquals(LocalDate.of(2024,6,10), activity.getDate());
        
    }
}