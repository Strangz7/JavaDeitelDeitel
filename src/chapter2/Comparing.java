package chapter2;

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int no = number * number;

        if (no > 100){
            System.out.printf("%d%s%n",no ," is greater than 100");
        }
        if (no < 100){
            System.out.printf("%d%s%n",no, " is lower than 100");
        }
        if (no == 100){
            System.out.printf("%d%s%n", no, " is equal to 100");
        }
        if (no != 100){
            System.out.printf("%d%s%n", no, " is not equal to 100");
        }
    }
}
