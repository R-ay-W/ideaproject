package com.bjsxt.inherit;

import java.time.temporal.TemporalAdjuster;

public class Animal {
    public static void main(String[] args) {
        Taidi t = new Taidi();
        t.dog.shout();
        t.dog.height = 111;
    }
}

class Taidi{
    Dog dog = new Dog();
}

class Dog {
    int height;
    public void shout(){
        System.out.println("wonf, wonf");
    }
}
