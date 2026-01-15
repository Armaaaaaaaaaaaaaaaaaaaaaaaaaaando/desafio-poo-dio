package com.example.model;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    BootCampTest.class,
    MentorshipTest.class,
    ActivityTest.class,
    DevTest.class
})
public class AllTests {
}
