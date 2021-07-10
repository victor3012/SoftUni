package MidExam;

import java.util.Scanner;

public class P01_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int experienceNeeded = Integer.parseInt(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= battlesCount; i++) {
            if (i % 15 == 0) {
                sum += Integer.parseInt(scanner.nextLine()) * 1.05;
            } else if (i % 3 == 0) {
                sum += Integer.parseInt(scanner.nextLine()) * 1.15;
            } else if (i % 5 == 0) {
                sum += Integer.parseInt(scanner.nextLine()) * 0.9;
            } else {
                sum += Integer.parseInt(scanner.nextLine());
            }
            if (experienceNeeded <= sum) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experienceNeeded - sum);
    }
}
