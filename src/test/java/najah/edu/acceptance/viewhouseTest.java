package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewhouseTest {
	AdminClass admin=new AdminClass();
    Main n=new Main();
	@When("I access the owner control panel")
	public void iAccessTheOwnerControlPanel() {
		 n.addTestData();
		// n.addTestData();
		Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOwner Dashboard");
           
            System.out.println("2. View housing details");            
           
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                
                case 2:
                    System.out.println("view house details");
                    // Implement modify apartment details functionality here
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
	@Then("I should see my listed housing units in the control panel")
	public void iShouldSeeMyListedHousingUnitsInTheControlPanel() {
	    
		
		equals(admin.getShowdetail()==true);
	}



}
