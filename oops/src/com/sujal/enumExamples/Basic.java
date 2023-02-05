package com.sujal.enumExamples;

public class Basic {

    // Enum can implement as many interface as we want but can't extend classes
    // Abstract are not allowed, Method body is required
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants
        // public, static and final
        // since its final you can't create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }

        // This is not public or protected, only private or default
        // Why? we don't want to create new objects
        // This is not the enum concept

        // internally: public static final Week Monday =  new Week();
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
