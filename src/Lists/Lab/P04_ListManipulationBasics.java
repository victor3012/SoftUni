package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");
            int number = Integer.parseInt(tokens[1]);
            switch (tokens[0]) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    numbers.add(index, number);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
