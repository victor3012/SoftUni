package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]){
                sum += firstArray[i];
            }else{
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }

        System.out.println("Arrays are identical. Sum: " +sum);
    }
}
