package com.company;

public class Main {

    public static void main(String[] args) {
	   Course course = new Course("Java",5,"Muhamed Allanov","04.01.222");
        System.out.println(course.getName()+" " +course.getNumber()+" "+course.getTeachersName()+
                " "+ course.getDate());
        Student student = new Student("Aichurok","29.08.1993","Turgunbaeva",28);
        System.out.println(student.getName()+" " +student.getBirthDay()+" "+student.getSurname()+
                " "+ student.getAge());


    }
}
