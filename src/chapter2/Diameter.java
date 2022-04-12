package chapter2;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius of a circle: ");
        int radius = input.nextInt();
//        int diameter = 2*radius;
//        double circumference = 2 * Math.PI * radius;
//        double area = Math.PI * radius*radius;
        System.out.printf("%d%s%n", (2*radius), " is the diameter of a circle");
        System.out.printf("%f%s%n", (2 * Math.PI * radius), " is the circumference of a circle");
        System.out.printf("%f%s%n", (Math.PI * radius*radius), " is the area of a circle");

    }
}
