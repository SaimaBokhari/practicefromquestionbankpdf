package SwitchStatementsPg30;

/*
10) Create a method which gives you a random alphabetical character in myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others
 */
public class Pg39 {

    public static String getRandomAlphabet(){

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int maxIdx = alphabets.length()-1;
        System.out.println(maxIdx);
        int randomIdx = (int) Math.round(Math.random()*maxIdx);
        return alphabets.substring(randomIdx, randomIdx+1);
    }


//    String alphabets = getRandomAlphabet().toLowerCase();
//
//    switch(alphabets){
//        case "a":
//            System.out.println("First Character");
//            break;
//        case "b":
//            System.out.println("Second Character");
//            break;
//        case "c":
//            System.out.println("Third Character");
//            break;
//        case "d":
//            System.out.println("Fourth Character");
//            break;
//        default:
//            System.out.println("Other Characters");



}
