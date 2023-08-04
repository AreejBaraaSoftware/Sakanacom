package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;
import najah.edu.acceptance.AdminClass;

public class Main {
	public static  boolean adminflag=false;
	public static  boolean userflage=false;
	public static  boolean Exitflage=false;
	public static  boolean ownerflage=false;
	public static boolean isExitflage() {
		return Exitflage;
	}
	public static void setExitflage(boolean exitflage) {
		Exitflage = exitflage;
	}


	public static  boolean tenantflage=false;
	 public static AdminClass admin = new AdminClass();
	 public static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	 public static OwnerClass o2=new OwnerClass ("momen","05998979");
     public static Units u=new Units();
	public static User loggedInUser;
	public static ArrayList<User> users = new ArrayList<User>();
	
    public static void userlogin () {
    	ArrayList<User> users = new ArrayList<User>();
    	users.add(new User("Baraa", "T***", "tenant")); // Admin user
	    users.add(new User("Areej", "A***", "admin")); // Tenant user
	    users.add(new User("Alaa", "O***", "owner")); //Owner user
	  //  users.add(new User("Alaa", "O***", "owner"));// Owner user
    	while(true) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("\n Welcome to the Housing Management System!");
		    // Create an ArrayList to store the login credentials
		    System.out.print("Enter username: ");
		    String username = scanner.nextLine();

		    System.out.print("Enter password: ");
		    String password = scanner.nextLine();

		    loggedInUser = null;

		    // Iterate over the users to find a match for the entered credentials
		    for (User user : users) {
		        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
		            loggedInUser = user;
		            userflage=true;
		            break;
		        }
		    }

		    if (loggedInUser != null) {
		        System.out.println("Logged in as " + loggedInUser.getRole() + ".");
		        if (loggedInUser.getRole().equals("admin")) {
		            adminDashboard();
		            adminflag=true;
		            
		        } else if (loggedInUser.getRole().equals("tenant")) {
		        	
		            tenantDashboard();
		            tenantflage=true;
		        } else if (loggedInUser.getRole().equals("owner")) {
		            ownerDashboard();
		            ownerflage=true;
		        }
		    } else {
		        System.out.println("Invalid username or password. Please try again.");
		    }
		}
    }
    
   
    public static   Reservation R1=new Reservation();
 
    public static void  addTestData() {
    	 
    	HousingAdvertisement ad1 = new HousingAdvertisement("Title 1", "Description 1","Nablus",o1);
        HousingAdvertisement ad2 = new HousingAdvertisement("Title 2", "Description 2","Ramallah",o2);
        
        ad1.setApproved(true);
        ad2.setApproved(true);
        
        admin.housingAdvertisements.add(ad1);
        admin.housingAdvertisements.add(ad2);
        
        
      
        //unit1.addReservation(reservation1);
        //unit2.addReservation(reservation2);   
        
       // ad2.addUnit(unit1);
       // ad1.addUnit(unit2);
        
    }
    public static void  addTestDataRes() {
    Reservation reservation1 = new Reservation("John Doe", "john.doe@example.com", "2023-07-01", "2023-07-08");
    Reservation reservation2 = new Reservation("Jane Smith", "jane.smith@example.com", "2023-07-05", "2023-07-12");
    Reservation.setApproved(true);
    Reservation .setApproved(true);
   R1.Reservelist.add(reservation1);
   R1.Reservelist.add(reservation2);
    }
    public static void unitlist() {
    	Units unit1 = new Units("101", 2, 1, true,false,"photo1.txt",4000);
        Units unit2 = new Units("102", 3, 2, false,true,"photo2.txt",2000);
        unit1.setApproved1(true);
        unit2.setApproved1(true);
        u.unit.add(unit1);
        u.unit.add(unit2);
       
    }
  
	public static void main(String[] args) {
		addTestData();
		userlogin();
	}

    public static void adminDashboard() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nAdmin Dashboard");
            System.out.println("1. Accept/reject housing advertisements");
            System.out.println("2. View reservations");
            System.out.println("3. Add housing units");
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
            System.out.println("2. View housing details");            
            System.out.println("3. View tenants");
            System.out.println("4. Add apartment details");
            System.out.println("5. Modify housing data");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("View housing details");
                    // Implement view housing details functionality here
                    admin.viewHousingDetailsByOwnerName(o1.getName());
                    break;
                case 2:
                    System.out.println("Modify apartment details");
                    // Implement modify apartment details functionality here
                    admin.modifyHousingData();
                    break;
                case 3:
                    System.out.println("View tenants");
                   // o1.owneraddNewHousing();
                    // Implement view tenants functionality here
                    break;
                case 4: 
                    System.out.println("Add apartment details");
                    
                    // Implement add apartment details functionality here
                    break;
                case 5:
                    System.out.println("Modify apartment details");
                    // Implement modify apartment details functionality here
                    break;
                
                case 0:
                    exit = true;
                    Exitflage=true;
                    System.out.println("Logged out successfully");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
