package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if ( input > capacity ) {
                System.out.println("Insufficient capacity!");
            }else{
                capacity -= input;
            }
        }
        System.out.println(255 - capacity);
    }
}
