package BasicSyntax.Lab;

import java.util.Scanner;

public class P12_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        while(Math.abs(input) % 2 == 1){
            System.out.println("Please write an even number.");
            input = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The number is: " +Math.abs(input));

    }
}
