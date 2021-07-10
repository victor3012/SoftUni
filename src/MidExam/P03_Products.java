package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Products {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        String[] input = scanner.nextLine().split("%");
        String command = input[0];
        while (!command.equals("Shop!")) {

            switch (command) {
                case "Reversed":
                    products = reverse(products);
                    break;
                case "Remove":
                    String product = input[1];
                    if (products.contains(product)) {
                        products.remove(product);
                    } else {
                        System.out.printf("Product %s isn't in the list.%n", product);
                    }
                    break;
                case "Swap":
                    String firstProduct = input[1];
                    String secondProduct = input[2];
                    products = swap(products, firstProduct, secondProduct);
                    break;
                case "Add":
                    String type = input[1];
                    if (products.contains(type)) {
                        System.out.println("The product is already in the list.");
                    } else {
                        products.add(type);
                    }
                    break;
                case "Important":
                    String productName = input[1];
                    if (products.contains(productName)) {
                        products.remove(productName);
                    }
                    products.add(0, productName);
                    break;
            }

            input = scanner.nextLine().split("%");
            command = input[0];
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, products.get(i));
        }
    }

    private static List<String> swap(List<String> products, String firstProduct, String secondProduct) {
        boolean isSomethingMissing = false;
        if (!products.contains(firstProduct)) {
            System.out.printf("Product %s missing!%n", firstProduct);
            isSomethingMissing = true;
        }
        if (!products.contains(secondProduct)) {
            System.out.printf("Product %s missing!%n", secondProduct);
            isSomethingMissing = true;
        }

        if (isSomethingMissing) {
            return products;
        } else {
            int firstIndex = products.indexOf(firstProduct);
            int secondIndex = products.indexOf(secondProduct);
            products.set(firstIndex, secondProduct);
            products.set(secondIndex, firstProduct);
            return products;
        }
    }

    private static List<String> reverse(List<String> products) {
        List<String> temp = new ArrayList<String>();
        for (int i = products.size(); i >= 0; i--) {
            temp.add(products.get(i));
        }
        return temp;
    }
}
