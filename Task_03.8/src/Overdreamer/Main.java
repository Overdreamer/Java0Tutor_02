/**8.Даны дроби p1/q1, p2/q2, p3/q3...pn/qn, (где n и p , q - натуральные). Составить программу, которая приводит эти дроби к общему
*знаменателю и упорядочивает их в порядке возрастания.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int numerator[] = new int[new Random().nextInt(5) + 2];
        int denominator[] = new int[numerator.length];
        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = new Random().nextInt(9) + 2;
            denominator[i] = new Random().nextInt(2) + numerator[i] + 1;
        }
        System.out.println(Arrays.toString(numerator));
        System.out.println(Arrays.toString(denominator));
        int common_denominator = 1;

        for (int i : denominator) {
            common_denominator *= i;
        }
        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = common_denominator / denominator[i] * numerator[i];
            denominator[i] = common_denominator;
        }
        for (int i = numerator.length / 2, j; i > 0; i /= 2) {
            do {
                j = 0;
                for (int k = 0, m = i; m < numerator.length; k++, m++) {
                    if (numerator[k] > numerator[m]) {
                        int buf = numerator[k];
                        numerator[k] = numerator[m];
                        numerator[m] = buf;
                        j++;
                    }
                }
            } while (j != 0);
        }
        System.out.println(Arrays.toString(numerator));
        System.out.println(Arrays.toString(denominator));
    }
}
