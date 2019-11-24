/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A[][] = new int[new Random().nextInt(10)+1][new Random().nextInt(10)+1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (j >= i) {A[i][j] = 1;}
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
