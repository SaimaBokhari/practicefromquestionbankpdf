package typecastingpg5;

public class Pg5 {
    public static void main(String[] args) {
     /*
     1) Create a short variable and convert it to an int variable.
      */
        short price = 12;
        int newPrice = price;
        System.out.println(newPrice);

        /*
        Create a long variable and convert it to an int variable.
         */

        long l1 = 12000L;
        int l2 = (int)l1;
        System.out.println(l2);

        /*
        3) Create a double variable and convert it to a float variable.
         */

        double d = 234.60;
        float f = (float)d;
        System.out.println(f);

        /*
        Create a double variable and convert it to a short variable, then print the value of the short
        variable on the console. Be careful about the output, it will not be a decimal value.
         */

        double d1 = 240.90;
        short sh = (short)d1;
        System.out.println(sh);

        /*
        5) Create a byte variable and convert it to a double variable, then print the value of the double
        variable on the console. Be careful about the output, it will be a decimal number.
         */
        byte b1 = 12;
        double d2 = b1;
        System.out.println(d2);






    }
}
