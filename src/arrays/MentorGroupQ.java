package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MentorGroupQ {
    public static void main(String[] args) {

        /*
 Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a
char array, which contains letters of the string as its elements.

         */


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name please");
        String name = input.nextLine();
        // System.out.println(name);

        String nameArr[] = new String [name.length()];

        int idx = 0;

        for(int i=name.length()-1; i>=0; i--){
            nameArr[idx] = name.substring(i, i+1);
            idx++;
        }
        System.out.println(Arrays.toString(nameArr));




//        String textArray[]=new String[text.length()];
//        int c=0;
//
//        for(int i=text.length()-1;i>=0;i--){
//            textArray[c]=text.substring(i,i+1);
//            c++;
//
//        }
//        System.out.println(Arrays.toString(textArray));


        /*
        How we take the elements whose length is less than 5 and put another array
        which we created.
         */
        String names[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        String selectedNames[]=new String[names.length];

        for (int i=0;i<names.length;i++){
            if (names[i].length()<5){
                selectedNames[i]=names[i];
            }
        }
        System.out.println(Arrays.toString(selectedNames)); //[Ali, null, Mark, null, Tom, null]




    }
}
