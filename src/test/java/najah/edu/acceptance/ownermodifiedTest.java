package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ownermodifiedTest {
	AdminClass admin=new AdminClass();
	OwnerClass o1=new OwnerClass();
	Main n=new Main();

	@When("I choose to update the housing details and list of choices will appear")
	public void iChooseToUpdateTheHousingDetailsAndListOfChoicesWillAppear() {
	   
	    
		 Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nOwner Dashboard");
	            System.out.println("5. Modify housing data");
	            System.out.println("6. print Result :");
	            System.out.println("0. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	            case 6:
	            	 System.out.println("-------------------------------------------- ");
	            	admin.informationho();
	            	  System.out.println("-------------------------------------------- ");
	            	  // admin.viewhouse1();
	                    break;
	                case 5:
	                    
	                	System.out.println("----------------------------------- ");
	                    admin.modifyHousingData();
	                    admin.viewhouse1();
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
		
		
	   

	@Then("changes should be reflected in the system")
	public void changesShouldBeReflectedInTheSystem() {
	    
		equals(admin.getModifedflage()==true);
	}



}
