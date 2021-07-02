package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstructorTests {
    @Test
    public void testTeach() {
        Instructor testInstructor = new Instructor("Jack", "Black", "paoifh");
        testInstructor.setCourse(new Course("music"));
        Assertions.assertEquals("Jack Black is now teaching music", testInstructor.teach());
    }
}
