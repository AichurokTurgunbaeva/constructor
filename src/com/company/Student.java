package com.company;

public class Student {
    private String name;
    private String birthDay;
    private String surname;
    private int age;

    public Student() {
    }

    public Student(String name, String birthDay, String surname, int age) {
        this.name = name;
        this.birthDay = birthDay;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
        this.age = age;
    }
}
}
