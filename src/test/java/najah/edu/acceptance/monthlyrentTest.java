package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class monthlyrentTest {
	Main n=new Main();
	Units u=new Units();

	@When("I access unit information")
	public void iAccessUnitInformation() {
	    
		n.unitlist();
		Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOwner Dashboard");
           
            System.out.println("5. view monthlyRent Service");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                
                case 5:
                    System.out.println("view monthlyRent Service");
                    u.informationaboutmonthlyrent();
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
	@Then("I should see if monthlyrent in unit or not")
	public void iShouldSeeIfMonthlyrentInUnitOrNot() {
		  equals(u.getMonthlyflage()==true);
	}



}
