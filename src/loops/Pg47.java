package loops;
public class Pg47 {
    public static void main(String[] args) {
        /*
        Q.6
        Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A
         */

        // for loop

        int rows = 4;
        for(int i=1; i<=rows; i++) {
            String s = "";
            for (int k = 1; k <= i; k++) {
                s = s + "A";
            }
            System.out.println(s);
        }

        // while loop

        int i = 1;
        while(i<=rows){
            String s= "";
            for (int k = 1; k <= i; k++) {
                s = s + "A";
            }
            System.out.println(s);
            i++;
        }

        // do while loop
         int j=1;
        do{
            String s = "";
            for (int k = 1; k <= j; k++) {
                s = s + "A";
            }
            System.out.println(s);
            j++;
        }while(j<=rows);





    }
}
