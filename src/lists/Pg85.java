package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pg85 {
    public static void main(String[] args) {

        /*
        7) Find the closest 2 integers in an Integer List
Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
         */
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        System.out.println(h);    // [12, 31, 15, 13, 54]

        Collections.sort(h);
//        System.out.println(h);    // [12, 13, 15, 31, 54]

        // sort () will not work in every condition e.eg if this is the list{12, 89, 91, 103}
        // answer should be 89,91 but solrt () will just give the first two digits 12, 89 which is wrong answer fo this question.

        int minDiff = h.get(2) - h.get(1);
        System.out.println(minDiff);   // 2

        for (int i = 1; i < h.size(); i++) {
            minDiff = Math.min(minDiff, h.get(i) - h.get(i - 1));
        }
        for (Integer i = 1; i < h.size(); i++) {
            if (h.get(i) - h.get(i - 1) == minDiff) {
                System.out.println(h.get(i) + " and " + h.get(i - 1));
            }
        }






    }

}
