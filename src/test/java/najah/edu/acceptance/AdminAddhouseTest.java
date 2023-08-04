package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAddhouseTest {
	
	 AdminClass admin = new AdminClass();
	 Main n=new Main();


	@When("I add new housing")
	public void iAddNewHousing() {
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nAdmin Dashboard");
	            System.out.println("3. Add housing units");
	            System.out.println("4. print Result : ");
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");

	            if (scanner.hasNextLine()) {
	                String input = scanner.nextLine();

	                try {
	                    int choice = Integer.parseInt(input);

	                    switch (choice) {
	                       
	                        case 3:
	                            System.out.println("Add housing units");
	                            admin.addNewHousing();
	                            break;
	                        case 4:
	                        	System.out.println("-------------------------------------");
	                            admin.viewHousingDetailsByOwnerName("Alaa");
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
	@Then("the housing should be available for listing")
	public void theHousingShouldBeAvailableForListing() {
		   equals(admin.isHOUSEADED()==true);

	   
	}



	}




