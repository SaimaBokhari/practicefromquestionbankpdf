package SwitchStatementsPg30;

import java.util.Scanner;

public class Pg32Pg33 {
    public static void main(String[] args) {

        /*
        3) Type a code which prints the all month names starting with the given month numbers.
        Example: If the month number is 9 output will be September October November December
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of a month");
        int monthNumber = input.nextInt();

        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        /*
        4) Print "Boy" if the gender is "Male" (Ignore cases)
        Print "Girl" if the gender is "Female" (Ignore cases)
        Print "Others" if the gender is different from "Male" and "Female".
         */

        System.out.println("Enter your gender ");
        String gender = input.next().toLowerCase();

        switch(gender){
            case "male":
                System.out.println("Boy");
                break;
            case "female":
                System.out.println("Girl");
                break;
            default:
                System.out.println("Others");
        }








    }
}
