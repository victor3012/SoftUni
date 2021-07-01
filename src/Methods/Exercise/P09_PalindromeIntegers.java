package Methods.Exercise;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We don't need to threat the integers as numbers.
        // We can check if the String number is a palindrome.
        // This would work with all strings. Doesn't matter if it is a number or not.
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            boolean isPalindrome = isPalindrome(input);
            System.out.println(isPalindrome);
            input = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (!(input.charAt(i) == input.charAt(input.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
