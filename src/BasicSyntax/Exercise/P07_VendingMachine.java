package BasicSyntax.Exercise;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;
        while(!(input.equals("Start"))){
            double number = Double.parseDouble(input);
            if (number == 0.1 || number == 0.2 || number == 0.5 || number == 1.0 || number == 2.0) {
                money += number;
            } else {
                System.out.printf("Cannot accept %.2f", number);
                System.out.println();
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!(input.equals("End"))){
        double price = 0;
            switch(input){
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if ( price == 0){

            }
            else if ( money < price ){
                System.out.println("Sorry, not enough money");
            }else{
                money -= price;
                System.out.println("Purchased " +input);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
