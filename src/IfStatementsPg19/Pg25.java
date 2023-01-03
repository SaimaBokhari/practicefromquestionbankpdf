package IfStatementsPg19;

import java.util.Scanner;

public class Pg25 {
    public static void main(String[] args) {

        /*
        9) Type code to create a simple calculator which does addition, subtraction, multiplication,
and division with any 2 number
a) When user entered 10.2 and 5 and + sign your code should print "The result is
15.2" on the console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
on the console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
on the console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
on the console
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = input.nextDouble();

        System.out.println("Enter second number");
        double b = input.nextDouble();

        String operator = "*";

        if(operator.equals("+")){
            System.out.println("The sum is:" + " " + (a+b));
        }else if (operator.equals("-")){
            System.out.println("The difference is:" + " " + (a-b));
        }else if(operator.equals("*")){
            System.out.println("The result of multiplication is:" + (a*b));
        }else if(operator.equals("/")){
            System.out.println("The result of division is:" + " " + (a/b));
        }else{
            System.out.println("Invalid data");
        }












    }
}
