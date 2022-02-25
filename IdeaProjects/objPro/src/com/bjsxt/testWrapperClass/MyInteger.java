package com.bjsxt.testWrapperClass;

public class MyInteger {
    private int value;
    private static MyInteger[] cache = new MyInteger[256];

    private static final int LOW = -128;
    private static final int HIGH = 127;

    static {
        //[-128,127]
        for (int i = LOW; i <= HIGH; i++) {
            cache[i + 128] = MyInteger.init(i);

        }
    }
    private static MyInteger init(int i){
        return new MyInteger(i);
    }

    public static MyInteger valueOf(int i) {
        if (i >= LOW && i <= HIGH) {
            return cache[i + 128];
        }
        return new MyInteger(i);
    }

    private MyInteger(int i) {
        this.value = i;
    }

    @Override
    public String toString() {
        return this.value+"";
    }

    public static void main(String[] args) {
        MyInteger m = MyInteger.valueOf(100);
        System.out.println(m);
    }
}
