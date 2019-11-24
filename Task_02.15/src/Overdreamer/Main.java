/**
 *Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
package Overdreamer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int max = 0;
        int A[][] = new int[new Random().nextInt(10) + 1][new Random().nextInt(10) + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = new Random().nextInt(100);
                if (A[i][j] > max) {
                    max = A[i][j];
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(max);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] % 2 != 0) {A[i][j] = max;}
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
