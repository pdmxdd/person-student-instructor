package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTests {

    @Test
    public void testLearn() {
        Student testStudent = new Student("Alice", "Cooper", "paofih");
        testStudent.setCourse(new Course("music"));
        Assertions.assertEquals("Alice Cooper is now learning music", testStudent.learn());
    }
}
