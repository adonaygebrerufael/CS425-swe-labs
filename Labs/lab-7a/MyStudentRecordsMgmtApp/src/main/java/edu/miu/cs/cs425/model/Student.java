package edu.miu.cs.cs425.model;

import java.time.LocalDate;

public class Student{

    private Integer studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public Student() {
    }

    public Student(String name, LocalDate dateOfAdmission) {
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student(Integer studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return String.format("studentId:"+ studentId +
                ", name:" + name +
                ", dateOfAdmission:" +
                dateOfAdmission.getMonthValue() + "/" +
                dateOfAdmission.getDayOfMonth() + "/" +
                dateOfAdmission.getYear() );
    }


}
