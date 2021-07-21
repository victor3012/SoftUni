package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {

    public static List<Double> getListOfDoubles(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbersFirst = getListOfDoubles(scanner);
        List<Double> numbersSecond = getListOfDoubles(scanner);
        List<Double> finalList = new ArrayList<>();
        int minIndex = Math.min(numbersFirst.size(), numbersSecond.size());
        for (int i = 0; i < minIndex; i++) {
            finalList.add(numbersFirst.get(i));
            finalList.add(numbersSecond.get(i));
        }
        if (numbersFirst.size() > minIndex) {
            for (int i = minIndex; i < numbersFirst.size(); i++) {
                finalList.add(numbersFirst.get(i));
            }
        } else {
            for (int i = minIndex; i < numbersSecond.size(); i++) {
                finalList.add(numbersSecond.get(i));
            }
        }

        for (double number : finalList) {
            DecimalFormat numberFormat = new DecimalFormat("###.#");
            System.out.print(numberFormat.format(number) + " ");
        }
    }
}
