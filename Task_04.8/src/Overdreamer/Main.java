/**Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
*Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a[] = create_One_Array();
        for (int i = 0; i < a.length - 2; i++){
            System.out.println("Sum of numbers in position " + (i+1) + ", " + (i+2) + ", " + (i + 3) + " is " + sum(a[i], a[i+1], a[i+2]));
        }

    }
    public static int sum (int a, int b, int c){
        return a + b + c;
    }
    public static int[] create_One_Array (){
        int a[] = new int[new Random().nextInt(20)+3];
        for (int i = 0; i < a.length; i++){
            a[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
