package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pg82 {
    public static void main(String[] args) {
        /*
        4) Check if elements are in descending order in a list
Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
(Yellow, Red, Green, Blue) ==> Output: It is in descending order
         */

        List<String> myList = new ArrayList<>();
        myList.add("Yellow");
        myList.add("Red");
        myList.add("Green");
        myList.add("Blue");
        System.out.println(myList);

        List<String> a = new ArrayList<>();
        a.addAll(myList);

        Collections.sort(a);
        System.out.println(a);

        int size = myList.size();
        int counter = 0;

        for(int i=0; i<size; i++){
            if(a.get(i).equals(myList.get(size-1-i))){
                counter++;
            }
        }
        if(counter==size){
            System.out.println("It is in descending order");
        }else{
            System.out.println("It is not in descending order");
        }







    }
}
