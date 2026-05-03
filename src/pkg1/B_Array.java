package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class B_Array {
    static void main(String[] args) {

        /************* One Dimensional Array ***************/

//        METHOD -> 1
        System.out.println("*** 1-D Array by Method 1 ***");
        int[] numbers1 = new int[7];
        numbers1[1] = 14;
        numbers1[2] = 22;
        numbers1[3] = 13;
        numbers1[4] = 4;
        numbers1[5] = 25;
//         System.out.println(numbers1); // No USE in java > [I@6d06d69c   ❌ -> memory address (not useful)
        System.out.println("Elements of Array -> " + Arrays.toString(numbers1));
        System.out.println();

//        METHOD -> 2
        System.out.println("*** 1-D Array by Method 2 ***");
        int[] numbers2 = {0,14,22,13,4,25,0};
        System.out.println("Length of Array -> " + numbers2.length); // here " .length " is property of ARRAY that's why there is no need to us PARENTHESES
        System.out.println("Elements of Array -> " + Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println("Sorted Elements of Array -> " + Arrays.toString(numbers2));
        System.out.println();


        /************* Two Dimensional Array ***************/

//        METHOD 1
        System.out.println("*** 2-D Array by Method 1 ***");
        int[][] numbers3 = new int[3][2];
        numbers3[0][0] = 0;
        numbers3[0][1] = 14;
        numbers3[1][0] = 22;
        numbers3[1][1] = 13;
        numbers3[2][0] = 25;
        numbers3[2][1] = 0;
        System.out.println("Length of 2-D Array -> " + numbers3.length + "X" + numbers3[0].length); //`arr.length` -> number of rows & `arr[i].length` -> number of columns in row i
//        System.out.println(Arrays.toString(numbers3)); // works only inONE DIMENSIONAL ARRAYS
        System.out.println("Element of 2-D Array -> " + Arrays.deepToString(numbers3));
        System.out.println();

//        METHOD 2
        System.out.println("*** 2-D Array by Method 2 ***");
        int[][] numbers4 = {{0,14},{22,13},{25,0}};
        System.out.println("Elements of 2-D Array -> " + Arrays.deepToString(numbers4));
        System.out.println();

//        METHOD 3
        System.out.println("*** 2-D Array by Method 3 ***");
        Scanner scanByUserForArray = new Scanner(System.in);

        System.out.print("Please enter ROW of MATRIX : ");
        int m = scanByUserForArray.nextInt();
        System.out.print("Please enter COLUMN of MATRIX : ");
        int n = scanByUserForArray.nextInt();

        int[][] number3 = new int[m][n];
//        ROWS
        for (int i = 0; i < m; i++) {
//            COLUMN
            for (int j = 0; j < n; j++) {
                number3[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Element of 2-D Array -> ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number3[i][j] + " ");
            }
            System.out.println();
        }

        /************* Multi Dimensional Array ***************/
    }
}
