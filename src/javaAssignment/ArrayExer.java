package javaAssignment;

import java.util.Scanner;

public class ArrayExer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {2,3,4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];


            System.out.println(array[i]);
        }
        int average = sum / array.length;
        System.out.println(sum);
        System.out.println(average);



//        int [][] array = new int [10][10];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = input.nextInt();
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

}
