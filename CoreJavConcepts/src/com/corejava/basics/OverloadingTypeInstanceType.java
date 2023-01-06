package com.corejava.basics;

public class OverloadingTypeInstanceType {
    public static void main(String[] args) {
        /*OverloadingTypeInstanceType overloadingTypeInstanceType = new OverloadingTypeInstanceType();
        //overloadingTypeInstanceType.test("test1", "test2");
        overloadingTypeInstanceType.test(null, new Person());*/

        Person person = new Person();
        Person person2 = new Person("Bharath", 7000);
        Person person3 = new Person(3, "Girish", 1000000);
    }

    /*void test(String str1, String str2){
        System.out.println("String");
    }*/

    void test(Person person1, Person person2) {
        System.out.println("Person");
    }

    void test(Object obj1, Object obj2) {
        System.out.println("Object");
    }
}

class Person {
    int id;
    String name;
    double salary;

    Person() {
        System.out.println("Zero argument");
    }

    Person(String name, double salary) {
        System.out.println("2 argument");
        this.name = name;
        this.salary = salary;
    }

    Person(int id, String name, double salary) {
        System.out.println("3 argument");
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
}

//Constructor:
// it has the same name as class name
//It is used for initializing the object
//It does not have any return type
