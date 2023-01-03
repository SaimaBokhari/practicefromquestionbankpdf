package variablespg3pg4;

public class Pg3 {
    public static void main(String[] args) {
      /*
        1) Create double variables for the prices of any 3 items. Print the sum of the prices on the
        console with a label.
       */
        double shirtP = 45, hatP = 35, shoeP = 89;
        System.out.println("Total price:" + " " + (shirtP + hatP + shoeP));

        /*
        2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
multiplication of the values on the console with a label.
         */

        float priceOfLaptop = 999.90F;
        long priceOfLexus = 8700;
        int priceOfDesktop = 590;
        System.out.println("Total price:" + " " + (priceOfLaptop * priceOfLexus * priceOfDesktop));

        /*
        3) Type a code to find simple interest.
        Note: Simple interest formula = principal * rate * numberOfYear / 100
         */

        int principal = 10000, rate = 7, numberOfYear = 8;
        System.out.println("Simple interest is:"+ " " + (principal*rate*numberOfYear/100));


        /*
        4) Create a String and two Long variables. Print the sum and the multiplication of the long
        variables with the String on the console.
        String s = "The result is ";
         */
        String s = "The result is";
        long l1 = 234, l2 = 678;
        System.out.println(s + " " + (l1+l2));
        System.out.println(s + " " + (l1*l2));




    }
}
