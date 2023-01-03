package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Review {
    public static void main(String[] args) {
         /*
        1) Find the sum of all list elements in an integer list
         */
//        List<Integer> myList = new ArrayList<>();
//        myList.add(12);
//        myList.add(31);
//        myList.add(7);
//        myList.add(13);
//        myList.add(10);
//        System.out.println(myList);
//
//        int sum= 0;
//        for(Integer w: myList) {
//                sum = sum + w;
//        }
//        System.out.println(sum);

        /*
        2) Find the sum of all list elements before the first occurrence of 13 in an integer list
         */
//
//        for(Integer w: myList){
//            if(w==13){
//                break;
//            }
//            sum = sum+w;
//        }
//        System.out.println(sum);
//
         /*
        3) Find the multiplication of all even list elements in an integer list.
         */
//        List<Integer> myList = new ArrayList<>();
//        myList.add(12);
//        myList.add(31);
//        myList.add(7);
//        myList.add(13);
//        myList.add(10);
//
//       int x = 1;
////
//        for(Integer w: myList){
//            if(w%2 == 0){
//              x = w*x;
//            }
//        }
//        System.out.println(x);

//        for(Integer w: myList){
//            if(w%2 != 0){
//                continue;
//            }
//            x = w*x;
//        }
//        System.out.println(x);
//

        /*
        4) Check if elements are in descending order in a list
Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
(Yellow, Red, Green, Blue) ==> Output: It is in descending order
         */

//        List<String> myList = new ArrayList<>();
//        myList.add("Yellow");
//        myList.add("Red");
//        myList.add("Green");
//        myList.add("Blue");
//        System.out.println(myList);
//
//        List<String> m = new ArrayList<>();
//        m.addAll(myList);
//        Collections.sort(m);
//        System.out.println(m);
//
//        int size = m.size();
//        int counter = 0;
//
//        for(int i=0; i<size; i++){
//            if(m.get(i).equals(myList.get(size-1-i))){
//                counter++;
//            }
//        }
//        if(counter==size){
//            System.out.println("It is in descending order");
//        }else{
//            System.out.println("It is not in descending order");
//        }

         /*
        5) If the list has 15 as element, change all 15s to 51
Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
         */

//       List<Integer> a = new ArrayList<>();
//        a.add(12);
//        a.add(11);
//        a.add(18);
//       a.add(15);
//        a.add(43);
//        System.out.println(a);
//
//        int idx = a.indexOf(15);
//        int counter = 0;
//
//        if(a.contains(15)){
//            for(Integer w: a){
//                if(w==15){
//                    a.set(idx, 51);
//                }
//            }
//        System.out.println(a);
//        }else {
//            System.out.println("The expected element is not there.");
//        }

         /*
        6) If a list has 15 or 13, remove them.
Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
         */
//
//        List<Integer> b = new ArrayList<>();
//        b.add(10);
//        b.add(31);
//        b.add(15);
//        b.add(13);
//        b.add(54);
//        b.add(13);
//        System.out.println(b);
//
//
//        if(!b.contains(13) && !b.contains(15)){
//            System.out.println("The list doesn't contain '13' or '15'.");
//        }else{
//            for(int i=0; i<b.size(); i++){
//                if(b.get(i) == 13){
//                    int idx13 = b.indexOf(13);
//                    b.remove(idx13);
//                    i--;
//                }
//                if(b.get(i) == 15){
//                    int idx15 = b.indexOf(15);
//                    b.remove(idx15);
//                    i--;
//                }
//            }
//        }
//        System.out.println(b);

         /*
        7) Find the closest 2 integers in an Integer List
Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
         */
//        List<Integer> h = new ArrayList<>();
//        h.add(12);
//        h.add(31);
//        h.add(15);
//        h.add(13);
//        h.add(54);
//        System.out.println(h);
//
//        Collections.sort(h);
//        System.out.println(h.get(0)  + " and " + h.get(1)); // sort () will not work in every condition. {12, 89, 91, 103}
//
//        int miniDiff = h.get(2) - h.get(1);
//
//        for(int i=1; i<h.size(); i++){
//            miniDiff = Math.min(miniDiff, h.get(i)-h.get(i-1));
//        }
//        for(int i=1; i<h.size(); i++){
//            if(h.get(i)-h.get(i-1) == miniDiff){
//                System.out.println(h.get(i) + " and " + h.get(i-1));
//            }
//        }
//
//
//        List<String> myList = new ArrayList<>();
//        myList.add("$12.99");
//        myList.add("$23.60");
//        myList.add("$54.45");
//        System.out.println(myList);
//
//        double sum = 0;

//        for(String w: myList){
//            Double price = Double.valueOf(w.replaceAll("\\$",""));
//            sum = sum + price;
//        }
//        System.out.println(sum);

//        List<Double> decimalList = new ArrayList<>();
//
//        for(String w: myList){
//            Double price = Double.valueOf(w.replaceAll("\\$", ""));
//            decimalList.add(price);
//        }
//        Collections.sort(decimalList);
//        System.out.println(decimalList);
//
//        Double sum1 = decimalList.get(0) + decimalList.get(decimalList.size()-1);
//        System.out.println(sum1);
//

        /*
        11) Check if all elements are unique in an integer List by using loops.
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        System.out.println(myList);
        System.out.println(myList);

        int counter =0;
        for(Integer w: myList){
            for(Integer k: myList){
                if(w==k){
                    counter++;
                }
            }
        }
        if(counter == myList.size()){
            System.out.println("There is no repeated element");
        }else{
            System.out.println("There is at least one element repeated ");
        }
















    }
}
