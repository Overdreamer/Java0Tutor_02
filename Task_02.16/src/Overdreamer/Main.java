/**
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 * ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter size of the array (odd number): ");
        int n = new Scanner(System.in).nextInt();
        int A[][] = new int[n][n];
        int MagicNumber = n * (n * n + 1) / 2;
        System.out.println(MagicNumber);

        for (int j = A.length / 2, i = 0, k = 1; k <= n*n; ) {
            if (A[i][j] != 0) {

                if (i == n - 1) {
                    i = 1;
                }else if (i == n - 2) {
                    i = 0;
                }else {
                    i += 2;}

                if (j == 0) {
                    j = n - 1;
                }else {
                    j--;
                }
                A[i][j] = k;
                k++;
            } else {
                A[i][j] = k;
                k++;
            }
            if (i == 0) {i = n - 1;} else i--;
            if (j == n - 1) {j = 0;} else j++;
        }
        Create_2x_Array.PrintArray(A);
    }
}

