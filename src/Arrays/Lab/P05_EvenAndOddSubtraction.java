package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int sum = 0;
        for ( int number : numbers){
            if (number % 2 == 0){
                sum += number;
            }else{
                sum -= number;
            }
        }
        System.out.println(sum);
    }
}
