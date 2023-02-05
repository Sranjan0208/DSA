package com.sujal.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // Static variables do not depend on object

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        // this.population += 1;

    }
}
