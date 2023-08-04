package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TenentReserviedTest {
	Main n=new Main();
	Reservation r1=new Reservation();
	AdminClass admin=new AdminClass();
	Units u=new Units();

	@Given("I am a tenant and i select unit")
	public void iAmATenantAndISelectUnit() {
	  System.out.println(" ");
	}
	@When("I book the accommodation")
	public void iBookTheAccommodation() {
		//n.addTestDataRes();
		n.unitlist();
		  Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	           
	            System.out.println("3. Book accommodation");
	           
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                
	                case 3:
	                    System.out.println("Book accommodation");
	                   // u.viewunit();
	                   r1.Reversehome();
	                   r1.viewRevesation();
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
	
	@Then("the accommodation should be reserved for me")
	public void theAccommodationShouldBeReservedForMe() {
	   equals(r1.isRevflage()==true);
	}



	
	
}
