/**Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 *
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int [4];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = new Random().nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int balance = arr[0];
        for (int i = 1; i < arr.length; i++){
            balance = GCF(balance, arr[i]);
        }
        System.out.println("GCF: " + balance);
    }
    //Нахождение НОД по алгоритму Евклида
    public static int GCF (int A, int B){
        int balance;
        while (A % B != 0){
            balance = A % B;
            A = B;
            B = balance;
        }
        return B;
    }
}
