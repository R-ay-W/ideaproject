package com.bjsxt.testWrapperClass;

public class Test {

    public static void main(String[] args) {
        Integer i = new Integer(300);//从Java9开始被抛弃
        Integer i2 = Integer.valueOf(300);//官方推荐这种写法
        //包装类对象转为基本数据类型
        int a = i2.intValue();
        double d = i2.doubleValue();
        //字符串转成Integer
        Integer i3 = Integer.parseInt("12138");
        Integer i4 = Integer.valueOf("12138");
        //Integer转成字符串
        String str1 = i3.toString();

        //自动装箱
        Integer i5 = 5;
        //自动拆箱
        int b = i5;

        //包装类的缓存问题
        Integer d1 = 4000;
        Integer d2 = 4000;
        //d1 和 d2 不是一个对象

        //当数字在[-128，127]之间的时候，返回缓存数组中的某个元素
        Integer d3 = 123;
        Integer d4 = 123;
        //d3 和 d4 是一个对象

    }
}
