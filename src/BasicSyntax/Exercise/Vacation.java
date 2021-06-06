package BasicSyntax.Exercise;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double price = 0;

        if ( groupType.equals("Students")){

            switch (weekDay){
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.8;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }

            if ( people >= 30 ){
                price = price * 0.85;
            }

        } else if ( groupType.equals("Business")){

            switch (weekDay){
                case "Friday":
                    price = 10.9;
                    break;
                case "Saturday":
                    price = 15.6;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }

            if ( people >= 100){
                people -= 10;
            }

        } else if ( groupType.equals("Regular")){

            switch (weekDay){
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.5;
                    break;
            }

            if ( people <= 20 && people >= 10){
                price = price * 0.95;
            }

        }

        System.out.printf("Total price: %.2f", price*people);

    }
}
