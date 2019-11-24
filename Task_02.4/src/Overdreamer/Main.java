/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1    2       3       ...     n
 * n    n-1     n-2     ...     1
 * 1    2       3       ...     n
 * n    n-1     n-2     ...     1
 * ...  ...     ...     ...     ...
 * n    n-1     n-2     ...     1
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns of the array: ");
        int size = new Scanner(System.in).nextInt();
        if (size % 2 != 0) size +=1;
        int A[][] = new int[size][size];
        for (int i = 0; i < A.length; i++){
            if (i % 2 == 0) {
                for (int j = 0; j < A.length; j++) {
                    A[i][j] = j + 1;
                }
            } else {
                for (int j = A.length; j > 0; j--) {
                    A[i][A.length - j] = j;
                }
            }
        }
        Create_2x_Array.PrintArray(A);
    }
}
