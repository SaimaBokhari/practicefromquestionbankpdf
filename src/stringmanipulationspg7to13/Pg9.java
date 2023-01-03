package stringmanipulationspg7to13;

public class Pg9 {
    public static void main(String[] args) {

        /*
        6) Create a String variable and find the sum of the ASCII values of
        the first and the last characters of the String.
         */

        String s = "I like mangoes";
        int indOfLastChar = s.length()-1;
        int AsciiOfFirstChar = s.charAt(0);
        int AsciiOfLastChar = s.charAt(indOfLastChar);

        System.out.println("The sum of ASCII values is:"+ " "+ AsciiOfFirstChar + AsciiOfLastChar);

        /*
        7) Create a String variable and print all characters except the first
        character on the console.
        Example:If the String is ‘Java’ you should print ‘ava’ on the console.
         */

        String s1 = "Potatoes are main crop";
        String s2 = s1.substring(1);
        System.out.println(s2);

        /*
        8) Create a String variable and print all characters except the last
        character on the console in upper cases.
        Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
         */

        String s3 = "Wheat is in shortage";
        int indOfLastCharacter = s3.length()-1;
        String uppercase = s3.substring(0, indOfLastCharacter).toUpperCase();

        System.out.println(uppercase);









    }
}
