/**Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 *
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number N: ");
        int N = new Scanner(System.in).nextInt();
        System.out.println(Arrays.toString(Main.digitsNumber(N)));
    }
    public static int numberDigits (int A){
        int count = 0;
        do{
            A /= 10;
            count++;
        }
        while (A != 0);
        return count;
    }
    public static int [] digitsNumber (int A){
        int arr[] = new int[Main.numberDigits(A)];
        for (int i = arr.length - 1; i >= 0; i--){
            arr[i] = A % 10;
            A /=10;
        }
        return arr;
    }
}
