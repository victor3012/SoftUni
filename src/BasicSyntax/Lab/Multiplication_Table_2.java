package BasicSyntax.Lab;

import java.util.Scanner;

public class Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int inputMultiplier = Integer.parseInt(scanner.nextLine());

        do{
            System.out.printf("%d X %d = %d", inputNumber, inputMultiplier, inputNumber*inputMultiplier);
            System.out.println();
            inputMultiplier++;
        }while(inputMultiplier <= 10);

    }
}
