package najah.edu.acceptance;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class acceptrejecthousing {
 AdminClass admin = new AdminClass();
Main n=new Main();
	@Given("I am an admin")
	public void iAmAnAdmin() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" ");
	  
	}
	
	@When("I accept the advertisement")
	public void iAcceptTheAdvertisement() {
	
        n.addTestData();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nAdmin Dashboard");
            System.out.println("1. Accept/reject housing advertisements");
            System.out.println("2. print Result :");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");

            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();

                try {
                    int choice = Integer.parseInt(input);

                    switch (choice) {
                        case 1:
                            System.out.println("Accept/reject housing advertisements");
                            admin.manageHousingAdvertisements();
                        	
                            break;
                       
                        case 2:
                        	 System.out.println("---------------------------");
                        	admin .viewmanagmenthouse();
                        	break;
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

	    
	
	@Then("the housing should be listed as available")
	public void theHousingShouldBeListedAsAvailable() {
	    // Write code here that turns the phrase above into concrete actions
	   equals(admin.getState()==true);
	}



}
