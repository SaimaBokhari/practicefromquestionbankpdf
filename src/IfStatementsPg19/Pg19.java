package IfStatementsPg19;

import java.util.Scanner;

public class Pg19 {
    public static void main(String[] args) {
        /*
        1) Type code to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a month");
        String monthName = input.nextLine();
        monthName= monthName.toLowerCase();

        if(monthName.equals("december") || monthName.equals("january") || monthName.equals("february") ){
            System.out.println("Winter");
        }else if(monthName.equals("march") || monthName.equals("april") || monthName.equals("may")){
            System.out.println("Spring");
        }else if(monthName.equals("june") || monthName.equals("july") || monthName.equals("august")){
            System.out.println("Summer");
        }else if(monthName.equals("september") || monthName.equals("october") || monthName.equals("november")){
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }


        /*
        2) Type code to print
a) "Valid Password" if the password has at least 8 characters different from space character
b) "Do not use space character in password" if the password has any space character in any position
c) "Invalid Password" if a and b conditions are not satisfied

Note: Be careful about the orders of conditions in the solution
         */

        System.out.println("Enter your password");
        String pwd = input.next();


         if(pwd.replaceAll("\\s","").length()>=8){
            System.out.println("Valid password");
        }else if(pwd.replaceAll("\\s", "").length()>0){
            System.out.println("Do not use space character in password");
        }else{
            System.out.println("Invalid password");
        }

         /*
         3) Type code to print
a) "Round up by last digit:" and print the rounded value if the last digit is greater than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit is less than 5
          */

        int i = 56;

        if(i%10>=5){
            System.out.println("Round up by last digit:" + (i/10+1)*10);
        }else if(i%10<5){
            System.out.println("Round up by last digit:" + (i/10)*10);
        }else{
            System.out.println("Invalid data");
        }












    }
}
