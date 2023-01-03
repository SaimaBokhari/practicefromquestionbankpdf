package SwitchStatementsPg30;

import java.util.Scanner;

public class Pg34 {
    public static void main(String[] args) {
        /*
        5) Type a code to display the number of days in a given month of a given year.
        Example: The number of days in February of 2000 was 29.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int month = input.nextInt();
        System.out.println("Enter the number of year");
        int year = input.nextInt();

        int numOfDays = 0;

        switch (month){
            case 1: case 3: case 5:
            case 7: case 8: case 10: case 12:
               numOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            case 2:
                if(((year%4==0) && !(year%100 ==0)) || (year%400==0)){
                    numOfDays=29;
                }else {
                    numOfDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println(numOfDays);


    }
}
