package com.sujal.access;

public class A {
    // Not protecting the variables is not the good convention, so we need to hide some data
    // from the users, therefore, we use private
    // But then how can the user access the variables without giving him the rights to change
    // the data
    private int num;
    String name;
    int[] arr;

    // That's where getter and setters come in play
    // Since we can use the private variables anywhere in this file we can use a getter
    // function to let the user access the num variable
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
