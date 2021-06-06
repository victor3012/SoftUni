package BasicSyntax.Exercise;

import java.util.Scanner;

public class Print_and_Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " +sum);
    }
}