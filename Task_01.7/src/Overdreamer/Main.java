/**
 * Даны действительные числа a1, a2, ..., an . Найти
 * max(a1 + a2n, a2 + 2an-1, ..., an + an+1)
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max;
        System.out.print("Enter size of the array: ");
        int A[] = new int[new Scanner(System.in).nextInt()];
        int B[] = new int[A.length/2];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextInt(21)-10;
            System.out.print(A[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < A.length/2; i++){
            B[i] = A[i] + A[(A.length-1)-i];
            System.out.print(B[i] + " ");
        }
        max = B[0];
        for (int i = 1; i < B.length; i++){
            if (B[i] > max)
                max = B[i];
        }
        System.out.println("\nMax sum = " + max);
    }
}
