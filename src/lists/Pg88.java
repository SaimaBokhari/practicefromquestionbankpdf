package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg88 {
    public static void main(String[] args) {
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

        Integer counter = 0;

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
            System.out.println("At least one element is repeated");
        }









    }
}
