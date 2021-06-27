package Methods.Lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result;
        if (type.equals("add")) {
            result = add(firstNumber, secondNumber);
        } else if (type.equals("multiply")) {
            result = multiply(firstNumber, secondNumber);
        } else if (type.equals("subtract")) {
            result = subtract(firstNumber, secondNumber);
        } else {
            result = divide(firstNumber, secondNumber);
        }
        System.out.println(result);
    }

    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
