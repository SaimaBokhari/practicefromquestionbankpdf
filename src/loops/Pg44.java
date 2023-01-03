package loops;

public class Pg44 {
    public static void main(String[] args) {
        /*
        Q.4
        Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
         */

        // for loop
        int a = 223878;
        String s = String.valueOf(a);
        String st = "";

        for(Integer i=0; i<s.length(); i++){
            String str = s.substring(i,i+1);
            if(s.indexOf(str)==s.lastIndexOf(str)){
                st = st+str;
            }
        }
        System.out.println(st);

        // while loop

        int num = 223878452;
        String x = String.valueOf(num);
        String y = "";

        Integer i=0;

        while(i<x.length()){
            String z = x.substring(i,i+1);
            if(x.indexOf(z) == x.lastIndexOf(z)){
                y = y+z;
            }
            i++;
        }
        System.out.println(y);

        // do while loop

        int num1 = 223878452;
        String l = String.valueOf(num);
        String m = "";

        Integer j=0;

        do{
            String n = l.substring(j, j+1);
            if(l.indexOf(n)== l.lastIndexOf(n)){
                m = m+n;
            }
            j++;

        }while(j<l.length());
        System.out.println(m);





    }
}
