package stringmanipulationspg7to13;

public class Pg12 {
    public static void main(String[] args) {

        /*
        14) Type code to check if a String has a specific single character
         or not in three different ways.
         */

        //1st way:
        String s = "Java";
        boolean s1 = s.contains("b");
        System.out.println(s1);

        // 2nd way:
        String str = "Java";
        boolean str1 =str.replaceAll("[^v]","").length()>0;
        System.out.println(str1);

        // 3rd way:
        String st = "Java";
        boolean st1 = st.indexOf("")!=-1;
        System.out.println("Does the character exist? " + st1);

        /*
        15) String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.
         */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replaceAll("[$]", "");
        String book = bookPrice.replaceAll("[$]", "");

        double x = Double.valueOf(shirt);
        double y = Double.valueOf(book);

        System.out.println("Total price:" + " " + (x+y));





    }
}
