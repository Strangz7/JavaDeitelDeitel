package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int no1 = input.nextInt();
        System.out.print("Enter second number: ");
        int no2 = input.nextInt();
        System.out.print("Enter second number: ");
        int no3 = input.nextInt();

        int sum = no1 + no2 + no3;
        int average = (no1+no2+no3)/3;
        int product = no1 * no2 * no3;
        System.out.printf("%s%d%n", "The sum is ", sum);
        System.out.printf("%s%d%n", "The average is ", average);
        System.out.printf("%s%d%n", "The product is ",product);

        if (no1 > no2 & no1 > no3){
            System.out.printf("%d%s%n", no1, " is the highest");
        }
        if (no2 > no1 & no2 > no3){
            System.out.printf("%d%s%n", no2, " is the highest");
        }
        if (no3 > no1 & no3 > no2){
            System.out.printf("%d%s%n", no3, " is the highest");
        }
    }
}
