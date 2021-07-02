package com.company;

public class Student extends Person {
    private String studentId;
    private Course course;

    public Student(String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String learn() {
        return this.getFullName() + " is now learning " + this.course.getName();
    }
}
