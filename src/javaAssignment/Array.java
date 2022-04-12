package javaAssignment;

public class Array {
    public static void main(String[] args) {
        char [][] hub = new char[3][3];
        hub [0][0] = 'X';
        hub [0][1] = 'O';
        hub [0][2] = 'X';

        hub [1][0] = 'X';
        hub [1][1] = 'X';
        hub [1][2] = 'X';

        hub [2][0] = 'O';
        hub [2][1] = 'X';
        hub [2][2] = 'O';

        System.out.println(hub [0][0] + " ");
        System.out.print(" ");

        System.out.print(hub [0][1] );
        System.out.print(" ");
        System.out.println(hub [0][2]);


        System.out.print(hub [1][0]);
        System.out.print(" ");
        System.out.print(hub [1][1]);
        System.out.print(" ");
        System.out.println(hub [1][2]);

        System.out.print(hub [2][0]);
        System.out.print(" ");
        System.out.print(hub [2][1] );
        System.out.print(" ");
        System.out.print(hub [2][2] + " ");


    }
}
