package IfStatementsPg19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pg23 {
    public static void main(String[] args) {
        /*
        7) Type code to check the grammatical rules for full name
a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
b) Your code should print "First name or last name missed" for single words like
"Ali" or "Can" or "ali"
c) Your code should print "Format error" for all the format like "ALI CAN"
d) Your code should print "Name was not entered" for one or more space
characters like " " or " "
e) Your code should print "Invalid Name" if the name has any character different
from letters and space.

Note: If the abbreviation has more than 1 error all related error messages should be
printed. For example; for "ali3" your code should print "Error in initials", "First name
or last name missed", and "Invalid Name"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name please");
        String fullName= input.nextLine();

        String initialOfFirstName = fullName.substring(0,1);
        Integer indexOfSpace = fullName.trim().indexOf(' ');
        String initialOfLastName = fullName.substring(indexOfSpace+1, indexOfSpace+2);

        boolean isFirstNameInitialUppercase = (initialOfFirstName.charAt(0)>= 'A' && initialOfFirstName.charAt(0)<= 'Z');
        boolean isLastNameInitialUppercase = (initialOfLastName.charAt(0)>= 'A' && initialOfLastName.charAt(0)<= 'Z');


        if(indexOfSpace == -1){
            System.out.println("First name or last name missed");
        }else if(!isFirstNameInitialUppercase || !isLastNameInitialUppercase){
            System.out.println("Error in initials");
        }else if (fullName.equals(fullName.toUpperCase())){
            System.out.println("Format error");
        }else if(fullName.replaceAll("\\s","").length()==0){
            System.out.println("Name was not entered");
        }else if(fullName.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0);
            System.out.println("Invalid name");


            // This is hard coding. Though the code is running without error, it doesn't produce correct
            // result for different inputs.


/*
8) Type code to check the format of state abbreviations in the USA
a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.

Note: If the abbreviation has more than 1 error all related error messages should be printed.
For example; for "fl3" your code should print, "State abbreviations cannot have more than
2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
cannot have characters different from letters"
 */

        System.out.println("Enter the abbreviation for a state in USA");
        String state = input.next();

        int numOfStateChars = state.length();
        boolean isStateCharacterUpper = state.charAt(0)>='A'&& state.charAt(1)<='Z';

        if(numOfStateChars>2){
            System.out.println("State abbreviations cannot have more than 2 characters");
        }else if(!isStateCharacterUpper){
            System.out.println("State abbreviations cannot have lowercase characters");
        }else if(state.replaceAll("[A-Za-z]", "").length()!=0){
            System.out.println("State abbreviations cannot have characters different from letters");
        }else{
            System.out.println("You got it!");
        }

        // Hard code









    }
}
