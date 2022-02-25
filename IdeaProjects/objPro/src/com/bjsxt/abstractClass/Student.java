package com.bjsxt.abstractClass;

abstract public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(){

    }

    abstract public void study();
    abstract public void exam();

}
