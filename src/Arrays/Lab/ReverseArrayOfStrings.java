package Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splits = scanner.nextLine().split(" ");
        for (int i = 0; i < splits.length / 2; i++) {
            String temp = splits[i];
            splits[i] = splits[splits.length - 1 - i];
            splits[splits.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", splits));
    }
}
