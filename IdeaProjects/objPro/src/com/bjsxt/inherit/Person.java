package com.bjsxt.inherit;

import java.util.Objects;

public class Person extends Object{
    String name;
    int height;

    public void rest(){
        System.out.println("resting");
    }

    public Person getfriend(){
        return new Person();
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.rest();
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Student extends Person{

    int score;
    public void study(){
        System.out.println(this.name + " is studying");
    }

//    Student(String name, int height, int score){
//        this.name = name;
//        this.height = height;
//        this.score = score;
//    }


}

class Teacher {
    int teacherId;
    Person person = new Person();
    Teacher(int teacherId, String name, int height){
        this.teacherId = teacherId;
        this.person.name = name;
        this.person.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId);
    }
}

