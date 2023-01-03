package loops;

public class Pg42 {
    public static void main(String[] args) {

    /*
    Q.3
    Type code to check whether a String is palindrome or not. If a String is the same with its
reverse then it is called palindrome. For example; “anna”, “123321” are palindromes.
     */
        String s = "anna";
        String r = "";

        // for loop

        for(int i=s.length()-1; i>-1; i--){
            String c = s.substring(i,i+1);
            r=r+c;
        }
        if(s.equals(r)){
            System.out.println(s + " "+"is a palindrome");
        }else{
            System.out.println(s + " "+"is not a palindrome");
        }

        // while loop

        String a = "123321";
        String b = "";

        int i = a.length()-1;
        while(i>-1){
            String c = a.substring(i,i+1);
            b = b+c;
            i--;
        }
        if(a.equals(b)){
            System.out.println(a + " "+"is a palindrome");
        }else{
            System.out.println(a + " "+"is not a palindrome");
        }


        // do while loop

        String x = "anna";
        String y = "";
         int j = x.length()-1;
         do{
             String z = x.substring(j,j+1);
             y= y+z;
             j--;
         }while(j>-1);

        if(x.equals(y)){
            System.out.println(x + " "+"is a palindrome");
        }else{
            System.out.println(x + " "+"is not a palindrome");
        }



    }
}
