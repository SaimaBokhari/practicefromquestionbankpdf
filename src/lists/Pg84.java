package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg84 {
    public static void main(String[] args) {
        /*
        6) If a list has 15 or 13, remove them.
Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
         */

        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(31);
        b.add(15);
        b.add(13);
        b.add(54);
        b.add(13);
        System.out.println(b);    // [10, 31, 15, 13, 54, 13]

        if (!b.contains(15) && (!b.contains(13))) {
            System.out.println("The list doesn't contain '13' and '15'.");
        } else {
            for (int i = 0; i < b.size(); i++){
                if (b.get(i) == 15) {
                    int idx15 = b.indexOf(15);
                    b.remove(idx15);
                    i--;
                }
                if (b.get(i) == 13) {
                    int idx15 = b.indexOf(13);
                    b.remove(idx15);
                    i--;
                }

            }

        }
        System.out.println(b);










    }
}
