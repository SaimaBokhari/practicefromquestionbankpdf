package stringmanipulationspg7to13;

public class Pg13 {
    public static void main(String[] args) {

        /*
        16) Type code to get initials of the first name and the last name
        of a given name. Middle name is out of scope.

        Example: Tom Hanks ==> TH, Mary Star ==> MS
         */


        String name = "Tom Hanks";
        String initialOfFirstName = name.substring(0,1);
        int indOfInitialOfLastName = name.indexOf(" ")+1;
        String initialOfLastName = name.substring(indOfInitialOfLastName, indOfInitialOfLastName +1 );
        System.out.println(initialOfFirstName + initialOfLastName);

        /*
        17) Type a code to find the number of punctuation marks used in a String.
        String s = "Wow! Ali is 13 years old, but he is a university student.";
         */

        String s = "Wow! Ali is 13 years old, but he is a university student.";
        int s1 = s.length();
        int s2 = s.replaceAll("\\p{Punct}","").length();
        int numOfPunctMarks = s1-s2;
        System.out.println(numOfPunctMarks);















    }
}
