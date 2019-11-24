/**
 *Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
package Overdreamer;

public class Main {

    public static void main(String[] args) {
        int arr [][] = Create_2x_Array.Create();
        Create_2x_Array.PrintArray(arr);
        for (int i = 0, j = 0; i < arr.length; i++, j++){
            System.out.print(arr[i][j] + " ");
        }
    }
}
