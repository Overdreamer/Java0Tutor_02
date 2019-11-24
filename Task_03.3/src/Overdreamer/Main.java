/**Сортировка выбором. Дана последовательность чисел.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Написать алгоритм сортировки выбором.
 */


package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[new Random().nextInt(11)+10], buf;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(21)+2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]) min = j;
            }
            buf = arr[i];
            arr[i] = arr[min];
            arr[min] = buf;
        }
        System.out.println(Arrays.toString(arr));
    }
}
