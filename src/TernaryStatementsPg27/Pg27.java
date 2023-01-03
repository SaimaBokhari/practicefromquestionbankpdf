package TernaryStatementsPg27;

public class Pg27 {
    public static void main(String[] args) {

        /*
        1) Use ternary to print "Valid Password" if the password has at least 8 characters different
from space characters. "Invalid Password" if the password has less than 8 characters
different from space character
         */

        String password = "a12c3";

        String isValid = password.replaceAll("\\s","").length()>7 ? "Valid password": "Invalid password" ;
        System.out.println(isValid);

        /*
        2) Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */

        int a=9, b=4, c=7;

        String typeOfTriangle = a==b && b==c ? "Equilateral Triangle": a==b && b!=c ? "Isosceles Triangle" :"Neither isosceles, nor equilateral";

        System.out.println(typeOfTriangle);

        /*
        3) Use ternary to print
a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater
than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
than 5
For example; 127 will be rounded up and the value will be 130
125 will be rounded up and the value will be 130
123 will be rounded down and the value will be 120
         */

        int i = 127;
        String result = i%10>=5 ? ("Round up:" + (i/10+1)*10) : ("Round down:" + (i/10)*10);
        System.out.println(result);





    }
}
