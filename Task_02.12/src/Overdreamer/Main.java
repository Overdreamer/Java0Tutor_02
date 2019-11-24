/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
package Overdreamer;

public class Main {
    public static void main(String[] args) {
	int arr[][] = Create_2x_Array.Create();
	Create_2x_Array.PrintArray(arr);
	int buf;
	for (int i = 0; i < arr.length; i++){
	    for (int j = 0; j < arr.length; j++){
	        for (int k = 0; k < arr.length-j-1; k++){
	            if (arr[i][k] > arr[i][k+1]) {
					buf = arr[i][k];
					arr[i][k] = arr[i][k + 1];
					arr[i][k + 1] = buf;
				}
            }
        }
    }
    Create_2x_Array.PrintArray(arr);
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				for (int k = 0; k < arr.length-j-1; k++){
					if (arr[i][k] < arr[i][k+1]) {
						buf = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = buf;
					}
				}
			}
		}
		Create_2x_Array.PrintArray(arr);
    }
}
