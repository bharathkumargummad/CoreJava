package com.corejava.basics.wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrapperClassesIntroductionDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        //for every primitive data type we have wrapper class in java

        //int --- Integer
        //byte --- Byte
        //short --- Short
        //long --- Long
        //char ---- Character
        //double Double
        // boolean -- Boolean

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList);

    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
}
