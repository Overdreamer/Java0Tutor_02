/**Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
*Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        while (n != 0){
            n = deductionAmount(n);
            count++;
        }
        System.out.println("The number of subtractions: " + count);
    }
    public static int deductionAmount (int i){
        int sum = 0, n = i;
        do{
            sum += n % 10;
            n /= 10;
        } while (n != 0);
        return i - sum;
    }
}
