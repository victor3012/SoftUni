package Methods.Exercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        reviewPassword(password);
    }

    private static void reviewPassword(String password) {
        boolean isValid = true;
        // Characters count check
        if (!(password.length() >= 6 && password.length() <= 10)) {
            isValid = false;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistOfLettersAndDigits(password)) {
            isValid = false;
            System.out.println("Password must consist only of letters and digits");
        }
        if (digitsCount(password) < 2) {
            isValid = false;
            System.out.println("Password must have at least 2 digits");
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    private static int digitsCount(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean consistOfLettersAndDigits(String password) {
        boolean isTrue = true;
        for (int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);
            if (!Character.isLetterOrDigit(temp)) {
                return false;
            }
        }
        return true;
    }
}
