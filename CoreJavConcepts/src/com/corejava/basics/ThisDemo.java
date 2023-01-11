package com.corejava.basics;

import java.util.Objects;

public class ThisDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Girish", 60000.00);
        employee.setName("Sunny");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    }
}


class Employee {

    private int id;
    private String name;
    private double salary;


    Employee(int id1, String name1, double salary1) {
        id = id1;
        name = name1;
        salary = salary1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee() {
        id = 20;
        name = "Suresh";
        salary = 10000;
    }

}
//This always invokes the current object
//OOPs Principles - Object, class, Encapsulation