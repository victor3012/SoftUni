package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Contains":
                    int isInList = Integer.parseInt(tokens[1]);
                    if (numbers.contains(isInList)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (tokens[1]) {
                        case "odd":
                            printOdd(numbers);
                            break;
                        case "even":
                            printEven(numbers);
                            break;
                    }
                    break;
                case "Get":
                    int sum = getSum(numbers);
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(tokens[2]);
                    switch (tokens[1]) {
                        case "<":
                            for (int element : numbers) {
                                if (element < number) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int element : numbers) {
                                if (element > number) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int element : numbers) {
                                if (element <= number) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int element : numbers) {
                                if (element >= number) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printEven(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
