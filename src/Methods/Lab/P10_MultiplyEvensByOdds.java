package Methods.Lab;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int oddSum = getSumOfOdds(number);
        int evenSum = getSumOfEvens(number);
        System.out.println(oddSum * evenSum);
    }

    private static int getSumOfEvens(int number) {
        int sum = 0;
        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                sum += Math.abs(number % 10);
            }
            number /= 10;
        }
        return sum;
    }

    private static int getSumOfOdds(int number) {
        int sum = 0;
        while (number != 0) {
            if (!((number % 10) % 2 == 0)) {
                sum += Math.abs(number % 10);
            }
            number /= 10;
        }
        return sum;
    }
}
