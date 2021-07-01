package Methods.Exercise;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallest(first, second, third));
    }

    private static int getSmallest(int first, int second, int third) {
        int temp = Math.min(first, second);
        return Math.min(temp, third);
    }
}
