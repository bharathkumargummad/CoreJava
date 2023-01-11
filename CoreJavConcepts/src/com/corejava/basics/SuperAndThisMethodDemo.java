package com.corejava.basics;

public class SuperAndThisMethodDemo {
    public static void main(String[] args) {

        B b = new B(40, 50, 10, 20);

    }
}

class A {

    int a;
    int b;

    A() {
        System.out.println("A");
    }

    A(int a, int b) {
        this();
        this.a = a;
        this.b = b;

        System.out.println("2 args A");
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + '}';
    }
}

class B extends A {

    int c;
    int d;

    B() {
        System.out.println("B");
    }

    B(int a, int b) {
        super(a, b);
        System.out.println("2 args B");
    }

    B(int a, int b, int c, int d) {
        this(a, b);
        this.c = c;
        this.d = d;

        System.out.println("4 args");
    }

    @Override
    public String toString() {
        return "B{" + "c=" + c + ", d=" + d + ", a=" + a + ", b=" + b + '}';
    }
}
