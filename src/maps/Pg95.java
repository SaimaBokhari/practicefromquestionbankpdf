package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pg95 {
    public static void main(String[] args) {

        /*
        5) Type code to count the number of occurrences of the words in a String. (Case insensitive)
         */

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

       String words=  s.replaceAll("\\p{Punct}", "").toLowerCase();

        String [] wordOccurrence = words.split(" ");
        // System.out.println(Arrays.toString(wordOccurrence));

        Map<String,Integer> result = new HashMap<>();

        for(String w: wordOccurrence){
            Integer numOfOccurrence = result.get(w);
            if(numOfOccurrence == null){
                result.put(w,1);
            }else{
                result.put(w , numOfOccurrence + 1);

            }
        }
        System.out.println(result);


    }
}
