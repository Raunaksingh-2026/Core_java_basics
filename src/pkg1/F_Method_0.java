package pkg1;

import java.util.Scanner;

public class F_Method_0 {// defining CLASS FUNCTION named as "F_Method"

//     Method to print name
    public static void printMyName(String myName) {/// here "void" is RETURN_TYPE, "printMyName" is METHOD_NAME followed by PARENTHESIS which include PARAMETER "myName" of STRING DATA_TYPE
        System.out.println(myName);
        return;/// There is no need of RETURN KEYWORD because "void" means NO value is returned
    }
//     Method to returning INTEGER value as sum
    public static int sumOfTwoNumber(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;/// must use RETURN KEYWORD because "int" means INTEGER value is returned
    }

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);

//         Name input
        System.out.print("Enter Your Name : ");
        String myName = scanInput.nextLine();

        /// calling METHOD with ARGUMENT "myName"
        printMyName(myName);

//         Number input
        System.out.print("Please Enter First Number : ");
        int firstNumber = scanInput.nextInt();

        System.out.print("Please Enter Second Number : ");
        int secondNumber = scanInput.nextInt();

        /// calling METHOD with ARGUMENT "firstNumber", "secondNumber"
        int sum = sumOfTwoNumber(firstNumber, secondNumber);

        System.out.printf("Sum of %d and %d is %d",
                firstNumber, secondNumber, sum);

    }
}
