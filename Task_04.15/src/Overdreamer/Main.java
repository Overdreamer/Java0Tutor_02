/**Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
* (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
package Overdreamer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number of characters in number: ");
        int n = new Scanner(System.in).nextInt();
        int start = Main.startNumber(n);
        for (int i = start; i < start * 10; i++){
            if (increasingNumber(i))
                System.out.println(i);
        }
    }
    public static int startNumber (int n){
        int i = 1;
        do {
            i *= 10;
            n--;
        }while(n != 1);
        return i;
    }
    public static boolean increasingNumber (int i){
        do{
            int n = i % 10;
            if (n - (i / 10 % 10) != 1){
                return false;
            }
            i /= 10;
        } while (i / 10 != 0);
        return true;
    }


}
