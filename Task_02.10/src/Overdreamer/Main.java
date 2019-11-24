/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */
package Overdreamer;

public class Main {

    public static void main(String[] args) {
        boolean count = false;
        int arr[][] = Create_2x_Array.Create();
        Create_2x_Array.PrintArray(arr);
        System.out.print("Positive elements of main diagonal are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.print(arr[i][i] + " ");
                count = true;
            }
        }
        if (!count) System.out.println("absent");
    }
}
