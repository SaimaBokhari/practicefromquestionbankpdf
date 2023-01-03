package TernaryStatementsPg27;

public class Pg29 {
    public static void main(String[] args) {
        /*
        8) If the number has 3 digits, the output will be “This number has 3 digits.”
        Otherwise, the output will be “This number has no 3 digits.”
         */

        //1st waY:
        int i = -1278;
        String m = (i>99 && i<1000) || (i>-1000 && i<-99) ? "This number has 3 digits." : "This number doesn't have 3 digits.";
        System.out.println(m);

        // 2nd Way:

        int j = 123;
        j = Math.abs(j);
        String n = (j>99 && i<1000) ? "This number has 3 digits." : "This number doesn't have 3 digits.";
        System.out.println(n);

        /*
        9) Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
         */

        int x = 145;
        String result = x%2==0? "Even number" : "Odd number";
        System.out.println(result);

        /*
        10) If the number is positive print ‘Positive’, otherwise print ‘Not positive’ on the console by
using ternary.
         */

        int y = -145;
        String result1 = y>0? "Positive" : "Not positive";
        System.out.println(result1);







    }
}
