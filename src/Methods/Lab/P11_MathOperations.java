package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        double second = Double.parseDouble(scanner.nextLine());
        double result = 0;
        switch (type) {
            case "+":
                result = add(first, second);
                break;
            case "-":
                result = substract(first, second);
                break;
            case "*":
                result = multiply(first, second);
                break;
            case "/":
                result = divide(first, second);
                break;
        }
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.printf(format.format(result));
    }

    private static double divide(double first, double second) {
        return first / second;
    }

    private static double multiply(double first, double second) {
        return first * second;
    }

    private static double substract(double first, double second) {
        return first - second;
    }

    private static double add(double first, double second) {
        return first + second;
    }

}
