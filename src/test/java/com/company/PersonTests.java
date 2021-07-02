package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTests {

    private Person testPerson;

    @BeforeEach
    public void setupTestPerson() {
        this.testPerson = new Person("Paul", "Matthews");
    }

    @Test
    public void testGetFullName() {
        Assertions.assertEquals("Paul Matthews", this.testPerson.getFullName());
    }

    @Test
    public void testGetInitials() {
        Assertions.assertEquals("P.M.", this.testPerson.getInitials());
    }
}
