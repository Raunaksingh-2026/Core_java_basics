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
        System.out.println("\n1. SQUARE PATTERN -->");
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
        System.out.println("\n2. INCREASING TRIANGLE PATTERN -->");
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
        System.out.println("\n3. DECREASING TRIANGLE PATTERN -> METHOD-1 -->");
        for (int i = scanInput; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
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
        System.out.println("\n4. DECREASING TRIANGLE PATTERN -> METHOD-2 -->");
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= (scanInput - i + 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
/*
==========================================================
                    5. PYRAMID PATTERN
==========================================================

        Output for scanInput = 5:
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
        System.out.println("\n5. PYRAMID PATTERN -->");
        for (int i = 0; i < scanInput; i++) {
///            Print spaces
            for (int j = scanInput; j >= i; j--) {
                System.out.print(" ");
            }
///            Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
/*
=============================================================
                9. INVERTED PYRAMID
=============================================================

        Output for scanInput = 5:

        *********
         *******
          *****
           ***
            *

        Formula -> Number of stars = 2 * (scanInput - i) + 1
*/
        for (int i = 1; i <= scanInput; i++) {
///             Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
///             Print stars
            for (int j = 1; j <= 2 * (scanInput - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
=============================================================
                10. DIAMOND PATTERN
=============================================================

        Output for scanInput = 5:

            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *

        Diamond = Pyramid + Inverted Pyramid
*/
        for (int i = 1; i <= scanInput; i++) {
///            Print spaces
            for (int j = 1; j <= scanInput - i; j++) {
                System.out.print(" ");
            }
///            Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = scanInput - 1; i >= 1; i--) {
///            Print spaces
            for (int j = 1; j <= scanInput - i; j++) {
                System.out.print(" ");
            }
///            Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
=============================================================
                        11. HOLLOW SQUARE
=============================================================

        Output for scanInput = 5:

        *****
        *   *
        *   *
        *   *
        *****

        Logic -> Print * when:
                    i == 1
                    i == scanInput
                    j == 1
                    j == scanInput
                 Otherwise print space.
*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= scanInput; j++) {
                if (i == 1 || i == scanInput ||
                    j == 1 || j == scanInput) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
/*
=============================================================
                        12. HOLLOW TRIANGLE
=============================================================

        Output:

        *
        **
        * *
        *  *
        *****
*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == scanInput) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
/*
=============================================================
                        13. NUMBER TRIANGLE
=============================================================

        Output:

        1
        12
        123
        1234
        12345

*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
/*
=============================================================
                    14. SAME NUMBER TRIANGLE
=============================================================

        Output:

        1
        22
        333
        4444
        55555

*/
        for (int i = 1; i <= scanInput; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
/*
=============================================================
                    15.
=============================================================

        Output for scanInput -> 5

        aaaaa
        BBBBB
        ccccc
        DDDDD
        eeeee
*/
        int asciiOffset = 96;
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= scanInput; j++) {
                System.out.print((char) (i + asciiOffset));
            }
            System.out.println();
            if (asciiOffset == 96) {
                asciiOffset = 64;
            }else asciiOffset = 96;
        }
/*
=============================================================
                        16. FLOYD'S TRIANGLE
==============================================================

        Output:

        1
        23
        456
        789
        1011121314

*/
        int number = 1;

        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
/*
=============================================================
                        17. 0-1 TRIANGLE
=============================================================

        Output:

        1
        01
        101
        0101
        10101
*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
/*
=============================================================
                   18. CHARACTER TRIANGLE
=============================================================

        Output:

        A
        AB
        ABC
        ABCD
        ABCDE
*/
        for (int i = 1; i <= scanInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
/*
=============================================================
                    19. SAME CHARACTER TRIANGLE
=============================================================

        Output:

        A
        BB
        CCC
        DDDD
        EEEEE
*/
        for (int i = 1; i <= scanInput; i++) {
            char character = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        scanner.close();
    }
}