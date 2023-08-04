package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class personaldatatenantTest {

	Main n=new Main();
	Reservation r1=new Reservation();
	AdminClass admin=new AdminClass();
	Units u=new Units();

	@Given("I am a tenant I have booked an accommodation")
	public void iAmATenantIHaveBookedAnAccommodation() {
	    System.out.println(" ");
	}
	@When("I access my personal data in the tenant control panel")
	public void iAccessMyPersonalDataInTheTenantControlPanel() {
		n.unitlist();
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTenant Dashboard");
	           
	            System.out.println("4. View personal data");
	           
	            
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                
	                case 4:
	                    System.out.println("View personal data");
	                    r1.Reversehome();
		               // r1.viewRevesation();
		                r1.viewpersonaldataTenant();
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
	@Then("I should be able to see my personal information and the details of the housing I booked")
	public void iShouldBeAbleToSeeMyPersonalInformationAndTheDetailsOfTheHousingIBooked() {
	  equals(r1.isInfoflage()==true);
		
	}



}
