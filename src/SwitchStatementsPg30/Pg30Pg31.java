package SwitchStatementsPg30;

import java.util.Scanner;

public class Pg30Pg31 {
    public static void main(String[] args) {
        /*
        1) Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the month");
        String monthName = input.next().toLowerCase();

        switch(monthName){
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month name");
                break;
        }

        /*
        2) Use a switch statement to print the name of the month when you enter the number of
        the month. For example; if user enters 1 your code should print "January",
        if user enters 2 your code should print "February" etc. if user enters invalid month number
        your code should print "Invalid number”.
         */

        System.out.println("Enter the number of the month");
        int numOfMonth = input.nextInt();

        String monthString= new String(String.valueOf(numOfMonth));

        switch(numOfMonth){
            case 1: monthString ="January";
            break;
            case 2: monthString = "February";
            break;
            case 3: monthString ="March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString ="May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString ="July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString ="September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString ="November";
                break;
            case 12: monthString = "December";
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        System.out.println(monthString);








    }
}
