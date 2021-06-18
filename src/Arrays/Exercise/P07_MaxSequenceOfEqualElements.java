package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();

        int number = 0;
        int timesMet = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            int tempNumber = inputArray[i];
            int tempTimesMet = 1;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (tempNumber == inputArray[j]) {
                    tempTimesMet++;
                } else {
                    break;
                }
            }
            if (tempTimesMet > timesMet) {
                timesMet = tempTimesMet;
                number = tempNumber;
            }
        }
        for (int i = 0; i < timesMet; i++) {
            System.out.print(number + " ");
        }
    }
}
