package javabasics.g_pattern;

import java.util.Scanner;

/*
=========================================================
                JAVA PATTERN BASICS
---------------------------------------------------------
Topics Covered:
1. Square Pattern
2. Increasing Triangle Pattern
3. Decreasing Triangle Pattern
4. Decreasing Triangle - Alternative Approach
5. Pyramid Pattern
=========================================================
*/

public class JavaBasics_61_PatternBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Number of Lines: ");

//         For taking input from the user:
//         int scanInput = scanner.nextInt();

//         Currently using a fixed value for testing.
        int scanInput = 5;

        System.out.println(scanInput);
/*
========================================================
                    1. SQUARE PATTERN
========================================================

        Output for scanInput = 5:

        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

        Logic ->
            Outer loop  -> Controls rows
            Inner loop  -> Controls columns
*/

        for (int i = 0; i < scanInput; i++) {

            for (int j = 0; j < scanInput; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

/*
=========================================================
                2. INCREASING TRIANGLE PATTERN
=========================================================

        Output for scanInput = 5:

        *
        * *
        * * *
        * * * *
        * * * * *

        Logic -> The number of stars increases with every row.
*/
        for (int i = 0; i < scanInput; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}