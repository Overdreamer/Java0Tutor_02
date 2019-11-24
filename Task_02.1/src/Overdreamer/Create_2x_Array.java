package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Create_2x_Array {
    public static int[][] Create() {
        System.out.print("Enter the number of rows and columns of the array: ");
        int size = new Scanner(System.in).nextInt();
        int A[][] = new int[size][size];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = new Random().nextInt(21);
            }
        }
        return A;
    }

    public static void PrintArray (int [][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}