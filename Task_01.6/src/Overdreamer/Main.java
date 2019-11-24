/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float sum = 0;
        System.out.print("Enter size of the array: ");
        float A[] = new float[new Scanner(System.in).nextInt()];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextFloat();
            System.out.print(String.format("%.3f",A[i])+" ");
        }
        for (int i = 1; i < A.length; i++){
            boolean simple = true;
            for (int j = 2; j < i; j++ ){
                if (i % j == 0)
                    simple = false;
            }
            if (simple)
                sum += A[i];
        }
        System.out.println("\nSum of numbers with a simple index: " + String.format("%.3f",sum));
    }
}
