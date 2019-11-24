/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
package Overdreamer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][]arr = Create_2x_Array.Create();
        Create_2x_Array.PrintArray(arr);
        for (int i = 0; i <arr.length; i +=2){
            if (arr[i][0] > arr[i][arr.length-1])
            for (int j = 0; j < arr.length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
