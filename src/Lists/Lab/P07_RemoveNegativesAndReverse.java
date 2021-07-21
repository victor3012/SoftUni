package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers.removeIf(element -> element < 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
            return;
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
