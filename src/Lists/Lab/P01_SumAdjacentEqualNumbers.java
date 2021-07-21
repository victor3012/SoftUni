package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        while (numbers.size() > 1) {
            boolean isSomethingDone = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    numbers.remove(i);
                    numbers.set(i, numbers.get(i) * 2);
                    isSomethingDone = true;
                    break;
                }
            }
            if (!isSomethingDone) {
                break;
            }
        }

        for (double number : numbers) {
            DecimalFormat numberFormat = new DecimalFormat("###.#");
            System.out.print(numberFormat.format(number) + " ");
        }

    }
}
