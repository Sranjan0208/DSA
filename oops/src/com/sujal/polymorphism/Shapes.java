package com.sujal.polymorphism;

public class Shapes {

    // Late Binding
    void area(){
        System.out.println("I am in Shapes");
    }

    // Early Binding: Cannot be overridden so no need for java to check for above methods
//    final void area(){
//        System.out.println("I am in Shapes");
//    }
}
