package com.sujal.Inheritance;

public class Box {
    double l;
    double b;
    double h;
//    double weight;

    Box() {
        this.h = -1;
        this.l = -1;
        this.b = -1;
    }

    Box (double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box (double l, double h, double b){
        System.out.println("Box class constructor");
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box (Box old) {
        this.h = old.h;
        this.l = old.l;
        this.b = old.b;
    }

    public void Information(){
        System.out.println("Running the box");
    }
}
