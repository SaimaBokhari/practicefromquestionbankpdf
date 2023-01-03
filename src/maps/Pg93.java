package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Pg93 {
    public static void main(String[] args) {
/*
1) There is a Map which contains product names as key and number of the products as value.
Type code to find the total number of products.
 */

        Map<String,Integer> products = new HashMap<>();
        products.put("Laptop", 12);
        products.put("TV", 53);
        products.put("Refrigerator", 12);
        products.put("Music System", 83);

        System.out.println(products);
        Collection<Integer> numOfProducts = products.values();

        Integer sum =0;
        for(Integer w:numOfProducts) {
            sum = sum +w;
        }
        System.out.println(sum);


        /*
        2) There is a Map which contains product names as key and number of the products as value.
Type code to check if ‘Laptop’ is among the products.
         */

        String expectedProduct = "Laptop";
        if(products.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " exists");
        }else {
            System.out.println(expectedProduct + " doesn't exist");
        }





    }
}
