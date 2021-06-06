package BasicSyntax.Lab;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for ( int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d", input, i, input*i);
            System.out.println();
        }
    }
}
