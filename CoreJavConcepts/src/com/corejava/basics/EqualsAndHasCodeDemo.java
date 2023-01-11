package com.corejava.basics;

public class EqualsAndHasCodeDemo {
    public static void main(String[] args) {
       /* String str = "Girish";
        String str2 = "Girish";
        System.out.println(str.equals(str2));
        System.out.println(str == str2);


        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());*/


        String str3 = new String("Girish");
        String str4 = new String("Girish");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        /*System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());*/
    }
}
