/**Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в
*порядке возрастания.
* Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int arr[] = new int[new Random().nextInt(11) + 10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(21);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int buf, count = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					buf = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = buf;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of transitions: " + count);
	}
}
