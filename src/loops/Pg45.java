package loops;

public class Pg45 {
    public static void main(String[] args) {
        /*
        Q.5
        Type code to draw the following image by using a for loop.
A A A A A
A A A A A
A A A A A

         */

        int rows = 3;
        int columns = 5;
        // String s = "";

        // for loop

//        for(int i=1; i<=rows; i++){
//            String s = "";
//            for(int k=1; k<=columns;k++){
//                s = s+ "A";
//            }
//            System.out.println(s);
//        }

        // while loop

//        int i = 1;
//        while(i<=rows){
//            String s = "";
//            for(int k=1;k<=columns;k++){
//                s = s + "A";
//            }
//            System.out.println(s);
//            i++;
//        }

        // do while loop

        int j = 1;
        do{
            String c= "";
            for(int k=1; k<=columns; k++){
                c=c+"A";
            }
            System.out.println(c);
            j++;
        }while (j<=rows);







    }
}
