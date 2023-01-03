package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg86 {
    public static void main(String[] args) {
        /*
        8) Increase the value of every element except 7 and 10 by 2 in a List
Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
         */

        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);
        System.out.println(h);    // [12, 31, 7, 13, 10]


        for(Integer w: h){
            if(w==7 || w==10){
                continue;
            }
            h.set(h.indexOf(w), w+2);
        }
        System.out.println(h);   // [14, 33, 7, 15, 10]

        /*
        9) Find the sum of all prices given in a String list
Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
         */

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        System.out.println(myList);

       double sum = 0;

        for(String w: myList){
            Double price = Double.valueOf(w.replace("$", ""));
            sum = sum + price;
        }
        System.out.println(sum);  // 91.04






    }
}
