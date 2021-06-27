package Methods.Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type) {
            case "coffee":
                price = getPriceForCoffee(quantity);
                break;
            case "water":
                price = getPriceForWater(quantity);
                break;
            case "coke":
                price = getPriceForCoke(quantity);
                break;
            case "snacks":
                price = getPriceForSnacks(quantity);
                break;

        }
        System.out.printf("%.2f", price);
    }

    private static double getPriceForCoffee(int quantity) {
        return quantity * 1.5;
    }

    private static double getPriceForWater(int quantity) {
        return quantity * 1.0;
    }

    private static double getPriceForCoke(int quantity) {
        return quantity * 1.4;
    }

    private static double getPriceForSnacks(int quantity) {
        return quantity * 2.0;
    }
}
