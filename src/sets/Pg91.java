package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pg91 {
    public static void main(String[] args) {
        /*
        3) Type code to print the common elements between a Set and a List
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

//        mySet.retainAll(myList);
//        System.out.println(mySet);

        /*
        4) Type code to print the different elements in a Set from a List
         */

        // using above list and set

        mySet.removeAll(myList);
        System.out.println(mySet);




    }
}
