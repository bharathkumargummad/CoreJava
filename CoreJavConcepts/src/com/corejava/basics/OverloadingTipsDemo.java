package com.corejava.basics;

public class OverloadingTipsDemo {
    public static void main(String[] args) {
        OverloadingTipsDemo overloadingTipsDemo = new OverloadingTipsDemo();
        //System.out.println(overloadingTipsDemo.addition(new Integer(3), new Integer(5)));
        //System.out.println(overloadingTipsDemo.addition(3L, 5L));
        //System.out.println(overloadingTipsDemo.addition(3, 5));

        //System.out.println(overloadingTipsDemo.addition(new Integer(10), 20));
    }

    int addition(int a, int b) {
        return a + b;
    }

    Integer addition(Integer a, Integer b) {
        return a + b;
    }

    /*long addition(long a, long b){
        return a + b;
    }*/


}
