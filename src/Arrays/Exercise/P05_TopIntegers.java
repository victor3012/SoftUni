package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();

        for (int i = 0; i < inputArray.length; i++) {
            int number = inputArray[i];
            boolean isBigger = true;
            for (int j = i + 1; j < inputArray.length; j++) {
                if ( inputArray[j] >= number) {
                    isBigger = false;
                }
            }
            if ( isBigger ) {
                System.out.print(number + " ");
            }
        }
    }
}
