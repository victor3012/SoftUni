package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        int inputSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputSum) {
                    System.out.println(inputArray[i] + " " + inputArray[j]);
                }
            }
        }
    }
}
