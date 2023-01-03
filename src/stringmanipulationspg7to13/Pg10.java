package stringmanipulationspg7to13;

public class Pg10 {
    public static void main(String[] args) {

        /*
        9) Create a String variable and print all characters except the first
        character and the last character on the console in upper cases.

        Example:If the String is ‘Java’ you should print ‘AV’ on the console.
         */

        String s = "Java";
        int indOfLatChar = s.length()-1;
        String s1 = s.substring(1,indOfLatChar).toUpperCase();

        System.out.println(s1);

        /*
        10) Type code to check if a String has just a single space character at
        any position in the middle.
        Example: For ‘Ali Can’ your code should print false on the console
        For ‘ Ali Can ’ your code should print false on the console
        For ‘ Ali Can ’ your code should print false on the console
        For ‘Ali Can’ your code should print true on the console
         */

        String s2 = "Tom Hanks";
        String s3 = s2.trim(); // 9 characters after trimming
        String s4 = s3.replaceAll("\\s", ""); // 8 characters left after removing space

        boolean b1 = s3.length() - s4.length() == 1;
        System.out.println(b1);

        /*
        11) Type code to check if a String does not have any space character
        at the beginning and at the end?
        Example: For ‘ Ali ’ your code should print false on the console
        For ‘Ali’ your code should print true on the console
         */
        String str = " Ali ";
        String strTrimmed = str.trim();
        boolean result = str.equals(strTrimmed);
        System.out.println(result);

        String str1 = "Sci fi is famous these days.";
        String str1Trimmed = str1.trim();
        boolean result1 = str1.equals(str1Trimmed);
        System.out.println(result1);












    }
}
