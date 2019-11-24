/**
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */
package Overdreamer;

public class Main {

    public static void main(String[] args) {
	int arr[][] = Create_2x_Array.Create();
	int sum = 0, sumMax = 0, maxCOLUMN = 0;
	Create_2x_Array.PrintArray(arr);
	for (int i = 0; i < arr.length; i++){
	    for (int j = 0; j < arr.length; j++){
	        sum += arr[j][i];
	       }
        if (sumMax < sum) {
            sumMax = sum;
            maxCOLUMN = i+1;
        }
        sum = 0;
    }
        System.out.println("Max sum of values is " + sumMax + " and is located in " + maxCOLUMN + " column");
    }
}
