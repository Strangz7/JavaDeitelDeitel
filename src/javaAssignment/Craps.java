package javaAssignment;

import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {

        char[] craps = {'1', '2', '3', '4', '5', '6'};
        Random pass = new Random();
        char random = ' ';
        for (int i = 0; i < 1; i++) {
            random = craps[pass.nextInt(6)];
            System.out.print(random+ " ");
        }
        char[] second = {'1', '2', '3', '4', '5', '6'};
        Random pass2 = new Random();
        char random1 = ' ';
        for (int i = 0; i < 1; i++) {
            random1 = second[pass2.nextInt(6)];
            // random.Max
            System.out.print(random1);
        }
        int call = random + random1;
        System.out.println(call);
    }
}
