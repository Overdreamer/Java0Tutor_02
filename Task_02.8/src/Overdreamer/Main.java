/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[][] = Create_2x_Array.Create();
        Create_2x_Array.PrintArray(arr);
        int first, second;
        System.out.print("Enter number of first column: ");
        first = new Scanner(System.in).nextInt();
        System.out.print("Enter number of second column: ");
        second = new Scanner(System.in).nextInt();
        for (int i = 0, buf; i < arr.length; i++){
            buf = arr[i][first-1];
            arr[i][first-1] = arr[i][second-1];
            arr[i][second-1] = buf;
        }
        Create_2x_Array.PrintArray(arr);
    }
}
