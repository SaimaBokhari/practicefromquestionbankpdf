package stringmanipulationspg7to13;

import java.util.Scanner;

public class Pg11 {

    public static void main(String[] args) {

        /*
        12) Type code to check if a String has an uppercase initial and
        dot at the end.
        Example: For ‘Ali’ your code should print false on the console
        For ‘ali.’ your code should print false on the console
        For ‘ Ali. ’ your code should print false on the console
        For ‘Ali.’ your code should print true on the console
        For ‘ALI.’ your code should print true on the console
         */

        String s1 = "ali.";
        char firstChar = s1.charAt(0);
        char lastChar = s1.charAt(s1.length()-1);

        boolean firstCharUpperCase =  firstChar>= 'A' && lastChar<='Z';
        boolean lastCharWithDot = lastChar == '.';

        System.out.println(firstCharUpperCase && lastCharWithDot );



        /*
        13) Type code to check if a password is valid or not for the following
        conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol
        Example: For ‘A2b!’ your code should print false on the console
        For ‘A2b3cdef’ your code should print false on the console
        For ‘!1a23b4’ your code should print false on the console
        For ‘!1a23b4?es’ your code should print true on the console
        For ‘! a b 3 k’ your code should print false on the console
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password please");
        String pwd = scan.next();

        boolean pwdChar = pwd.replaceAll("\\s","").length()>7;
        boolean pwdSymbol = pwd.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println("Password is valid?" + " " + (pwdChar && pwdSymbol));







    }
}
