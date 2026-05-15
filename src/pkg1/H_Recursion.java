package pkg1;

import java.util.Scanner;

public class H_Recursion {

    /********************* FACTORIAL RECURSION FUNCTION ********************/
//    Complexity is O(n)
    public static int factorialOfNumbers(int numbers) {
//        BASE case -> recursion stop here
        if (numbers == 0 || numbers == 1) {
            return 1;
        }

//        perform operation
//        recursion call -> function calls itself with smaller value
        int factorialOfPreviousNumbers = factorialOfNumbers(numbers-1);
//        processing current result
        int factorialOfCurrentNumbers = numbers * factorialOfPreviousNumbers;
//        returning final value
        return factorialOfCurrentNumbers;
    }

    /********************* FIBONACCI RECURSION FUNCTION ********************/
    //    Complexity is O(n)
    public static void findingTermInFibonacci(int a, int b, int nThTerm) {
//        Base case -> stop recursion when no term left
        if (nThTerm == 0) {
            return ;
        }

//        finding next Fibonacci term
        int nextTerm = a + b;
//        printing next term
        System.out.print(nextTerm + " ");
//        recursive call -> shifting values forward
        findingTermInFibonacci(b, nextTerm, nThTerm-1);
    }

    /****************** TOWER OF HANOI RECURSION FUNCTION *****************/
    //    Complexity is O(2ⁿ)
    public static void findStepForTowerOfHanoi(int numberOfDics, String sourceTower, String helperTower, String destinationTower) {
//        BASE CASE -> if only one disc left
        if (numberOfDics == 1) {
            System.out.println(" Move Disc " + numberOfDics + " from " + sourceTower + " to " +destinationTower);
            return;
        }

        /* STEP 1: Move upper (n-1) discs from SOURCE → HELPER */
        findStepForTowerOfHanoi(numberOfDics - 1, sourceTower, destinationTower, helperTower);
        /* STEP 2: Move largest disc from SOURCE → DESTINATION */
        System.out.println(" Move Disc " + numberOfDics + " from " + sourceTower + " to " +destinationTower);
        /* STEP 3: Move upper (n-1) discs from HELPER → DESTINATION */
        findStepForTowerOfHanoi(numberOfDics-1, helperTower, sourceTower, destinationTower);
    }

/**************************************** MAIN METHOD *****************************************/
    public static void main(String[] args) {
//        creating Scanner object for user input
        Scanner userInput = new Scanner(System.in);

    /****************** FACTORIAL **********************/
//        taking input from user for FACTORIAL
        System.out.print("Enter any number : ");
        int numbers = userInput.nextInt();

//        calling factorial function
        int result = factorialOfNumbers(numbers);
//        printing factorial result
        System.out.println(result);

    /****************** FIBONACCi *********************/
        //taking the term number which user want from FIBONACCI
        System.out.print("Enter the term you wants : ");
        int nThTerm = userInput.nextInt();

        // 1st and 2nd term of FIBONACCI
        int a = 0;
        int b = 1;
//        printing first two terms
        System.out.print(a + " " + b + " ");
//        calling FIBONACCI recursion
        findingTermInFibonacci(a, b, nThTerm - 2);
        System.out.println();

    /****************** TOWER OF HANOI ********************/
//         taking Number of DISC
        System.out.print("Please enter the number of DISC : ");
        int numberOfDisc = userInput.nextInt();

//        calling TOWER OF HANOI function
        findStepForTowerOfHanoi(numberOfDisc, "SOURCE TOWER", "HELPER TOWER", "DESTINATION TOWER");

/****************** closing scanner *******************/
        userInput.close();
    }
}