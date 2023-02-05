package com.sujal.polymorphism;

// By default, in java every class is a subclass of Object class
// So we can override Object class with our own method
public class ObjectPrint {

    int num;

    public ObjectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        return "ObjectPrint{" + "num=" + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
        // By default, println calls toString method and gives out some random value
    }
}
