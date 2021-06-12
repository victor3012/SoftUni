package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double size = 0;
        String finalModel = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            if ( size < Math.PI * radius * radius * height){
                size = Math.PI * radius * radius * height;
                finalModel = model;
            }
        }
        System.out.println(finalModel);
    }
}
