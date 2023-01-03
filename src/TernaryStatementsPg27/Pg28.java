package TernaryStatementsPg27;

import java.util.Scanner;

public class Pg28 {
    public static void main(String[] args) {

        /*
        4) Type Apex code by using nested ternary.
Write a program to check if a year is a leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
         */


        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = input.nextInt();
//
//        String isLeap = (year%100==0)? (year%400==0)? "Leap year" : "Not Leap year"  : (year%4==0)? "Leap year" : "Not Leap year"  ;
//        System.out.println(isLeap);
//
//        /*
//        5) Type code to check the password
//If it has more than 8 characters, initial should be 'i'
//If it does not have more than 8 characters initial should be 'K'
//Solve the task by using nested-ternary
//         */
//
//        System.out.println("Enter your password");
//        String pwd = input.next();
//
//        String pwd1 = pwd.length()>8?pwd.startsWith("i") ? "Valid Password": "Invalid password" : pwd.startsWith("K")? "Valid password": "Invalid password";
//        System.out.println(pwd1);

        /*
        6) Type code to calculate the absolute value of a number
For positive numbers and zero absolute value is the same with the number
For negative numbers to find absolute value multiply the number by -1
         */
        // 1st way:
        System.out.println("Enter a number");
        int num = input.nextInt();

        int absValue = num<0 ? -1*num: num;
        System.out.println(num);

        // 2nd way:
        int i = -5;
        int absValue1 = i<0 ? -1*i : i;
        System.out.println(absValue1);

        /*
        7) Write a program to print the minimum of 2 integers on the console by using ternary.
         */

        // 1st way:
        System.out.println("Enter first number");
        int firstNum = input.nextInt();

        System.out.println("Enter second number");
        int secondNum = input.nextInt();

        int result = firstNum<secondNum? firstNum : secondNum;
        System.out.println(result);








    }
}
