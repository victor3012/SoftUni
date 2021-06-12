package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        for (int i = 0; i < n; i++) {
            String[] inputArray = scanner.nextLine().split(" ");
            if ( i % 2 == 0){
            firstArray[i] = Integer.parseInt(inputArray[0]);
            secondArray[i] = Integer.parseInt(inputArray[1]);
            } else {
                firstArray[i] = Integer.parseInt(inputArray[1]);
                secondArray[i] = Integer.parseInt(inputArray[0]);
            }
        }
        for ( int number : firstArray ){
            System.out.print(number + " ");
        }
        System.out.println();
        for ( int number : secondArray ){
            System.out.print(number + " ");
        }
    }
}
