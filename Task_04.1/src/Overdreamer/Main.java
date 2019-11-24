/**Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
*натуральных чисел.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int A = new Random().nextInt(100) + 1;
        int B = new Random().nextInt(100) + 1;
        System.out.println("First number is: " + A);
        System.out.println("Second number is: " + B);
        System.out.println("Greatest common factor is: " + GCF(primeFactorsInt(A), primeFactorsInt(B), A, B));
        System.out.println("Least common multiple is: " + String.format("%.0f",LCM(A, B)));

    }
    //Метод нахождения простых множителей
    public static int[] primeFactorsInt (int A){
        int arrA[] = new int[31];
        for (int i = 0; i < arrA.length && A != 1; i++) {
            int j = 2;
            while (A != 1) {
                if (A % j == 0) {
                    A /= j;
                    arrA[i] = j;
                    break;
                } else j++;
            }
        }
        return arrA;
    }
    //Метод нахождения НОД методом разложения на множители
    public static int GCF (int arrA[], int arrB[], int A, int B){
        boolean coinsidence = false;
        int GCF = 1;
        if (A == B) {
            return A;
        }
        for (int i = 0; arrA[i] != 0; i++){
            for (int j = 0; arrB[j] != 0; j++){
                if (arrA[i] == arrB[j]){
                    GCF *= arrA[i];
                    for (int k = j; arrB[k] != 0; k++){
                        arrB[k] = arrB[k+1];
                    }
                }
                break;
            }
        }
        return GCF;
    }
    //Метод нахождения НОК
    public static double LCM (int A, int B){
        int multiply = A * B;
        double LCM = multiply/GCF(primeFactorsInt(A), primeFactorsInt(B),A, B);
        return LCM;
    }
}