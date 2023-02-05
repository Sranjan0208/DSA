package com.sujal.staticExample;

public class Main {
    public static void main(String[] args) {
        // No need to import class from another file if the file is in the same package
//        Human sujal = new Human(20, "Sujal", 10000, false);
//        Human sumit = new Human(21, "Sumit", 15000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);

//     greeting();

     // you cannot access non static stuff without referencing their instances in a static
        // content

        // hence, here we are referencing it
     Main obj = new Main();
     obj.greeting();

     Main funn = new Main();
     funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting();
        // you cannot use this because it requires an instance
        // but the function you are using it in does not depend on instances
    }

    // we know that something which is not static, belongs to an object
    // we cannot use non-static member inside a static

    void fun2() {
        greeting();
    }
    void greeting() {
        System.out.println("Hello");
    }
}
