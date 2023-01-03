package IfStatementsPg19;

import java.util.Scanner;

public class Pg21Pg22 {
    public static void main(String[] args) {

        /*
        4) Type code to print the name of the month when you entered the number of the month.
             Example; For 1 output is "January", for 2 output is "February" etc.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int numberOfMonth = input.nextInt();

        if(numberOfMonth==1){
            System.out.println("January");
        }else if(numberOfMonth==2){
            System.out.println("February");
        }else if(numberOfMonth==3){
            System.out.println("March");
        }else if(numberOfMonth==4){
        System.out.println("April");
        }else if(numberOfMonth==5){
            System.out.println("May");
        }else if(numberOfMonth==6){
            System.out.println("June");
        }else if(numberOfMonth==7){
            System.out.println("July");
        }else if(numberOfMonth==8){
            System.out.println("August");
        }else if(numberOfMonth==9){
            System.out.println("September");
        }else if(numberOfMonth==10){
            System.out.println("October");
        }else if(numberOfMonth==11){
            System.out.println("November");
        }else if(numberOfMonth==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid number");
        }

        /*
        5) Type code to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */

        System.out.println("Enter the value of side a");
        int a = input.nextInt();

        System.out.println("Enter the value of side b");
        int b = input.nextInt();

        System.out.println("Enter the value of side c");
        int c = input.nextInt();

        if(a==b && b!=c){
            System.out.println("Isosceles Triangle");
        }else if(a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else{
            System.out.println("Neither isosceles, nor equilateral");
        }

        /*
        6) Type code to create a converter which converts mile to km, second to hour, fahrenheit to
celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km"(The
number will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2
Hours"(The number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print
"28.3333 celsius"(The number will be dynamic) on the console
         */

        //1st way: user input

        System.out.println("Enter 1, 2 or 3");
        byte num = input.nextByte();

        if(num==1){
            System.out.println("Enter miles");
            double miles = input.nextDouble();
            System.out.println(miles*1.60934 + "km");
        }else if(num==2){
            System.out.println("Enter seconds");
            double seconds = input.nextDouble();
            System.out.println((seconds/60)/60 + "hours");
        }else if(num==3){
            System.out.println("Enter temp in F");
            double fah = input.nextDouble();
            System.out.println((fah-32)*5/9 + "Celcius");
        }else{
            System.out.println("Invalid data");
        }

        // 2nd way: given data

//        double miles = 10;
//        double seconds = 7200;
//        double fah = 83;
//
//        String operator = "fahrenheitToCelsius";
//
//        if(operator.equals("mileToKm")){
//            System.out.println(miles*1.60934);
//        }else if(operator.equals("secondsToHours")){
//            System.out.println((seconds/60)/60);
//        }else if(operator.equals("fahrenheitToCelsius")){
//            System.out.println((fah-32)*5/9);
//        }










    }
}
