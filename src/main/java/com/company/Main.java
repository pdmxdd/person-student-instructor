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

        // Person overrides it's inherited .toString() method (from Objects)
        System.out.println(personOne);
        // Student overrides it's inherited .toString() method (from Person)
        System.out.println(studentOne);
        // Instructor overrides it's inherited .toString() method (From Person)
        System.out.println(instructorOne);

        // what happens if we removed the Student .toString() method?
        System.out.println(studentOne);
    }
}
