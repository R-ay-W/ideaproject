package com.bjsxt.test.encapsulation.a;
/**
 * 一个简单的javabean
 * **/
public class Person2 {
    private String name;
    private int age;
    private boolean flag;



    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            System.out.println("age wrong");
        }
        else{this.age = age;}
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    }
}
