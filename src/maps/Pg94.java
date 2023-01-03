package maps;

import java.util.*;

public class Pg94 {
    public static void main(String[] args) {
/*
3) There is a Map which contains product names as key and number of the products as value.
Print the prices in ascending order.
 */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        System.out.println(product);

       Object[] prices = product.values().toArray();
       Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));


        /*
        4) There is a Map which contains product names as key and number of the products as value.
Print the product names in alphabetical order.
         */


        // to get the keys
        Set<String> namesOfProducts = product.keySet();
        System.out.println(namesOfProducts);

        // to convert to a list so we can apply sort() later
       List<String> alphabeticalOrder = new ArrayList<>(namesOfProducts);
        System.out.println(alphabeticalOrder);
        // to put them in alphabetical order

        Collections.sort(alphabeticalOrder);
        System.out.println(alphabeticalOrder);


    }
}
