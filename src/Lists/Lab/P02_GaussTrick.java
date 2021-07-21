package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            double number = numbers.get(i) + numbers.get(size - i - 1);
            DecimalFormat numberFormat = new DecimalFormat("###.#");
            System.out.print(numberFormat.format(number) + " ");
        }

        if (size % 2 == 1) {
            DecimalFormat numberFormat = new DecimalFormat("###.#");
            System.out.print(numberFormat.format(numbers.get(size / 2)) + " ");
        }

    }
}
