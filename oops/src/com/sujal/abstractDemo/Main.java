package com.sujal.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();

        Parent.hello();
        // Cannot create objects for abstract classes
//        Parent mom = new Parent(45);
    }
}
