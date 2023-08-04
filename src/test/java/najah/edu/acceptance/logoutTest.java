package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class logoutTest {
	 Main n=new Main();
	@Given("I am a  logged into the system")
	public void iAmALoggedIntoTheSystem() {
	   System.out.println(" ");
	}

	@Then("I should be logged out of the system")
	public void iShouldBeLoggedOutOfTheSystem() {
	   
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nAdmin Dashboard");
	          
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");

	            if (scanner.hasNextLine()) {
	                String input = scanner.nextLine();

	                try {
	                    int choice = Integer.parseInt(input);

	                    switch (choice) {
	                       
	                        case 0:
	                            exit = true;
	                            System.out.println("Logged out successfully");
	                            break;
	                        default:
	                            System.out.println("Invalid choice. Please try again.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. Please enter a valid integer choice.");
	                    continue; 
	                }
	            } else {
	                System.out.println("No input found. Please try again.");
	            }
	        }
	}

	@Then("I should be redirected to the login page")
	public void iShouldBeRedirectedToTheLoginPage() {
	    equals(n.isExitflage()==true);
	}
}
