/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */
package Overdreamer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        boolean zero = true;
        int A[][] = new int[10][20];
        int five[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
               A[i][j] = new Random().nextInt(16);
                if (A[i][j] == 5) count++;
                System.out.print(A[i][j] + "\t");
            }
            if (count >= 3) {
                five[i] = i + 1;
                zero = false;
            }
            System.out.println();
        }
        System.out.print("The number 5 occurs 3 times and more in rows: ");
        if (zero) System.out.println("no rows");
        else for (int i : five) {
            if (i != 0)
                System.out.print(i + " ");
        }
    }
}