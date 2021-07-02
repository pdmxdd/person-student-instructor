package com.company;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String args[]) {
        // manual tests
        // Person
        Person personOne = new Person("Paul", "Matthews");
        System.out.println(personOne);
        System.out.println(personOne.getFullName());
        System.out.println(personOne.getInitials());

        // Student
        Student studentOne = new Student("Sally", "Ride", "sr001");
        System.out.println(studentOne);
        System.out.println(studentOne.getFullName());
        System.out.println(studentOne.getInitials());

        // Instructor
        Instructor instructorOne = new Instructor("Fred", "Flinstone", "ff130");
        System.out.println(instructorOne);
        System.out.println(instructorOne.getFullName());
        System.out.println(instructorOne.getInitials());

        // Course
        Course course = new Course("CodeCamp");
        studentOne.setCourse(course);
        instructorOne.setCourse(course);

        System.out.println(studentOne.learn());
        System.out.println(instructorOne.teach());
    }
}
