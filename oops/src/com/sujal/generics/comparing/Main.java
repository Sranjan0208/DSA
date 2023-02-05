package com.sujal.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student A = new Student(12,89.76f);
        Student B = new Student(5, 99.52f);
        Student C = new Student(14, 93.52f);
        Student D = new Student(16, 94.52f);
        Student E = new Student(19, 95.52f);

        Student[] list = {A,B,C,D,E};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
        /*
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
         */

        // Lambda Functions
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));


        System.out.println(Arrays.toString(list));

//        if(A.compareTo(B) < 0){
//            System.out.println("B has more marks");
//        }
    }
}
