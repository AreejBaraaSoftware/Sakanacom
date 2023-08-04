package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tenantviewownerdetalsTest {
	 Main n=new Main();
     AdminClass admin=new AdminClass();
	@When("I access the tenant control panel")
	public void iAccessTheTenantControlPanel() {
		n.addTestData();
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	            
	            System.out.println("5. View residence owner details");
	           
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	               
	                case 5:
	                    System.out.println("View residence owner details");
	                    admin.viewHousingDetailsByOwnerName("Alaa");
	                    admin.viewHousingDetailsByOwnerName("momen");
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
	@Then("I should see the owner name and his contact information")
	public void iShouldSeeTheOwnerNameAndHisContactInformation() {
	    equals(admin.getShowdetail()==true);
	}



}
