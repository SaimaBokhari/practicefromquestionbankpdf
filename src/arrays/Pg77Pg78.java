package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg77Pg78 {
    public static void main(String[] args) {
        /*
        11) Type code to put all zeros to end in an integer array.
        Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
         */

        int num[] = {5, 0, 2, 0, 3};
        int num1[] = new int [num.length];
        int idx = 0;
        int lastIdx = num.length-1;

        for(int i=0; i<num.length; i++){
            if(num[i] !=0){
                num1[idx] = num[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(num1));


        /*
        12) Create an integer array by getting the elements from the user then print the difference
        between the smallest and the greatest elements on the console.
         */

        Scanner input = new Scanner(System.in);

        // 1st way: for each loop

//        System.out.println("Enter the length of the array");
//        int length = input.nextInt();
//
//        int x[] = new int[length];
//        int i = 0;
//
//        for(int w: x){
//
//        System.out.println("Enter the " +  length + " element");
//            x[i] = input.nextInt();
//            i++;
//        }
//        System.out.println(Arrays.toString(x));
//
//        Arrays.sort(x);
//
//        int difference = x[x.length-1] - x[0];
//        System.out.println("the difference is: " + difference);


        // 2nd way: for loop

        System.out.println("Enter the length of the array");
        int len = input.nextInt();
        int arr[] = new int[len];

        for(int i=0; i<len; i++) {
            System.out.println("Enter " + len + " array elements");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int diffOfBigAndSmall = arr[arr.length-1] - arr[0];
        System.out.println("Difference between the greatest and the lowest is " + diffOfBigAndSmall);










    }
}
