package stringmanipulationspg7to13;

import java.util.Locale;

public class Pg7Pg8 {
    public static void main(String[] args) {

        /* 1) Create a String variable for city names which have just a single word.
        Print the city name with the initial is in uppercase and all the other characters
        are in lower cases on the console.
                Example: mIAMI should be printed as Miami
                         miami should be printed as Miami
                         MIAMI should be printed as Miami
                         mIaMi should be printed as Miami etc.
         */

        String cityName = "mIaMi";
        String updatedCityName = cityName.trim().toLowerCase();
        updatedCityName = updatedCityName.substring(0,1).toUpperCase(Locale.ROOT) +
                updatedCityName.substring(1);
        System.out.println(updatedCityName);


        /*
        2) Create 3 String variables for people's names. Print the sum of the
        number of characters in all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see
        22 on the console.
         */
        String firstName = "Ali CAn", secondName = "Saima bOkhari" , thirdName = "Mark Tom";

        int name1 = firstName.replaceAll("\\s", "").length();
        int name2 = secondName.replaceAll("\\s", "").length();
        int name3 = thirdName.replaceAll("\\s","").length();
        System.out.println(name1 +name2 + name3);

        /*
        3) Create a String variable, print the total number of alphabetical and
        numeric characters in the String on the console.
        Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the
         */

        String s = "Miami 33018!!!";
        int numOfCharacters = s.replaceAll("\\s", "").
                replaceAll("[^A-Za-z0-9]", "").length();
        System.out.println("Total number:" + " " + numOfCharacters);

        /*
        4) Create a String variable, print the number of non-digit characters
        in the String on the console.
        Example: If the String is ‘1a3Bcf4!...’ or "2a3B4?-!5" you need to print 8 on the console.
         */

        String str = "2a3B4?-!5";
        Integer str1 = str.replaceAll("[0-9]", "").length();
        System.out.println("Total number of non-digit characters is:" + " " + str1);


        /*
        5) Create a String variable and print just the last non-space character
        on the console for any String.
        Example: For ‘Ali Can’ you should print 'n'.
        For ‘Miami ’ you should print 'i' etc.
         */

        String str2 = "Ali Can";
        int indOfLastNonSpaceChar = str2.trim().length()-1;
        String lastNonSpaceChar = str2.substring(indOfLastNonSpaceChar, indOfLastNonSpaceChar+1);

        System.out.println("Last non space character is:"+ " " + lastNonSpaceChar);


        String s1 = "Miami ";
        int idxOfLastNonSpace = s1.trim().length()-1;
        String lastNonSpaceChar1 = s1.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar1);

















    }
}
