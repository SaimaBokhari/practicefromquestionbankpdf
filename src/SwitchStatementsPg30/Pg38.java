package SwitchStatementsPg30;

public class Pg38 {
    public static void main(String[] args) {
    /*
    9) Create an Enum whose name is ‘Seasons’ and print the following by using the Enum in
switch-on statement
For winter print 'Snowboarding'
For summer and spring print 'Fishing'
For fall print 'Trekking'
     */

        enum Seasons {
            WINTER, SUMMER, FALL, SPRING
        }

        String browser = Seasons.SPRING.toString().toLowerCase();

        switch (browser){
            case "winter":
                System.out.println("Snowboarding");
                break;
            case "summer":
                System.out.println("Fishing");
                break;
            case "spring":
                System.out.println("Fishing");
                break;
            case "fall":
                System.out.println("Trekking");
                break;
            default:
                System.out.println("Invalid season");


        }








    }
}
