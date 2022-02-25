package com.bjsxt.testString;

public class TestEfficiency {
    public static void main(String[] args) {
        /**使用String进行字符串拼接*/
        String str = "";
        //本质上使用StringBuilder拼接，但是每次循环都会生成一个StringBuilder对象
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();

        for(int i = 0; i<5000; i++){
            str = str + i;//相当于产生了10000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String takes "+(num1-num2)+" memory");
        System.out.println("String takes "+(time2-time1)+" time");

        /**使用StringBuilder进行字符串的拼接*/
        StringBuilder sb = new StringBuilder("");
//        StringBuffer sb = new StringBuffer("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();

        for(int i = 0; i<5000; i++){
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder takes "+(num3-num4)+" memory");
        System.out.println("StringBuilder takes "+(time4-time3)+" times");
    }
}
