package Methods.Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        int min = Math.min(firstChar, secondChar);
        int max = Math.max(firstChar, secondChar);
        printCharactersInRage(min, max);
    }

    private static void printCharactersInRage(int min, int max) {
        for (int i = min + 1; i < max; i++) {
            System.out.print((char) i + " ");
        }
    }
}
