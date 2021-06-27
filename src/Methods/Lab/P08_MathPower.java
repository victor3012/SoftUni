package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;


public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        double result = power(number, times);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double power(double number, int times) {
        double output = 1;
        for (int i = 0; i < times; i++) {
            output *= number;
        }
        return output;
    }
}
