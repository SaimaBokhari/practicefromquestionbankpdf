package maps;

import java.util.*;

public class Pg96 {
    public static void main(String[] args) {


        /*
        6) How to check the number of repeated elements in a List
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
       //  System.out.println(myList);

        Map<Integer, Integer> myMap = new HashMap<>();
        for(Integer w: myList){
            Integer numOfOccurrence = myMap.get(w);
            if(numOfOccurrence == null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(myMap);
        Collection<Integer> myValues = myMap.values();

        Integer counter =0;
        for(Integer w: myValues){
            if(w>1){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
