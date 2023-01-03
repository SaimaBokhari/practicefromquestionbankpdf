package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg79 {
    public static void main(String[] args) {

        /*
        13) Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
        Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
        on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = input.next();
        String s2 = input.next();

         String a1 [] = s1.toLowerCase().split("");
         String a2[] = s2.toLowerCase().split("");

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(s1.length() != s2.length()){
            System.out.println("Not an anagram");
        }else if(s1.isEmpty() || s2.isEmpty()){
            System.out.println("Not an anagram");
        }else if(Arrays.equals(a1,a2)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("Not an anagram");
        }









    }
}
