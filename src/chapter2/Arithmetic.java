package chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int no1 = number * number;
        int no2 = number2 * number2;

        int sum = no1 + no2;
        int minus = no1 - no2;

        System.out.printf("%s%d%n","The square of the first number ", no1);
        System.out.printf("%s%d%n","The square of the second number ", no2);
        System.out.printf("%s%d%n", "The sum of the square is ", sum);
        System.out.printf("%s%d%n", "The difference of the square is ",minus);
    }
}
