/**Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
* элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number K: ");
        int K = new Scanner(System.in).nextInt();
        System.out.print("Enter number N: ");
        int N = new Scanner(System.in).nextInt();
        if (K > 9 * Main.numberDigits(N-1)){
            System.out.println("There are no numbers satisfying the condition.");
            return;
        }
        int count = 0;
        for (int j = 1; j <= N; j++) {
            if (Main.sumDigits(j) == K && j <= N) {
                count++;
            }
        }
        int a[] = new int[count];
        int number = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = number; j <= N; j++) {
                if (Main.sumDigits(j) == K && j <= N) {
                    a[i] = j;
                    number = j + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static int sumDigits (int A){
        int sum = 0;
        do{
            sum += A % 10;
            A /= 10;
        } while (A != 0);
        return sum;
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
}
