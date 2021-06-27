package Methods.Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = calculateArea(width, height);
        System.out.printf("%.0f", area);
    }

    private static double calculateArea(double width, double height) {
        return width * height;
    }
}
