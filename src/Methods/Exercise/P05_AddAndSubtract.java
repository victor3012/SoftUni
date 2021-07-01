package Methods.Exercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int tempResult = add(first, second);
        int result = subtract(tempResult, third);
        System.out.println(result);
    }

    private static int subtract(int tempResult, int third) {
        return tempResult - third;
    }

    private static int add(int first, int second) {
        return first + second;
    }
}
