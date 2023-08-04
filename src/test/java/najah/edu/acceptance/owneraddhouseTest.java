package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class owneraddhouseTest {
	
	
	AdminClass admin=new AdminClass();
	OwnerClass o1=new OwnerClass();
	Units un=new Units();
	Main n=new Main();
	@Given("I am an owner")
	public void iAmAnOwner() {
	   
	  System.out.println(" ");
	}

	Units u=new Units();
	@When("I add a new housing unit")
	public void iAddANewHousingUnit() {
	    
		n.unitlist();
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nOwner Dashboard");
	           
	            System.out.println("4. Add apartment details");
	            System.out.println("5. print :");
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	               
	                case 4: 
	                    System.out.println("Add apartment details");
	                  //  o1.owneraddNewHousing();
	                    admin.addHousingUnit();
	                   
	                    // Implement add apartment details functionality here
	                    break;
	                case 5:
	                	admin.viewmanagmenthouse();
	                	//un.viewunit();
	                	
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

	@Then("the housing unit should be added to my listings")
	public void theHousingUnitShouldBeAddedToMyListings() {
	   // equals(o1.getOwneraddhouse()==true);
		equals(admin.getAddflage()==true);
		
	}
}
