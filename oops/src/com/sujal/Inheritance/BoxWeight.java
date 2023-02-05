package com.sujal.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double b, double weight) {

        super(l, h, b); // what is this?
        // This calls the parent class constructor
        // used to initialise values present in parent class

//        System.out.println(super.weight);
        // super explicitly calls the class just above child class, so if we want to access
        // the variables specifically present in parent class we can use super.variable


        this.weight = weight;
    }
}
