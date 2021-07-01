package Methods.Exercise;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getMiddleCharacters(input);
        System.out.println(output);
    }

    private static String getMiddleCharacters(String input) {
        // ex: asd -> s
        if (input.length() % 2 == 1) {
            return input.charAt(input.length() / 2) + "";
        }
        // ex: asds -> sd
        return input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2);
    }
}
