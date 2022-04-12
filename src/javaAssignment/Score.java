package javaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of student: ");
        int studentNo = input.nextInt();
        System.out.println("Input the number of subject: ");
        int subjectNo = input.nextInt();

        int [][] student = new int[studentNo][subjectNo];

        for (int i = 0; i <studentNo;i++){
            for (int j = 0; j < subjectNo; j ++){
                System.out.println("input score: ");
                int studentScore = input.nextInt();;
                student[i][j] = studentScore;

            }
        }

        for (int k = 0; k < studentNo; k++){
            for (int l = 0; l < subjectNo; l++){
                System.out.print(student[k][l] + " ");
            }
            System.out.println();
        }


    }
}
