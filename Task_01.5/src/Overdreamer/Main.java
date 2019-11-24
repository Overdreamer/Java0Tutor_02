/**5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 *
 */
package Overdreamer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int A[] = new int[10];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextInt(11);
            System.out.print(A[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < A.length; i++){
            if (A[i] > i)
                System.out.print(A[i] + " ");
        }
    }
}
