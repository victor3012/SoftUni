package BasicSyntax.Exercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        String reversedUsername = "";
        for ( int i = user.length() - 1; i >= 0; i--){
            reversedUsername += user.charAt(i);
        }

        boolean hasLoggedIn = false;

        for (int i = 0; i < 4; i++) {

            String password = scanner.nextLine();

            if ( password.equals(reversedUsername) ){
                hasLoggedIn = true;
                break;
            }
            if ( i != 3){
            System.out.println("Incorrect password. Try again.");
            }

        }

        if ( hasLoggedIn ) {
            System.out.printf("User %s logged in.", user);
        }else{
            System.out.printf("User %s blocked!", user);
        }

    }
}
