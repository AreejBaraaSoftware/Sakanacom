package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class furnituresaleTest {
	furnitureClass f=new furnitureClass();

	@Given("I am a tenant I have used furniture for sale")
	public void iAmATenantIHaveUsedFurnitureForSale() {
	   System.out.println(" ");
	}
	@When("I access the furniture advertising section I submit the furniture advertisement")
	public void iAccessTheFurnitureAdvertisingSectionISubmitTheFurnitureAdvertisement() {
		f.initfurniture();
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	            
	            System.out.println("7. Advertise used furniture for sale");
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	               
	                case 7:
	                    System.out.println("Advertise used furniture for sale");
	                   f.displayInfo();
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
	@Then("my furniture should be listed for sale")
	public void myFurnitureShouldBeListedForSale() {
	   equals(f.isFurnitflage()==true);
		
		
	}



}
