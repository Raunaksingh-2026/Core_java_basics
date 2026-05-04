package pkg1;
import java.util.Scanner;

public class D_ControlFlowStatement1 {
    static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);

        /********  DECISION-MAKING STATEMENT ********/
            /**** PROBLEM ******/
        System.out.println("**** Decision - Making Statement ****\n");
//         If temperature is greater than 30
//           It's a hot day
//           Drink more water
//         If temperature is between 20 and 30
//           It's nice day
//         otherwise
//           It's cold day
          /***** SOLUTION *****/
        System.out.print("Please enter Today's Temperature ; ");
        float temperature1 = userInput1.nextFloat();
        System.out.println("Today's temperature1 is - \t" + temperature1);

            /*++++ IF STATEMENT ++++*/
        System.out.println("1. By using If statement ");
        if (temperature1 < 20) {
            System.out.println("It's cold day \n");
        }
        if (temperature1 >= 20 && temperature1 < 30) {
            System.out.println("It's nice day \n");
        }
        if (temperature1 >= 30) {
            System.out.println("It's hot day \n");
        }

            /*++++ IF-ELSE STATEMENT ++++*/
        System.out.println("2. By using If-else ");
        if (temperature1 >= 30) {
            System.out.println("It's Hot\n");
        }
        else {
            if (temperature1>= 20) {
                System.out.println("It's nice\n");
            }
            else System.out.println("It's cold\n");
        }

            /*++++ IF-ELSE-IF LADDER STATEMENT ++++*/
        System.out.println("3. By using If-else-if Ladder");
        if (temperature1 >= 30) {
            System.out.println("It's Hot\n");
        }
        else if (temperature1 >= 20) {
            System.out.println("It's Nice\n");
        }
        else System.out.println("It's Cold\n");

             /*++++ TERNARY STATEMENT ++++*/
        System.out.println("4. Ternary statement");
        String warning = temperature1 < 20 ? "Its COLD\n" : "It's NICE\n";
        String warning1 = temperature1 >= 30 ? "Its HOT\n" : warning;
        System.out.println(warning1);

            /*++++ SWITCH STATEMENT ++++*/
        System.out.println("5. Switch statement");

        switch ((int)temperature1/10){
            case 1:
                System.out.println("IT'S COLD");
                break;
            case 2:
                System.out.println("IT'S NICE");
                break;
            default:
                System.out.println("IT'S HOT");
        }

            /*++++ ENHANCED SWITCH STATEMENT ++++*/
        System.out.println("ENHANCED SWITCH");
        switch ((int)temperature1/10){
            case 1 -> System.out.println("IT'S COLD");
            case 2 -> System.out.println("IT'S NICE");
            default -> System.out.println("IT'S HOT");
        }
            /***** PROBLEM *****/
//         WAT of convertor from FAHRENHEIT to CELSIUS
            /***** SOLUTION *****/

        /******** LOOP STATEMENT ********/
            /***** PROBLEM *****/
//         WAT of Nth_Term of FIBONACCI and finding FACTORIAL of any number
            /***** SOLUTION *****/

        /********  JUMP-TO STATEMENT ********/
    }
}
