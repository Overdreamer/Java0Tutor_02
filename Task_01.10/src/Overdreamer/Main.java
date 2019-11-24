/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter size of the array: ");
        int A[] = new int[new Scanner(System.in).nextInt()];
        for (int i = 0; i < A.length; i++){
            A[i] = new Random().nextInt(21);
            System.out.print(A[i] + " ");
        }
        for (int i = 1; i < A.length; i +=2){
            A[i] = 0;
        }
        System.out.println("\n");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
