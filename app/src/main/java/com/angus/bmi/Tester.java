package com.angus.bmi;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person person = new Person();
        person.hello("Angus");
        person.weight = 66;
        person.height = 1.7f;
        person.bmi();
        System.out.println(person.bmi());
    }
}
