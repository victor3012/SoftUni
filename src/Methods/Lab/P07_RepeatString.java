package Methods.Lab;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());
        String output = repeatString(input, repeatTimes);
        System.out.println(output);
    }

    private static String repeatString(String input, int repeatTimes) {
        String output = "";
        for (int i = 0; i < repeatTimes; i++) {
            output += input;
        }
        return output;
    }
}
