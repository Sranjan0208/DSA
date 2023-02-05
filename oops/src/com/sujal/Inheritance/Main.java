package com.sujal.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1  = new Box(4.6, 7.9, 9.0);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.b + " " + box1.h);
//        System.out.println();

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);


        // It is actually the type of the reference variable (Box) not the object (BoxWeight)
        // that determines what members can be accessed
        // It is a reference type of box it is referencing to an object of BoxWeight
//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.b);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // child class
        // that's why this error
//        BoxWeight box6 = new Box(2,4,3);
//        System.out.println(box6);


        BoxPrice box = new BoxPrice();


    }
}
