package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TenantpayrentTest {

	Main n=new Main();
	
	Reservation r1=new Reservation();
	AdminClass admin=new AdminClass();
	Units u=new Units();
	@When("the rent payment is due")
	public void theRentPaymentIsDue() {
	   n.unitlist();
		
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	            
	            System.out.println("6. Pay the housing rent ");
	           
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	               
	                case 6:
	                    System.out.println("pay the rent");
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
	@Then("my rent payment should be recorded in the system")
	public void myRentPaymentShouldBeRecordedInTheSystem() {
	    equals(r1.isRevflage()==true);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
