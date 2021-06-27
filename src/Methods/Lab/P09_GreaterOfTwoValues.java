package Methods.Lab;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int maxNumber = getMaxValueOf(Integer.parseInt(scanner.nextLine()),
                        Integer.parseInt(scanner.nextLine()));
                System.out.println(maxNumber);
                break;
            case "char":
                char maxChar = getMaxValueOf(scanner.nextLine().charAt(0),
                        scanner.nextLine().charAt(0));
                System.out.println(maxChar);
                break;
            case "string":
                String maxString = getMaxValueOf(scanner.nextLine(),
                        scanner.nextLine());
                System.out.println(maxString);
                break;
        }
    }

    private static int getMaxValueOf(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    private static char getMaxValueOf(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }

    private static String getMaxValueOf(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
