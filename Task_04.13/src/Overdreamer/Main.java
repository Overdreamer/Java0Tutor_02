/**Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
*Найти и напечатать все пары «близнецов» из отрезка [n,2n], // где n - заданное натуральное число больше 2.
*Для решения задачи использовать декомпозицию.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1 = enterData();
        Main.numbersTwins(n1, n1*2);
    }

    public static void numbersTwins (int a1, int a2){
        int a[] = Main.arrayFilling(a1, a2);
        for (int i = 0; i < a.length-2; i++){
            System.out.println(a[i] + " " + a[i+2]);
        }
    }
    public static int[] arrayFilling (int a1, int a2){
        int a[] = new int [a2 - a1];
        for (int i = 0; i < a.length; i++){
            a[i] = a1;
            a1++;
        }
        return a;
    }
    public static int enterData (){
        System.out.println("Enter number (n >= 2): ");
        int n1 = new Scanner(System.in).nextInt();
        return n1;
    }
}
