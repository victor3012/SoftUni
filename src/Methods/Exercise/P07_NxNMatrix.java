package Methods.Exercise;

import java.util.Scanner;

public class P07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printMatrix(input);
    }

    private static void printMatrix(int length) {
        for (int i = 1; i <= length; i++) {
            // For-each line
            printLine(length);
            System.out.println();
        }
    }

    private static void printLine(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(number + " ");
        }
    }
}
