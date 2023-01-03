package variablespg3pg4;

import java.util.Scanner;

public class Pg4 {
    public static void main(String[] args) {
        /*
        5) Create two boolean variables whose values are different and print their values in the same
        line with a space between two consecutive values.
        */

        boolean a = true, b=false;
        System.out.println(a + " " + b);

        /*
        6) Create 3 float variables for the price of a book, notebook, and laptop.
        Print the total price of 2 books, 4 notebooks and 3 laptops on the console
         */

        float book = 15.5F, notebook = 9.90F, laptop = 570.90F;
        System.out.println("Total price is:" + " "+ ((2*book)+(4*notebook)+(3*laptop)));

        /*
        7) Type a code to swap two integers.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping:" +n1 + "," + n2);

        // 1sy Way: Use 3rd variable
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: " + n1 + "," + n2);

        // 2nd way: Do not use 3rd variable

        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("After swapping:" +n2 + "," + n1);




    }
}
