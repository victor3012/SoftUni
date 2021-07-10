package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> genres = Arrays.stream(scanner.nextLine().split(" | "))
                .filter(e -> !e.equals("|")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Stop!")) {
            String[] splits = input.split(" ");
            String command = splits[0];
            String argument = splits[1];

            switch (command) {
                case "Join":
                    if (!genres.contains(argument)) {
                        genres.add(argument);
                    }
                    break;
                case "Drop":
                    if (genres.contains(argument)) {
                        genres.remove(argument);
                    }
                    break;
                case "Replace":
                    String newGenre = splits[2];
                    if (genres.contains(argument) && !genres.contains(newGenre)) {
                        genres.set(genres.indexOf(argument), newGenre);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (String genre : genres) {
            System.out.print(genre + " ");
        }

    }
}
