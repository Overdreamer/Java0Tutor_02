/**Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 *
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int [3];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = new Random().nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int balance = arr[0];
        for (int i = 1; i < arr.length; i++){
            balance = GCF(balance, arr[i]);
        }
        if (balance == 1)
        System.out.println("Numbers: " + arr[0] + ", " + arr[1] + ", " + arr[2] + " is coprime numbers.");
        else System.out.println("Numbers: " + arr[0] + ", " + arr[1] + ", " + arr[2] + " is not coprime numbers.");
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
