/**На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
* между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
package Overdreamer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter amount if points: ");
        int arr[][] = new int [new Scanner(System.in).nextInt()][2];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 2; j++){
                arr[i][j] = new Random().nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        float maxDistance = distance(arr[0][0], arr[0][1], arr[1][0], arr[1][1]);
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                float maxDistance1 = distance(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
                if (maxDistance < maxDistance1) {
                    maxDistance = maxDistance1;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Maximum distance between points " + a + " and " + b);
    }
    public static float distance (int a1, int b1, int a2, int b2){
        return (float)Math.sqrt(Math.pow((a2 - a1),2)+Math.pow((b2 - b1),2));
    }
}
