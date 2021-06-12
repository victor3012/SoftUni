package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");
        for (int i = 0; i < secondInput.length; i++) {
            if ( Arrays.asList(firstInput).contains(secondInput[i])){
                System.out.print(secondInput[i] + " ");
            }
        }
    }
}
