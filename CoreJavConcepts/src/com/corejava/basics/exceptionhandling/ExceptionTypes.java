package com.corejava.basics.exceptionhandling;

import java.util.Scanner;

// Unchecked Exception
public class ExceptionTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B");
        int b = scanner.nextInt();
        try {
            int c = a/b;
            System.out.println("Result " + c);
        } catch (ArithmeticException ex) {
            System.out.println("There is an Error Please Check");
        }
        System.out.println("Some important code");
    }
}

