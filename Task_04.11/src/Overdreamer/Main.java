/**Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 *
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
	int A = new Scanner(System.in).nextInt();
        System.out.print("Enter number 2: ");
	int B = new Scanner(System.in).nextInt();
        System.out.println("More digits in number " + Main.maxDigits(A, B));
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
    public static int maxDigits (int A, int B){
        int countA = numberDigits(A);
        int countB = numberDigits(B);
        if (countA > countB)
            return A;
        else return B;
    }
}
