package com.corejava.basics.eqhashcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class EqualsAndHashCodeDemo {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bharath", 85000);
        Person person2 = new Person(1, "Bharath", 85000);


        Person person3 = person1;

        person3.setName("Girish");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}

class Person {
    private int id;
    private String name;
    private double salary;

    void test() {
        System.out.println("Test in Person");
    }

    Person() {
    }

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Id: " + this.id + ", " + "Name: " + this.name + ", " + "Salary: " + this.salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Person person = (Person) obj;

        return person.id == this.id && person.name.equals(this.name) && person.salary == this.salary;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

class LocalPerson extends Person {

}
