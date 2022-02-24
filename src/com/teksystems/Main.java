package com.teksystems;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    enum Days {
        Mon, Tues, Weds, Thurs, Fri, Sat, Sun
    }

    public static void main(String[] args) {                //main
        //CORE JAVA - EXERCISE - LOOPS (problemOne - problemNine)
        //CORE JAVA - EXERCISE - CONTROL FLOW (problemTen - problemFifteen)
//        problemOne();
//        problemTwo();
//        problemThree();
//        problemFour();
//        problemFive();
//        problemSix();
//        problemSeven();
//        problemEight();
//        problemNine();

//        problemTen();
//        problemEleven();
//        problemTwelve();
//        problemThirteen();
//        problemFourteen();
//        problemFifteen();
//        notes_2_24();
    }

//    public static void problemOne() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//    }

//    public static void problemTwo() {
//        int x = 0;
//        while (x <= 100) {
//            System.out.println(x);
//            x += 10;
//        }
//    }

//    public static void problemThree() {
//        int x = 1;
//        do {
//            System.out.println(x);
//            x += 1;
//        }while (x < 11);
//    }

    //Write a program that uses a for-loop to loop through the numbers 1-100.
    // Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75.
    // Use the “continue” statement to accomplish this.

//    public static void problemFour() {
//        for (int i = 0; i <= 100; i++) {
//            if ((i % 5 == 0) && ((i < 25) || (i > 75))){
//                System.out.println(i);
//            } else{
//                continue;
//            }
//        }
//
//
//    }

//    public static void problemFive() {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            } if (i > 50){
//                break;
//            }
//        }
//    }

//    public static void problemSix() {
//        for (int i = 1; i < 3; i++) {
//            System.out.printf("Week %d\n", i);
//            for (int j = 1; j < 6; j++) {
//                System.out.printf("Day %d\n", j);
//            }
//        }
//    }

//    public static void problemSeven() {
//        for (int i = 10; i < 200; i++) {
//
//            String s = Integer.toString(i);
//            int first = 0;                              //Will use 'first' to increment from left-most character
//            int last = s.length() - 1;                  //Will use 'last' to decrement from right-most character
//
//            while (first <= last) {
//                if ((s.length() % 2) == 0) {            //If string has a length that is even
//                    if (last == (first + 1)) {
//                        if (s.charAt(first) == s.charAt(last)) {
//                            System.out.println(s);
//                            break;
//                        } else {
//                            break;
//                        }
//                    } else {
//                        if (s.charAt(first) == s.charAt(last)) {
//                            first++;
//                            last--;
//                        } else {
//                            break;
//                        }
//                    }
//
//                } else {                        //If string has a length that is odd
//                    if (last == first) {
//                        System.out.println(s);
//                        break;
//                    } else {
//                        if (s.charAt(first) == s.charAt(last)) {
//                            first++;
//                            last--;
//                        } else {
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//    }

    //11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191

    //Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
//    public static void problemEight() {
//        int x = 0;
//        int y = 1;
//        int z = x + y;
//        System.out.println(x);
//        System.out.println(y);
//        while (z < 50) {
//            System.out.println(z);
//            x = y;
//            y = z;
//            z = y + x;
//        }
//    }






        //CORE JAVA - EXERCISE - CONTROL FLOW (CONDITIONAL) STATEMEENTS

//    public static void problemTen() {
//        int x = 15;
//        if (x < 10)
//            System.out.println("Less than 10");
//    }
//
//    public static void problemEleven() {
//        int x = 7;
//        int y = 15;
//        if (y < 10) {
//            System.out.println("Less than 10");
//        } else {
//            System.out.println("Greater than 10");
//        }
//    }
//
//    public static void problemTwelve() {
//        int x = 15;
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else if (x > 10 && x < 20) {
//            System.out.println("Between 10 and 20");
//        } else {
//            System.out.println("Greater than or equal to 20");
//        }
//    }
//
//    public static void problemThirteen() {
//        int x = 15;
//        int y = 5;
//        if (y < 10 || y > 20) {
//            System.out.println("Out of range");
//        } else {
//            System.out.println("In range");
//        }
//    }
//
//    public static void problemFourteen() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a numerical score: ");
//        int x = input.nextInt();
//
//        if (x >= 90 && x <= 100) {
//            System.out.println("A");
//        } else if (x >= 80 && x <= 90) {
//            System.out.println("B");
//        } else if (x >= 70 && x <= 80) {
//            System.out.println("C");
//        } else if (x >= 60 && x <= 70) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//    }
//
//    public static void problemFifteen() {
//        //Question 6
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 7, inclusive: ");
//        int x = input.nextInt();
//        //String weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//
//        if (x >= 1 && x <= 7) {
//
//            switch (x) {
//                case 1:
//                    System.out.println(Days.Mon);
//                    break;
//                case 2:
//                    System.out.println(Days.Tues);
//                    break;
//                case 3:
//                    System.out.println(Days.Weds);
//                    break;
//                case 4:
//                    System.out.println(Days.Thurs);
//                    break;
//                case 5:
//                    System.out.println(Days.Fri);
//                    break;
//                case 6:
//                    System.out.println(Days.Sat);
//                    break;
//                case 7:
//                    System.out.println(Days.Sun);
//                    break;
//                default:
//                    System.out.println("Out of range");
//            }
//
//        } else {
//            System.out.println("Not within range");
//        }
//    }

















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




        //WEEK 3, DAY 4 - Java - Arrays,

//    public static void notes_2_24() {
//        String[] arr = new String[3]; //declaring an Array

//        String[] arr = {"Jafer", "Josh", "Franz"};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


//        arr[0] = "Jafer";
//        arr[1] = "Josh";
//        arr[2] = "Franz";
        //method 1
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Index %d value: %s\n", i, arr[i]);
//        }

        //method 2
//        System.out.println(Arrays.toString(arr));

        //method 3
//        for(String x:arr){
//            System.out.println(x);
//        }

        //Deck of cards
//        int[] deck = new int[52];
//        //Initialize cards
//        for (int i = 0; i < deck.length; i++) {
//            deck[i] = i;
//        }

        //2D array
//        String[][] arr1 = {
//                {"Jafer0", "Brian0", "Franz0"},
//                {"Jafer1", "Brian1", "Franz1"},
//                {"Jafer2", "Brian2", "Franz2"}
//        };

//        System.out.println(arr1[1][2]);
//
//        for (int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr1[row].length; col++){
//                System.out.println(arr1[row][col]);
//            }
//        }

//        for (String[] row:arr1){ //
//            for (String ele:row){   //accessing elements
//                System.out.println(ele);
//            }
//        }

        //3D array

//        String[][][] arr2 = {
//                {{"Jafer0", "Brian0"}, {"Franz0"}},
//                {{"Jafer1"}, {"Brian1", "Franz1"}},
//                {{"Jafer2"}, {"Brian2", "Franz2", "dd"}}
//        };
//        System.out.println(arr2[2][1][2]); //returns dd

//        for (String[][] row:arr) {
//            for (String[] col : row) {
//                for (String ele : col) {
//                    System.out.printf("index r: %d c:%d e: %d - v: %s\n", row, col, ele, arr[row][col][ele]); //fix this
//                }
//            }
//        }

        //this will create an array of random numbers -- IMPORTANT TO REMEMBER THIS
//        Random r = new Random();
//        int[] myArr = new int[100];
//
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] = r.nextInt(1000);
//        }
//
//        //prints the above array, then prints the array, sorted, then prints the index of 0
//        System.out.println(Arrays.toString(myArr));
//        Arrays.sort(myArr);
//        System.out.println("-----------");
//        System.out.println(Arrays.toString(myArr));
//        int i = Arrays.binarySearch(myArr, 0);
//        System.out.println(i);

//    }




}   //class
