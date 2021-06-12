package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            int number = i;
            int sum = 0;
            while ( number != 0 ){
                sum += number%10;
                number /= 10;
            }
            if ( sum == 5 || sum == 7 || sum == 11){
                System.out.println(i + " -> True");
            }else{
                System.out.println(i + " -> False");
            }
        }
    }
}
