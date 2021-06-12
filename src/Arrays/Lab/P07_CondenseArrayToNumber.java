package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        if ( inputArray.length == 1 ){
            System.out.println(inputArray[0]);
            return;
        }
        for (int i = 0; i < inputArray.length - 1; i++) {
            int n = inputArray.length - 1;
            for (int j = 0; j < n; j++) {
                inputArray[j] = inputArray[j] + inputArray[j+1];
            }
            n--;
        }
        System.out.println(inputArray[0]);
    }
}
