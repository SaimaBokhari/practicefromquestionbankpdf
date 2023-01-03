package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pg92 {
    public static void main(String[] args) {
        /*
        5) Type code to check if a List has repeated elements or not

         */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(13);
        myList.add(15);
        myList.add(7);
       // myList.add(13);

        Set<Integer> mySet = new HashSet<>(myList);
        if(myList.size()>mySet.size()){
            System.out.println("The list has repeated elements");
        }else{
            System.out.println("The list doesn't have repeated elements");
        }







    }
}
