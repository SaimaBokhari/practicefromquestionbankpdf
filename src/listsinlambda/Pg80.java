package listsinlambda;

import java.util.ArrayList;
import java.util.List;

public class Pg80 {
    public static void main(String[] args) {
        // 1. 1) Find the sum of all list elements in an integer list

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum =0;
        for(Integer w: myList){
            sum += w;
        }
        System.out.println(sum);
        // in Lambda
        sumOfInt(myList);

        // 2. 2) Find the sum of all list elements before the first occurrence of 13 in an integer list

        int sum1 =0;
        for(Integer w:myList){
            if(w==13){
                break;
            }
            sum1 +=w;
        }
        System.out.println(sum1);
        // 2 in Lambda

        sumOfIntBeforeThirteen(myList);

    }
    //  1.  in Lambda
    public static void sumOfInt(List<Integer> list){
        Integer sum = list.stream().reduce(0,(t,u) -> t+u);
        System.out.println(sum);
    }

    // 2. in Lambda
    public static void sumOfIntBeforeThirteen(List<Integer> list){
        Integer sum = list.stream().filter(t-> t==13).reduce(0,(t,u) -> t+u);
        System.out.println(sum);
    }
}
