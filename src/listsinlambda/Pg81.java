package listsinlambda;

import java.util.ArrayList;
import java.util.List;

public class Pg81 {
    public static void main(String[] args) {
        // 3) Find the multiplication of all even list elements in an integer list
        //1.Way:
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int product = 1;
        for(Integer w:myList){
            if(w%2==0){
                product = product*w;
            }
        }
        System.out.println(product);
        //2nd way:
        int result =1;
        for(Integer w: myList){
            if(w%2 !=0){
                continue;
            }
            result = result*w;
        }
        System.out.println(result);

        // Lambda
        productOfEvenEle(myList);
    }
    // in Lambda

    public static void productOfEvenEle(List<Integer> list){
        Integer product = list.stream().filter(t-> t%2==0).reduce(1, (t,u) -> t*u);
        System.out.println(product);
    }
}
