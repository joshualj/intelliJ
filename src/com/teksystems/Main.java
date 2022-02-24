package com.teksystems;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    enum Days {
        Mon, Tues, Weds, Thurs, Fri, Sat, Sun
    }

    public static void main(String[] args) {
        //CORE JAVA - EXERCISE - CONTROL FLOW (CONDITIONAL) STATEMEENTS

        //Question 1
//        int x = 15;
//        if (x < 10)
//            System.out.println("Less than 10");

        //Question 2
//        int x = 7;
//        int y = 15;
//        if (y < 10) {
//            System.out.println("Less than 10");
//        }
//        else {
//            System.out.println("Greater than 10");
//        }

        //Question 3
//        int x = 15;
//        if (x < 10) {
//            System.out.println("Less than 10");
//        }
//        else if (x > 10 && x < 20){
//            System.out.println("Between 10 and 20");
//        }
//        else {
//            System.out.println("Greater than or equal to 20");
//        }

        //Question 4
//        int x = 15;
//        int y = 5;
//        if (y < 10 || y > 20) {
//            System.out.println("Out of range");
//        }
//        else {
//            System.out.println("In range");
//        }

        //Question 5
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a numerical score: ");
//        int x = input.nextInt();
//
//        if (x >= 90 && x <= 100) {
//            System.out.println("A");
//        }
//        else if (x >= 80 && x <= 90){
//            System.out.println("B");
//        }
//        else if (x >= 70 && x <= 80){
//            System.out.println("C");
//        }
//        else if (x >= 60 && x <= 70){
//            System.out.println("D");
//        }
//        else {
//            System.out.println("F");
//        }

        //Question 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7, inclusive: ");
        int x = input.nextInt();
        //String weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if(x >= 1 && x <= 7) {

            switch (x) {
                case 1: System.out.println(Days.Mon);
                    break;
                case 2: System.out.println(Days.Tues);
                    break;
                case 3: System.out.println(Days.Weds);
                    break;
                case 4: System.out.println(Days.Thurs);
                    break;
                case 5: System.out.println(Days.Fri);
                    break;
                case 6: System.out.println(Days.Sat);
                    break;
                case 7: System.out.println(Days.Sun);
                    break;
                default:
                    System.out.println("Out of range");
            }

        } else {
            System.out.println("Not within range");
        }

















        //class NOTES
//        int seconds = 86399;
//        int p1 = seconds % 60;
//        int min = seconds / 60;
//        int p3 = min % 60;
//        min = min / 60;
//        System.out.println(min + ":" + p3 + ":" + p1);


//        Scanner input = new Scanner(System.in); //Read from console
//        System.out.println("enter a temperature in Fahrenheit: ");
//        float temp_in_f = input.nextFloat();
//        System.out.println(temp_in_f);
//        double temp_in_celsius = (5d/9) * (temp_in_f - 32);
//
//
//        DecimalFormat df = new DecimalFormat("##.##");
//        String formatted = df.format(temp_in_celsius);
//        System.out.println(formatted);









        //Week 3, Day 3 - Java Math,  Character, and String
//        Integer i = 10; // to double
//        System.out.println(i.MIN_VALUE); //returns min value of a double, -2147483648

//        Random r = new Random();
//        Random rr = new Random();
//
//        //System.out.println(r.nextInt(10));
//        System.out.println(r);
//        System.out.println(rr.nextInt(10));
//        System.out.println(r.getClass().hashCode());
//        System.out.println(r.getClass().getName());

//        String s = "hello";
//        System.out.println(s);
//        s = s + " world";
//        System.out.println(s);
//
//        //Indexing with strings
//        String b = "Welcome";
//        System.out.println(b.charAt(0));

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a name:");
//        String first = input.next(); //first name entered
//        String last = input.next(); //second name entered
//        //char c = input.charAt(0); fix this
//
//        System.out.printf("\nName entered: %s %s", first, last);

//        String s1 = "jafer";
//        String s2 = "Jafer";
//        System.out.println(s1.equals(s2));
//
//        String s3 = "Welcome To Java";
//        System.out.println(s3.substring(8));    //=> To Java    ***NOTE: the specified index IS INCLUDED in the output
//        System.out.println(s3.substring(8,13)); //=> To Ja      ***NOTE: the second specified index is not included in output

//        int x = 6, y = 7, z = 8;
//        System.out.printf("%d %d %d", x, y, z);

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number between 1-3: ");
//        int x = input.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("x = 1");
//                //break;
//            case 2:
//                System.out.println("x = 2");
//                break;
//            case 3:
//                System.out.println("x = 3");
//                break;
//            default:
//                System.out.println("x = ???");
//        }   //switch
//
//        System.out.println("Not switch statement");


//        String s = "Welcome to Java";
//        for (int i = 0; i<s.length(); i++) {
//            if(s.charAt(i) == ' ')
//                System.out.println("This is a space");
//            else
//                System.out.println(s.charAt(i));
//        }
//
//        int[] myArr = {10,20,30};
//
//        for(int i:myArr){
//            System.out.println(i);
//        }




        //WEEK 3, DAY 4



    }   //main
}   //class
