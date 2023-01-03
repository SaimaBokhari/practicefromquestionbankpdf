package loops;

public class Pg40 {
    public static void main(String[] args) {
        /*
        Q.1
        Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in
        the same line with a space between two consecutive integers
         */
        // for loop
        String s = "";
        for(int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
               s = s+i+" ";
            }
        }
        System.out.println(s);

        // while loop
//        String s1 ="";
//        int i=120;
//        while(i>10){
//            if(i%4==0 && i%6==0){
//                s1 = s1+i+" ";
//            }
//            i--;
//        }
//        System.out.println(s1);

        //do while loop

        String s2 ="";
        int i=120;
        do{
            if(i%4==0 && i%6==0){
                s2 = s2+i+" ";
            }
            i--;
        }while(i>10);
        System.out.println(s2);





    }
}
