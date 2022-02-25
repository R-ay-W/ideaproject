package com.bjsxt.testInterface;

public class SuperMan implements Volant, Honest{
    @Override
    public void fly() {
        System.out.println("横着飞");
    }

    @Override
    public void stop() {
        System.out.println("竖着停");
    }

    @Override
    public void helpOther() {
        System.out.println("哪里需要飞哪里");
    }


}
