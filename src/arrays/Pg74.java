package arrays;

import java.util.Arrays;

public class Pg74 {
    public static void main(String[] args) {
        /*
        5) Find the total number of characters used in String array elements.
        Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
         */

        String b[] = {"Jonathan", "Kemal", "Mark", "Jackson" , "Veli"};

        int sum = 0;

        for(String w: b){
            sum = sum + w.length();
        }
        System.out.println(sum);

        /*
        6) Count how many words start with 'a' or 'A' in a given String.
         */

        String s = "Apex is an object oriented programming language.";        // A quick brown fox jumps over a lazy dog.

           String str[] = s.split(" ");
            int counter = 0;

            for(String w: str){
                if(w.startsWith("a") || (w.startsWith("A"))){
                    counter++;
                }
            }
        System.out.println(counter);

            /*
            7) Find the number of vowels in a String.
             */

        String s1 = "Apex is an object oriented programming language.";
        String str1[] = s1.toLowerCase().split("");
        System.out.println(Arrays.toString(str1));

        int counter1=0;
        for(String w: str1){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter1++;
            }
        }
        System.out.println("The number of vowels:" + counter1);

        /*
        8. Type code to find array elements whose first and last characters are same.
         */

        String st[] = {"alabama", "pick", "sos", "sets", "pex"};

        int size = st.length;

        for(int i=0; i<size; i++){
            String firstChar = st[i].substring(0,1);
            String lastChar = st[i].substring(st[i].length()-1);
            if(firstChar.equals(lastChar)){
                System.out.println(st[i]);
            }
        }



























    }
}
