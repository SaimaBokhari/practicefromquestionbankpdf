package listsinlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Pg82 {
    public static void main(String[] args) {
        // 4) Check if elements are in descending order in a list
        //Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        //(Yellow, Red, Green, Blue) ==> Output: It is in descending order

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(f);

        //Lambda
        descendingOrder(e);




    }
    public static void descendingOrder(List<String> list){
       list.stream().sorted(Comparator.comparing(String::length).reversed());

    }









}
