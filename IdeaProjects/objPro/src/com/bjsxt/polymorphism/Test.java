package com.bjsxt.polymorphism;

public class Test {

    public static void main(String[] args) {
        Animal a1 = new Cat();
        animalCry(a1);

        Animal a2 = new Dog();
        animalCry(a2);

        Animal a3 = new Mouse();
        animalCry(a3);

        Dog d = new Dog();
        animalCry(d);

        //测试类型的转换
        Animal a = new Dog();//向上自动转换
//        System.out.println(a);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        Dog d2 = (Dog) a;//强制（向下）类型转换
//        System.out.println(a);
        d2.seeDoor();

//        Cat c3 = (Cat) a;
//        c3.catchMouse();


    }

    static void animalCry(Animal a){
        a.shout();
    }
}
