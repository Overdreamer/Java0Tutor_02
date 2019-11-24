/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter size of the array: ");
        int A[] = new int[new Scanner(System.in).nextInt()];
        int Often[] = new int[A.length];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextInt(11);
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                if (A[i] == A[j])
                    Often[i]++;
            }
        }
        int max = Often[0], oftenNumber = A[0];
        for (int i = 0; i < Often.length; i++) {
            if (Often[i] > max) {
                max = Often[i];
                oftenNumber = A[i];
            }
        }
        for (int i = 0; i < A.length; i++){
            if (Often[i] == max)
                if (A[i] < oftenNumber)
                    oftenNumber = A[i];
            }
        System.out.println("\nMin Often number is: " + oftenNumber);
        }
    }
