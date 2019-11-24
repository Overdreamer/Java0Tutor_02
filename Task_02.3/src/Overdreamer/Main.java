/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[][] = Create_2x_Array.Create();
        Create_2x_Array.PrintArray(arr);
        int k, p;
        System.out.print("Enter number of row: ");
        k = new Scanner(System.in).nextInt();
        System.out.print("Enter number of column: ");
        p = new Scanner(System.in).nextInt();
        System.out.print("Row \"k\" is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[k-1][i] + " ");
        }
        System.out.print("\nColumn \"p\" is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][p-1] + " ");
        }
    }
}
