package SwitchStatementsPg30;

public class Pg37 {
    public static void main(String[] args) {

    /*
    8) Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
FIREFOX, YANDEX.
Note: You should create enum on developer console
     */

        // An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
        // Enum is short for "enumerations", which means "specifically listed".
        //To create an enum, use the enum keyword (instead of class or interface),
        // and separate the constants with a comma. Note that they should be in uppercase letters:
        // You can access enum constants with the dot syntax:

         enum Browsers {
            CHROME, SAFARI, IE, FIREFOX, YANDEX
        }

        String browser = Browsers.IE.toString();
        switch(browser){
            case "CHROME":
                System.out.println("I am using CHROME");
                break;
            case "SAFARI":
                System.out.println("I am using SAFARI");
                break;
            case "IE":
                System.out.println("I am using IE");
                break;
            case "FIREFOX":
                System.out.println("I am using FIREFOX");
                break;
            case "YANDEX":
                System.out.println("I am using YANDEX");
                break;
            default:
                System.out.println("It is not valid browser");
        }

/*
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that
enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement
 interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days,
 colors, deck of cards, etc.
 */





    }

}


