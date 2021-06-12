package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();

        if ( inputArray.length <= 1 ){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < inputArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += inputArray[j];
            }
            for (int j = i+1; j < inputArray.length; j++) {
                sum -= inputArray[j];
            }
            if ( sum == 0 ){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
