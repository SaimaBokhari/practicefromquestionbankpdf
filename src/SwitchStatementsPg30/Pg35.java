package SwitchStatementsPg30;

import java.util.Scanner;

public class Pg35 {
    public static void main(String[] args) {
        /*
        6) Use switch statement to create a simple calculator which does addition, subtraction,
multiplication, and division with any 2 numbers
a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
console
e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
"That operation cannot be done"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNum = input.nextDouble();

        System.out.println("Enter the second number");
        double secondNum = input.nextDouble();

        String operator= "/";

        switch(operator){
            case "+":
                System.out.println(firstNum+secondNum);
                break;
            case"-":
                System.out.println(firstNum-secondNum);
                break;
            case "*":
                System.out.println(firstNum*secondNum);
                break;
            case "/":
                System.out.println(firstNum/secondNum);
                break;
            default:
                System.out.println("Invalid data");
        }











    }
}
