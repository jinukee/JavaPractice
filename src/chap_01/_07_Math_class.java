package chap_01;

import java.util.Scanner;

public class _07_Math_class {
    public static void main(String[] args) {

//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.max(y, x);
        //double z = Math.min(y, x);
        //double z = Math.abs(y);
        //double z = Math.sqrt(y);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x : ");
        x = scanner.nextDouble();
        System.out.println("Enter side y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();
    }
}
