package com.corejava.basics;

public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo = new OverloadingDemo();
        System.out.println(overloadingDemo.addition(10, 20));
        /*System.out.println(overloadingDemo.addition(10, 20, 30));
        System.out.println(overloadingDemo.addition(10, 20, 30, 40));*/
        System.out.println(overloadingDemo.addition(1.2, 3.4, 5.6));
    }

    int addition(int a, int b) {
        return a + b;
    }

 /*   int addition(int a, int b, int c) {
        return a + b + c;
    }

    int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    double addition(double a, double b, double c) {
        return a + b + c;
    }
}

/// If Methods are sharing the same name but may be same or different return type and type signature/argument list called as method overloading
