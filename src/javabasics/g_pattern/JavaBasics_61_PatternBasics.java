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
/*
==========================================================
                3. DECREASING TRIANGLE PATTERN
==========================================================

        Output for scanInput = 5:

        * * * * *
        * * * *
        * * *
        * *
        *

        Logic -> The number of stars decreases with every row.
*/
        for (int i = scanInput; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
==========================================================
            4. DECREASING TRIANGLE - ALTERNATIVE APPROACH
==========================================================

        Same output:

        * * * * *
        * * * *
        * * *
        * *
        *

        Here -> i starts from 1 and goes up to scanInput.

        Number of stars -> scanInput - i + 1
*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= (scanInput - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*
==========================================================
                    5. PYRAMID PATTERN
==========================================================

              *
             * *
            * * *
           * * * *
          * * * * *

        Logic ->
            Outer loop
                -> Controls rows.
            First inner loop
                -> Controls spaces.
            Second inner loop
                -> Controls stars.
*/
        for (int i = 0; i < scanInput; i++) {
///            Print spaces
            for (int j = scanInput; j >= i; j--) {
                System.out.print("  ");
            }
///            Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}