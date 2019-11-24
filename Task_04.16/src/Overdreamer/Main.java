/**Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
*Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number of characters in number: ");
        int n = new Scanner(System.in).nextInt();
        int start = Main.startNumber(n);
        long sum = 0;
        for (int i = start; i < start * 10; i++){
            if (oddNumber(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers with odd digits is " + sum);
        System.out.println("The number of even digits in it is " + numberEven(sum));

    }

    public static int startNumber (int n){
        int i = 1;
        do {
            i *= 10;
            n--;
        }while(n != 1);
        return i;
    }
    public static boolean oddNumber (int i){
        int sum = 0;
        do{
            if (i % 10 % 2 != 0)
            sum += i;
            else
                return false;
            i /= 10;
        } while (i != 0);
        return true;
    }
    public static int numberEven (long i){
        int count = 0;
        do {
            if(i % 10 % 2 == 0)
            count++;
            i /= 10;
        } while (i != 0);
        return count;
    }
}
