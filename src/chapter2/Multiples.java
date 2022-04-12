package chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no1 = input.nextInt();
        System.out.print("Enter a number: ");
        int no2 = input.nextInt();
        int tripled = no1 * 3;
        int doubled = no2 * 2;

        if (tripled / doubled == 0){
            System.out.printf("%d%s%d%n", tripled, "is a multiple of", doubled);
        }
        System.out.println("Not a multiple");
    }
}
