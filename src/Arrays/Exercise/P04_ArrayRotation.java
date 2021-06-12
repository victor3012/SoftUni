package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int temp = inputArray[0];
            for (int j = 1; j < inputArray.length; j++) {
                inputArray[j-1] = inputArray[j];
            }
            inputArray[inputArray.length - 1 ] = temp;
        }

        for ( int number : inputArray) {
            System.out.print(number + " ");
        }
    }
}
