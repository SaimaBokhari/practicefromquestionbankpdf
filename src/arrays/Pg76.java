package arrays;

import java.util.Arrays;

public class Pg76 {
    public static void main(String[] args) {
        /*
        9) Type code to find if a given element exists in a given array or not.
         */

        String s = "Apex is an object oriented programming language.";
        String st[] = s.split(" ");
        System.out.println(Arrays.toString(st));

        String element = "object";
         int counter = 0;

         for(String w: st){
             if(w.equalsIgnoreCase(element)){
                 counter++;
             }
         }
        if(counter>0){
            System.out.println(element + " exists.");
        }else{
            System.out.println(element + " doesn't exist.");
        }

        /*
        10) Type code to find sum of the number of characters of array elements.
         */

        String s1 = "Apex is an object oriented programming language.";
        String str[] = s.split(" ");

        int sum = 0;

        for(String w: str){
            sum = sum + str.length;
        }
        System.out.println(sum);










    }
}
