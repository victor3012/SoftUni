package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double) people / max);
        System.out.printf("%.0f", courses);
    }
}
