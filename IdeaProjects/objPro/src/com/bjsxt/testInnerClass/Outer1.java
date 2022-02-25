package com.bjsxt.testInnerClass;

public class Outer1 {

    private int age = 10;

    private void show(){
        System.out.println("showing off");
    }
    public class Inner1{
        private String name = "tom";
        private int age = 20;

        public void showInner(){
            System.out.println("Inner.showInner");
            System.out.println(age);
            show();
        }
    }

    public static void main(String[] args) {
        Outer1.Inner1 inn01 = new Outer1().new Inner1();
        inn01.showInner();

        Outer1 out02 = new Outer1();
        Inner1 inn02 = out02.new Inner1();
    }
}
