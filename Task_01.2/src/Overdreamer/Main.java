/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Z, count = 0;
	int A[] = new int [10];
	for (int i = 0; i <A.length; i++){
	    A[i] = (int) (Math.random()*100);
        System.out.print(A[i]+" ");
    }
        System.out.println("\nEnter number Z: ");
	    Z = new Scanner(System.in).nextInt();
        for (int i = 0; i < A.length; i++) {
	    if (A[i] > Z){
	        A[i] = Z;
	        count++;
        }
        }
        for (int i : A) {
            System.out.print(i+" ");
        }
        System.out.println("\nNumber of replacements: " + count);

    }
}
