//Uwais Cornelius, 4121659 - Rain Gauge: A rainfall tracker app
import java.util.Scanner;

public class RainGauge {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The purpose of this project is to \ncreate an app that will keep track \nof rainfall and provide statistics \naccording to the user's input.\n");
		
		System.out.println("User Registration");
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter your username: ");
        String username = keyboard.nextLine();

        System.out.print("Enter your password: ");
        String password = keyboard.nextLine();
        
        System.out.print("Confirm your password: ");
        String passwordConfirm = keyboard.nextLine();
        
        if (password.equals(passwordConfirm)) {
        	System.out.println("\nRegistration Successful! You may login using your username and password.");
            System.out.println("Hi " + name);
            System.out.println("Your username is " + username);
        }
        else {
        	System.out.println("Password could not be confirmed. Please start over.");
        }

        
		keyboard.close();
	}

}
