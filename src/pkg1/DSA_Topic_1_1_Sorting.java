package pkg1;
import java.util.Scanner;

public class DSA_Topic_1_1_Sorting {

    public static void printSortedNumber(int[] arrNumbers) {
        System.out.print("AFTER SORTING : ");
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i]+ " ");
        }
    }
                /******* SELECTION SORT *******/
//    By Using BUBBLE SORT time complexity will be -> O(n^2)
    public static void bubbleSort(int[] arrNumbers) {
        System.out.println("**** USING BUBBLE SORT ****");
        for (int i = 0; i < (arrNumbers.length - 1); i++){
//            Swaping numbers if they are unordered
            for (int j = 0; j < (arrNumbers.length - i) - 1; j++) {
                if (arrNumbers[j] > arrNumbers[j+1]) {
                    int temp = arrNumbers[j];
                    arrNumbers[j] = arrNumbers[j+1];
                    arrNumbers[j+1] = temp;
                }
            }
        }
    }
                /******* SELECTION SORT *******/
//     By SELECTION SORT time complexity will be -> O(n^2)
    public static void selectionSort(int[] arrNumbers) {
        System.out.println("**** USING SELECTION SORT ****");
        for (int i = 0; i < arrNumbers.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arrNumbers.length; j++) {
                if (arrNumbers[smallest] > arrNumbers[j]) {
                    int temp = arrNumbers[j];
                    arrNumbers[j] = arrNumbers[smallest];
                    arrNumbers[smallest] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        Taking Input in ARRAY
        int[] arrNumbers = {7, 8, 4, 1, 3, 2};
        int[] arrNumbers1 = arrNumbers.clone();
//        Printing Number before SORT
        System.out.print("BEFORE SORTING : ");
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] +" ");
        }
        System.out.println();

        /***** CALLING SORTING METHODS *****/
        bubbleSort(arrNumbers);
        printSortedNumber(arrNumbers);
        System.out.println();
        selectionSort(arrNumbers1);
        printSortedNumber(arrNumbers1);
    }
}
