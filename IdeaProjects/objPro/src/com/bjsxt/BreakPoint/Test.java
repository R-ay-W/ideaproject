package com.bjsxt.BreakPoint;
/**测试调试功能*/
public class Test {
    private int num = 10;
    public void run(int a){
        num = num*a;
        go(num);

    }

    public void go(int b){
        System.out.println("Test.go");
        System.out.println("nums=" + b);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.run(3);
    }

}
