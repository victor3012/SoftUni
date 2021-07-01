package Methods.Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        double firstFactorial = getFactorial(first);
        double secondFactorial = getFactorial(second);
        System.out.printf("%.2f", firstFactorial / secondFactorial);
    }

    private static double getFactorial(int number) {
        double result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
