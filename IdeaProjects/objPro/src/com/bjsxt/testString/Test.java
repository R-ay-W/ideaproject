package com.bjsxt.testString;

public class Test {
    public static void main(String[] args) {
        String str = "aabb";//不可变字符序列
        StringBuilder sbl = null;//可变字符序列，线程不安全，效率高(常用
        StringBuffer sbf = null;//可变字符序列，线程安全，效率低

        sbl = new StringBuilder("Wang");
        sbl.append(123);
        sbl.append("Ray");
        System.out.println(sbl);
        sbl.append("aa").append("bb").append("cc");
        System.out.println(sbl);
        sbl.delete(10,16);
        System.out.println(sbl);
        sbl.insert(0,"Mr.");
        System.out.println(sbl);
    }
}
