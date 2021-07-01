package Methods.Exercise;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isTopNumber(int input) {
        return sumOfDigits(input) % 8 == 0 && hasOddDigit(input);
    }

    private static int sumOfDigits(int input) {
        int sum = 0;
        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }

    private static boolean hasOddDigit(int input) {
        while (input != 0) {
            if (input % 2 == 1) {
                return true;
            }
            input /= 10;
        }
        return false;
    }
}
