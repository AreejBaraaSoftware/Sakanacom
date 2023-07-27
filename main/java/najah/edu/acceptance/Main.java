package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;
import najah.edu.acceptance.AdminClass;

public class Main {
	static AdminClass admin = new AdminClass();
	static User loggedInUser;
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("\n Welcome to the Housing Management System!");

		    // Create an ArrayList to store the login credentials
		    ArrayList<User> users = new ArrayList<>();
		    users.add(new User("admin", "admin123", "admin")); // Admin user
		    users.add(new User("tenant", "tenant123", "tenant")); // Tenant user
		    users.add(new User("owner", "owner123", "owner")); // Owner user

		    System.out.print("Enter username: ");
		    String username = scanner.nextLine();

		    System.out.print("Enter password: ");
		    String password = scanner.nextLine();

		    loggedInUser = null;

		    // Iterate over the users to find a match for the entered credentials
		    for (User user : users) {
		        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
		            loggedInUser = user;
		            break;
		        }
		    }

		    if (loggedInUser != null) {
		        System.out.println("Logged in as " + loggedInUser.getRole() + ".");
		        if (loggedInUser.getRole().equals("admin")) {
		            adminDashboard();
		        } else if (loggedInUser.getRole().equals("tenant")) {
		            tenantDashboard();
		        } else if (loggedInUser.getRole().equals("owner")) {
		            ownerDashboard();
		        }
		    } else {
		        System.out.println("Invalid username or password. Please try again.");
		    }
		}
	    
	}

    public static void adminDashboard() {
        
        admin.addTestData();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nAdmin Dashboard");
            System.out.println("1. Accept/reject housing advertisements");
            System.out.println("2. View reservations");
            System.out.println("3. Add housing units");
            System.out.println("4. Modify housing data");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");

            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();

                try {
                    int choice = Integer.parseInt(input);

                    switch (choice) {
                        case 1:
                            System.out.println("Accept/reject housing advertisements");
                            admin.manageHousingAdvertisements();
                            break;
                        case 2:
                            System.out.println("View reservations");
                            admin.viewReservations();
                            break;
                        case 3:
                            System.out.println("Add housing units");
                            admin.addHousingUnit();
                            break;
                        case 4:
                            System.out.println("Modify housing data");
                            admin.modifyHousingData();
                            break;
                        case 0:
                            exit = true;
                            System.out.println("Logged out successfully");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer choice.");
                    continue; 
                }
            } else {
                System.out.println("No input found. Please try again.");
            }
        }
    }


    public static void tenantDashboard() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTenant Dashboard");
            System.out.println("1. View available housing");
            System.out.println("2. View housing details");
            System.out.println("3. Book accommodation");
            System.out.println("4. View personal data");
            System.out.println("5. View residence owner details");
            System.out.println("6. View rent payment status");
            System.out.println("7. Advertise used furniture for sale");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("View available housing");
                    // Implement view available housing functionality here
                    break;
                case 2:
                    System.out.println("View housing details");
                    // Implement view housing details functionality here
                    break;
                case 3:
                    System.out.println("Book accommodation");
                    // Implement book accommodation functionality here
                    break;
                case 4:
                    System.out.println("View personal data");
                    // Implement view personal data functionality here
                    break;
                case 5:
                    System.out.println("View residence owner details");
                    // Implement view residence owner details functionality here
                    break;
                case 6:
                    System.out.println("View rent payment status");
                    // Implement view rent payment status functionality here
                    break;
                case 7:
                    System.out.println("Advertise used furniture for sale");
                    // Implement advertise used furniture for sale functionality here
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

    public static void ownerDashboard() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOwner Dashboard");
            System.out.println("1. View housing details");
            System.out.println("2. View tenants");
            System.out.println("3. Add apartment details");
            System.out.println("4. Modify apartment details");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("View housing details");
                    // Implement view housing details functionality here
                    admin.viewHousingDetailsByOwnerName("owner");
                    break;
                case 2:
                    System.out.println("View tenants");
                    // Implement view tenants functionality here
                    break;
                case 3: 
                    System.out.println("Add apartment details");
                    // Implement add apartment details functionality here
                    break;
                case 4:
                    System.out.println("Modify apartment details");
                    // Implement modify apartment details functionality here
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
}
