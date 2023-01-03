package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class Pg73 {

    public static void main(String[] args) {
        /*
    3. Find the elements whose length is the smallest in a String array
    Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

     */
        String names[] = {"Jonathan", "Kemal", "Ali", "Mark", "Angie" , "Tommy"};

        int minLength = names[0].length();
        System.out.println(minLength);

        for(String w: names){
            minLength = Math.min(minLength, w.length());
        }
        for(String w : names){
            if(minLength == w.length()){
                System.out.println(w);
            }
        }

        // 2nd way: by Yasin

        Arrays.sort(names,Comparator.comparing(String::length)); // Comparator () sorts the strings in min to max oredrer.
        System.out.println(Arrays.toString(names));

        for(String w : names) {
            if (minLength == w.length()) {
                System.out.println(w);
            }
        }




//        /*
//        4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'.
//        Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM
//         */
//
//        String b[] = {"Jonathan", "Kemal", "Mark", "Jackson" , "Ali"};
//        String initials ="";
//
//        for(String w: b){
//            if(w.endsWith("n") || (w.endsWith("k"))){
//                initials = initials + w.substring(0,1);
//            }
//        }
//        System.out.println(initials);









    }
}
