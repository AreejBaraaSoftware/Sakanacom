package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tenantviewavailablehouse {
	Units u=new Units();
	Main n=new Main();
	@Given("I am a tenant")
	public void iAmATenant() {
	  System.out.println(" ");
	}
	@When("I access the available housing listings")
	public void iAccessTheAvailableHousingListings() {
	    
		n.unitlist();
		
		  Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	            System.out.println("1. View available housing");
	           
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.println("View available housing");
	                  u.viewunit();
	                   u.availableornot();
	                    break;
	               
	                case 0:
	                    exit = true;
	                    System.out.println("Logged out successfully");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
		
		
		
		
		
		
		
		
	}
	@Then("I should see a list of available housing options")
	public void iShouldSeeAListOfAvailableHousingOptions() {
		 equals(u.getAvailableflage()==true);
		
	}



}
