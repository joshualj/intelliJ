package com.teksystems;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        double radius = 0;
//        double area = 0;
//        String s = "hello world";

//                2_17_22
//        Scanner input = new Scanner(System.in); //Read from console
//        System.out.println("enter a radius: ");
//        radius = input.nextDouble();
//
//        area = radius * radius * 3.14159;
//        System.out.println("The area for the circle of radius "
//                + radius + " is " + area);

//        2_18_22
        double x = 25.1234;
        int y = 2022;
        String s = String.format("This class has %10.2f, class of %d", x,y);
        System.out.println(s);

        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(2.3456);
        System.out.println(formatted);

        System.out.printf("2: this class has %-10.2f, class of %d.", x,y);
        System.out.println("hello");


    }
}
