/**Даны числа X, Y, Z, Т — длины сторон четырехугольника.
*Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
package Overdreamer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int X = new Random().nextInt(20) + 1;
        System.out.println("First side is: " + X);
        int Y = new Random().nextInt(20) + 1;
        System.out.println("Second side is: " + Y);
        int Z = new Random().nextInt(20) + 1;
        System.out.println("Third side is: " + Z);
        int T = new Random().nextInt(20) + 1;
        System.out.println("Fourth side is: " + T);
        if (quadrangle(X, Y, Z, T))
            System.out.println("Quadrangle exist");
        else {
            System.out.println("Quadrangle not exist");
            return;
        }
        double areaQandrangle = areaRigthTriangle(X, Y) + areaSimpleTriangleTwoCorners(hypotenuseRightTriangle(X, Y), Z, T);
        System.out.println("Area of quadrangle is: " + String.format("%.2f",areaQandrangle));
    }

    public static boolean quadrangle(int x, int y, int z, int t) {
        float max1 = x, max2 = z, max;
        if (x < y)
            max1 = y;
        if (z < t)
            max2 = t;
        if (max1 < max2)
            max = max2;
        else max = max1;
        double hyp = hypotenuseRightTriangle(x, y);
        if (max < x + y + z + t - max && hyp + z > t && hyp + t > z && z + t > hyp)
            return true;
        else return false;
    }

    public static double areaRigthTriangle(int x, int y) {
        return x * y / 2;
    }

    public static double hypotenuseRightTriangle(int x, int y) {
        return Math.sqrt(x * x + y * y);

    }

    public static double areaSimpleTriangleTwoCorners(double x, double z, double t) { // принимает значения длин сторон между которыми угол 90 градусов
        double cornerA = Math.acos((x * x + z * z - t * t) / (2 * x * z));
        double cornerB = Math.acos((x * x + t * t - z * z) / (2 * x * t));
        double area = (x * x / 2) * (Math.sin(cornerA) * Math.sin(cornerB) / Math.sin(cornerA + cornerB));
        return area;
    }
}
