package Methods.Exercise;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int vowelsCount = getCountOfVowels(input);
        System.out.println(vowelsCount);
    }

    private static int getCountOfVowels(String input) {
        int sum = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            switch (temp) {
                case 'a':
                case 'e':
                case 'u':
                case 'o':
                case 'i':
                    sum++;
                    break;
            }
        }
        return sum;
    }
}
