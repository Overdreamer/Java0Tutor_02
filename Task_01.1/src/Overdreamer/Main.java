/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int K, count = 0;
	    int A[] = new int[10];
	    for (int i = 0; i < A.length; i++){
            A[i] = (int) (Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.print("\nEnter number K: ");
        K = new Scanner(System.in).nextInt();
        for (int i : A) {
          if (i%K == 0){
                System.out.print(i+" ");
                count++;
            }
        }
        if (count == 0)
            System.out.println("The array does not contain multiple numbers");
    }

}
