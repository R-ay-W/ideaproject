package com.bjsxt.test.encapsulation.a;

public class Person {
    private int testPrivate = 100;
    int testDefault = 200;
    protected int testProtected = 300;
    public int testPublic = 400;

    public void test(){
        System.out.println(this.testPrivate);
    }
}

class test{
    public static void main(String[] args) {
        Person p = new Person();
        p.test();

    }
}
