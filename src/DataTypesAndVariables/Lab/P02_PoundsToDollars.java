package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", input * 1.31);
    }
}
