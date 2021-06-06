package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();

        int[] temp;
        for (int i = 0; i < inputArray.length - 1; i++) {
            temp = new int[inputArray.length -1];
            for (int j = 0; j < inputArray.length - 1; j++) {
                temp[j] = inputArray[j] + inputArray[j+1];
            }
            inputArray = temp;
        }
        // TODO! It isn't finished
        System.out.println(inputArray[0]);
    }
}
