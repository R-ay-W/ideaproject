package com.bjsxt.abstractClass;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student("Ray");
        SxtStu s = new SxtStu();
        s.study();
        s.exam();
    }

}

class SxtStu extends Student {
    @Override
    public void study() {
        System.out.println("好好学习，好好听课，好好敲代码");
    }

    @Override
    public void exam() {
        System.out.println("考个一百分");
    }
}
