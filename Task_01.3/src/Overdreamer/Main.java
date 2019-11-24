/**Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 *  положительных и нулевых элементов.
 */
package Overdreamer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0;
        System.out.print("Enter array dimension N: ");
	int A[] = new int[new Scanner(System.in).nextInt()];
	for (int i = 0; i < A.length; i++) {
        A[i] = new Random().nextInt(201) - 100;
        System.out.print(A[i]+" ");
    }
        for (int i : A) {
	    if (i < 0)
	        negative++;
	    else if (i > 0)
	        positive++;
	    else zero++;
        }
        System.out.println("\nMassive has: positive numbers - " + positive + "; negative numbers - " + negative + "; number zero - " + zero);
    }
}
