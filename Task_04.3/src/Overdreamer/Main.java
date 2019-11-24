/**Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 *
 */
package Overdreamer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter side length regular hexagon: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Area of regular hexagon is " + String.format("%.2f",area_of_triangle(a) * 6));
    }
    public static float area_of_triangle (int a){
        return (float)Math.sqrt(3) * a / 4;
    }
}
