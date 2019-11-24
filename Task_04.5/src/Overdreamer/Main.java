/**Составить программу, которая в массиве A[N] находит второе по величине число
*(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter size of the array: ");
	    int A[] = new int [new Scanner(System.in).nextInt()];
	    for (int i = 0; i < A.length; i++){
	        A[i] = new Random().nextInt(30);
        }
        System.out.println(Arrays.toString(A));
        System.out.println("Number " + maxOut(A, MAX(A)) + " is second largest number in array A.");
    }
    public static int MAX (int A[]){
        int MAX = A[0];
        for (int i = 1; i < A.length; i++){
            if (MAX < A[i]){
                MAX = A[i];
            }
        }
        return MAX;
    }
    public static int maxOut (int A[], int max) {
        int maxOut;
        if (A[0] == max)
            maxOut = A[1];
        else maxOut = A[0];
        for (int i = 1; i < A.length; i++){
            if (maxOut < A[i] && A[i] < max)
                maxOut = A[i];
    }
    return maxOut;
}
}
