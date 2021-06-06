package BasicSyntax.Lab;

import java.util.Scanner;

public class Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (minutes + 30) % 60;
        int totalHours = (hours + (minutes+30) / 60) % 24;

        System.out.printf("%d:%02d", totalHours, totalMinutes);


    }
}
