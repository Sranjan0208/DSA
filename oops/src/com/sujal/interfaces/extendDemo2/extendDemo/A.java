package com.sujal.interfaces.extendDemo2.extendDemo;

public interface A {

    // static interface method should always hve a body as static means it does not depend
    // on objects and can't be inherited
    // Call via interface name (A.greeting)
    static void greeting(){
        System.out.println("Hey! I am static method");
    }


    // Don't need to override this fun in Main as we are using default
    default void fun() {

        System.out.println("I am in A");
    }
}
