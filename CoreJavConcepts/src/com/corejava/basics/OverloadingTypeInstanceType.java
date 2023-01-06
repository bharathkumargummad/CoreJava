package com.corejava.basics;

public class OverloadingTypeInstanceType {
    public static void main(String[] args) {
        OverloadingTypeInstanceType overloadingTypeInstanceType = new OverloadingTypeInstanceType();
        //overloadingTypeInstanceType.test("test1", "test2");
        overloadingTypeInstanceType.test(null, new Person());
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

}
