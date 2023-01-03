package lists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Pg80 {
    public static void main(String[] args) {
        /*
        1) Find the sum of all list elements in an integer list
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        System.out.println(myList);

        int sum = 0;
//        for(Integer w: myList){
//                sum = sum + w;
//            }
//        System.out.println(sum);

        /*
        2) Find the sum of all list elements before the first occurrence of 13 in an integer list
         */

        for (Integer w: myList){
            if(w.equals(13)){
                break;
            }
            sum = sum + w;
        }
        System.out.println(sum);









    }
}
