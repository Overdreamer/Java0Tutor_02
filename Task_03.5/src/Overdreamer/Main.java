/**Сортировка вставками. Дана последовательность чисел a1 <= a2 <= a3 <=.... an . Требуется переставить числа в порядке
*возрастания.  Примечание. Место помещения очередного элемента в отсортированную часть производить
*с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
package Overdreamer;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[new Random().nextInt(2) + 10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int index;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            /*
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;*/
            index = binarySearch(arr, value, i);
            for (int j = i; j > index; j--) {
                int buf = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = buf;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch (int a[], int value, int upBorder){
        int downBorder = 0, middleIndex = 0, index = 0;

        while (downBorder <= upBorder){
            middleIndex = (downBorder + upBorder)/2;

            if (a[middleIndex] == value)
                return middleIndex;

            else if (a[middleIndex] < value) {
                if (downBorder == upBorder) {
                    middleIndex++;
                    break;
                }
                downBorder = middleIndex + 1;
            }
            else if (a[middleIndex] > value)
                upBorder = middleIndex - 1;
        }
        return middleIndex;
    }
}