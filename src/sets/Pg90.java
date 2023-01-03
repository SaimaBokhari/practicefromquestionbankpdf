package sets;

import java.util.*;

public class Pg90 {
    public static void main(String[] args) {
        /*
        1) Type the code that shows how many different elements there are in a list.
Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

         */
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        //System.out.println(myList);

        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println(mySet.size());

        /*
        2) Type code to print different characters used in a String
Example: ‘Mississippi’ Ş Misp

         */


        String s = "Mississippi";
        String[] arr = s.split("");
        List<String> characters = Arrays.asList(arr);
        Set<String> mySet2 = new HashSet<>(characters);
        System.out.println(mySet2);





    }

}
