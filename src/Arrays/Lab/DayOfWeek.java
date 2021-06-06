package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        input--;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ( input < 7 && input > -1){
            System.out.println(days[input]);
        } else{
            System.out.println("Invalid day!");
        }
    }
}
