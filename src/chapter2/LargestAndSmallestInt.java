package chapter2;

import java.util.Scanner;

public class LargestAndSmallestInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int no1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int no2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int no3 = input.nextInt();
        System.out.print("Enter 4th number: ");
        int no4 = input.nextInt();
        System.out.print("Enter 5th number: ");
        int no5 = input.nextInt();

        if (no1 > no2 & no1 > no3 & no1 > no4 & no1 > no5){
            System.out.printf("%s%d%n", "First number is the highest ", no1);
        }
        if (no2 > no1 & no2 > no3 & no2 > no4 & no2 > no5){
            System.out.printf("%s%d%n", "Second number is the highest ", no2);
        }
        if (no3 > no1 & no3 > no2 & no3 > no4 & no3 > no5){
            System.out.printf("%s%d%n", "Third number is the highest ", no3);
        }
        if (no4 > no1 & no4 > no2 & no4 > no3 & no4 > no5){
            System.out.printf("%s%d%n", "Fourth number is the highest ", no4);
        }
        if (no5 > no1 & no5 > no2 & no5 > no3 & no5 > no4){
            System.out.printf("%s%d%n", "Fifth number is the highest ", no5);
        }
    }
}
