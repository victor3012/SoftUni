package BasicSyntax.Exercise;

import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int n = Integer.parseInt(input.charAt(i) + "");
            int tempSum = 1;
            for (int j = 1; j <= n; j++) {
                tempSum *= j;
            }
            sum += tempSum;
        }

        if ( sum == number){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
