package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        char firstChar = 'a';
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                for (int k = 0; k < input; k++) {
                    System.out.printf("%c%c%c", firstChar + i, firstChar + j, firstChar + k);
                    System.out.println();
                }
            }
        }
    }
}
