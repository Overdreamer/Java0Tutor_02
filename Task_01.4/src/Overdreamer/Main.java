/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
package Overdreamer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 0, minNumber = 0, buf;
	    int A[] = new int[10];
	    for (int i = 0; i < A.length; i++){
	     A[i] = new Random().nextInt(101)-50;
         System.out.print(A[i]+" ");
     }
    for (int i = 1; i < A.length; i++){
	    if (A[i]>A[maxNumber])
	        maxNumber = i;
	    if (A[i]<A[minNumber])
	        minNumber = i;
    }
    buf = A[maxNumber];
	A[maxNumber] = A[minNumber];
	A[minNumber] = buf;
        System.out.println("\n");
        for (int i: A) {
            System.out.print(i + " ");

        }
    }


}
