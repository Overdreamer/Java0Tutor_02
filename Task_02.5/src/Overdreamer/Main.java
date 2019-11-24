/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1        1       1       ...         1       1       1
 * 2        2       2       ...         2       2       0
 * 3        3       3       ...         3       0       0
 * ...      ...     ...     ...         ...     ...     ...
 * n-1      n-1     0       ...         0       0       0
 * n        0       0       ...         0       0       0
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
                for (int j = 0; j < A.length - i; j++){
                    A[i][j] = i+1;
                }
            }
            Create_2x_Array.PrintArray(A);
    }
}
