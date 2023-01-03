package loops;

public class Pg41 {
    public static void main(String[] args) {
        /*
         Q.2
            Type code to print repeated characters in a String.
            For example; accessories ⇒ ces
         */

        //for loop
        String s = "accessories";
        String st ="";

        for(int i=0; i<s.length();i++ ){
            String str = s.substring(i,i+1);
            if(s.indexOf(str) != s.lastIndexOf(str) && !st.contains(str)){
                 st = st+ str;
            }
        }
        System.out.println(st);

        //while loop

        String s1 = "accessories";
        String s2 = "";
        int i = 0;
        while(i<s1.length()){
            String s3 = s1.substring(i,i+1);
            if(s1.indexOf(s3) != s1.lastIndexOf(s3) && !s2.contains(s3)){
                s2 = s2 + s3;
            }
            i++;
        }
        System.out.println(s2);

        // do while loop
        String a = "accessories";
        String b = "";
        Integer j = 0;
        do{
            String c = a.substring(j,j+1);
            if(a.indexOf(c) != a.lastIndexOf(c)){
                if(!b.contains(c)) {
                    b = b + c;
                }
            }
            j++;
        }while(j<a.length());

        System.out.println(b);









    }
}
