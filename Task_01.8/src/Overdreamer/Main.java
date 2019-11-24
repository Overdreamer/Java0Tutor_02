/**Дана последовательность целых чисел a1, a2,..., an Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,...,an)
 */
package Overdreamer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int min, count = 0;
        System.out.print("Enter size of the array: ");
        int A[] = new int[new Scanner(System.in).nextInt()];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextInt(21)-10;
            System.out.print(A[i] + " ");
        }
        min = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] < min){
                min = A[i];
            }
        }
        for (int i : A) {
            if (i == min)
                count++;
        }
        int B[] = new int[A.length - count];
        count = 0;
        for (int i = 0; i < A.length; i++){
           if (A[i] == min){
               count++;
           } else B[i-count] = A[i];
          }
        System.out.println("\n");
        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}
