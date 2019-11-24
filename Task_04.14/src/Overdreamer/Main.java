/**Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
*равна самому числу.
*Найти все числа Армстронга от 1 до k.
*Для решения задачи использовать декомпозицию.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int k = enterData();
        ArmstrongNumbers(k);
        System.out.println();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);
    }

    public static int powDigits(int A) {
        int sum = 0;
        byte num = numberDigits(A);
        do {
            sum += (int) Math.pow(A % 10, num);
            A /= 10;
        } while (A != 0);
        return sum;
    }

    public static int enterData() {
        System.out.println("Enter upper limit: ");
        int n = new Scanner(System.in).nextInt();
        return n;
    }

    public static byte numberDigits(int A) {
        byte count = 0;
        do {
            A /= 10;
            count++;
        } while (A != 0);
        return count;
    }

    public static void ArmstrongNumbers(int k) {
        int arr[] = new int[40];
        for (int i = 1; i < k; i++) {
            if (powDigits(i) == i) {
                System.out.print(i + " ");
            }
        }
    }
}

