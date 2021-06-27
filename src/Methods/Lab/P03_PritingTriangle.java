package Methods.Lab;

import java.util.Scanner;

public class P03_PritingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        printTriangle(index);
    }

    private static void printTriangle(int number) {
        printTop(number);
        printMiddle(number);
        printBottom(number);
    }

    private static void printTop(int number) {
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    private static void printMiddle(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    private static void printBottom(int number) {
        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
