/**Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 *
 */
package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the factorials of all odd numbers from 1 to 9 is: " + sumFactorialsOdd(1, 9));
    }
    public static int Factorail (int N){
        int fact = 1;
        for (int i = 2; i <= N; i++){
            fact *= i;
        }
        return fact;
    }
    public static int sumFactorialsOdd (int a, int b){
        int summFact = 0;
        for (int i = a; i <= b; i += 2){
            summFact += Factorail(i);
        }
        return summFact;
    }
}
