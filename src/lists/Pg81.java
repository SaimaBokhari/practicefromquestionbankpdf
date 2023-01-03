package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg81 {
    public static void main(String[] args) {
        /*
        3) Find the multiplication of all even list elements in an integer list.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int x = 1;

        // 1st way:
        for(Integer w: myList){
            if(w%2==0) {
                x = x * w;
            }
        }
        System.out.println(x);

        // 2nd way:
//
//        for(Integer w: myList){
//            if(w%2!=0){
//                continue;    // skip the odd numbers
//            }
//            x = x*w;
//        }
//        System.out.println(x);





    }
}
