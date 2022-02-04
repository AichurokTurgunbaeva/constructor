package com.company;

public class Course {
    private String name;
    private int number;
    private String teachersName;
    private String date;

    public Course() {
    }
    public Course(String name, int number, String teachersName, String date) {
        this.name = name;
        this.number = number;
        this.teachersName = teachersName;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
