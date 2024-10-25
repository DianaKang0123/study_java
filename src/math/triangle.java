package math;

import java.time.Year;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = sc.nextDouble();
        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The Hypotenuse is : " + z);

        sc.close(); // 해주는 것이 좋음
    }
}
