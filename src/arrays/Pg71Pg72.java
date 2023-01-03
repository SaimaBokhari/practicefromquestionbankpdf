package arrays;

import java.util.Arrays;

public class Pg71Pg72 {
    public static void main(String[] args) {

        /*
        1.  Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */

        int[ ] a = {12, 5, 13, 8, 10, 18};
        Arrays.sort(a);       // {5,8,10,12,13,18 }
        if(a.length%2 !=0){
            Integer idxOfMiddleElement = a.length/2;  // 2.5
            System.out.println(idxOfMiddleElement);
        }else{
            Integer idxOfMiddleElement = a.length/2;
            Integer avgValue = (a[idxOfMiddleElement] + a[idxOfMiddleElement-1]/2);
            System.out.println(avgValue);
        }


        /*
        2.   Find the smallest positive element and greatest negative element in an integer array
        Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
         */

//        // 1.Way:
//        int[] a = {-12, 18, -5, 23, -2, 16, 12, 6};
//        Arrays.sort(a);    // {-2, -5, -12, 6, 12, 16, 18, 23}
//        Integer minPositive = a[a.length-1];   // a[8-1] ==> a[7]
//        Integer maxNegative = a[0];
//        for(Integer w : a){
//            if(w>=0){
//                minPositive = Math.min(minPositive,w);   // Math.min( a[4], w)
//            }
//            if(w<0){
//                maxNegative = Math.max(maxNegative, w);
//            }
//        }
//        System.out.println("Minimum positive: " + minPositive);
//        System.out.println("Maximum negative: " + maxNegative);


//        // 2nd way:
//
//        int[] a = {-12, 18, -5, 23, -2};
//        Arrays.sort(a);          // {-2, -5, -12, 18, 23}
//        for (Integer i=0;i<a.length;i++) {
//            if (a[i] < 0 && a[i + 1] > 0) {
//                System.out.println("Maximum negative: " + a[i]);
//                System.out.println("Minimum positive: " + a[i + 1]);
//            }
//        }



    }
}
