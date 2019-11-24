/**
 *Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin ((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns of the array: ");
        int count = 0;
        int size = new Scanner(System.in).nextInt();
        double A[][] = new double[size][size];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                double S = ((i*i+j*j)/size);
                A[i][j] = Math.sin(S);
                if (A[i][j] > 0) count++;
                System.out.print(String.format("%.3f",A[i][j]) + "\t");
            }
            System.out.println();
        }
        System.out.println("The number of positive elements: " + count);
    }
}
