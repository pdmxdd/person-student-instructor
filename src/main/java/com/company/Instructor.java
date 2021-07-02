package com.company;

public class Instructor extends Person {

    private String employeeId;
    private Course course;

    public Instructor(String firstName, String lastName, String employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String teach() {
        return this.getFullName() + " is now teaching " + this.course.getName();
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
