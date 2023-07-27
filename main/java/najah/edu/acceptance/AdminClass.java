package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminClass {
	
	private ArrayList<HousingAdvertisement> housingAdvertisements;
    public AdminClass() {
        housingAdvertisements = new ArrayList<>();
        
    }
    
    public void addTestData() {
    	OwnerClass o1=new OwnerClass ("owner","0599");
    	OwnerClass o2=new OwnerClass ("owner2","0599");
    	HousingAdvertisement ad1 = new HousingAdvertisement("Title 1", "Description 1","Nablus",o1);
        HousingAdvertisement ad2 = new HousingAdvertisement("Title 2", "Description 2","Ramallah",o2);
        ad1.setApproved(true);
        ad2.setApproved(true);
        housingAdvertisements.add(ad1);
        housingAdvertisements.add(ad2);
        Units unit1 = new Units("101", 2, 1, true,200,false);
        Units unit2 = new Units("102", 3, 2, false,700,false);
        ad2.addUnit(unit1);
        ad1.addUnit(unit2);
        Reservation reservation1 = new Reservation("John Doe", "john.doe@example.com", "2023-07-01", "2023-07-08");
        Reservation reservation2 = new Reservation("Jane Smith", "jane.smith@example.com", "2023-07-05", "2023-07-12");
        unit1.addReservation(reservation1);
        unit1.addReservation(reservation2);
        
    }

    public void manageHousingAdvertisements() {
    	Scanner scanner = new Scanner(System.in);

	    System.out.println("Housing Advertisements:");
	    for (int i = 0; i < housingAdvertisements.size(); i++) {
	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
	        System.out.println((i + 1) + ". " + advertisement.getTitle() + " - " + advertisement.getDescription());
	        System.out.println("   Approved: " + (advertisement.isApproved() ? "Yes" : "No"));
	    }

	    System.out.print("Enter the advertisement number to accept/reject (0 to cancel): ");
	    int choice = scanner.nextInt();
	    scanner.nextLine(); // Consume the newline character

	    if (choice >= 1 && choice <= housingAdvertisements.size()) {
	        HousingAdvertisement selectedAdvertisement = housingAdvertisements.get(choice - 1);
	        System.out.print("Do you want to accept or reject the advertisement? (A/R): ");
	        String decision = scanner.nextLine().toUpperCase();

	        if (decision.equals("A")) {
	            selectedAdvertisement.setApproved(true);
	            System.out.println("Advertisement accepted.");
	        } else if (decision.equals("R")) {
	            selectedAdvertisement.setApproved(false);
	            System.out.println("Advertisement rejected.");
	        } else {
	            System.out.println("Invalid decision. Returning to the admin dashboard.");
	        }
	    } else if (choice == 0) {
	        System.out.println("Returning to the admin dashboard.");
	    } else {
	        System.out.println("Invalid advertisement number. Returning to the admin dashboard.");
	    }
    }
    
    public void viewReservations() {
    	for (int i = 0; i < housingAdvertisements.size(); i++) {
	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
	    	ArrayList<Units> units= new ArrayList<>();
	        for (int j = 0; j < units.size(); i++) {
	        	ArrayList<Reservation> reservations = units.get(j).getReservations();
		        if (reservations.isEmpty()) {
		            System.out.println("No reservations found for the housing advertisement.");
		        } else {
		            System.out.println("Reservations for the housing advertisement: " + advertisement.getTitle());
		            for (Reservation reservation : reservations) {
		            	
		                System.out.println("Tenant: " + reservation.getTenantName());
		                System.out.println("Contact Information: " + reservation.getContactInformation());
		                System.out.println("Check-in Date: " + reservation.getCheckInDate());
		                System.out.println("Check-out Date: " + reservation.getCheckOutDate());
		                System.out.println();
		            }
		        }
	        }
	    }
    }
    
    public void addHousingUnit() {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the unit number: ");
        String unitNumber = scanner.nextLine();

        System.out.print("Enter the number of bedrooms: ");
        int bedrooms = scanner.nextInt();

        System.out.print("Enter the number of bathrooms: ");
        int bathrooms = scanner.nextInt();
        
        System.out.print("Does the unit have a balcony? (true/false): ");
        boolean hasBalcony = scanner.nextBoolean();

        System.out.print("Enter the monthlyRait: ");
        int monthlyRait = scanner.nextInt();
        
        System.out.print("Is the new monthly rent inclusive of utilities? (true/false): ");
        boolean newInclusiveOfUtilities = scanner.nextBoolean();
        
        System.out.print("Do you want to add this unit to an existing housing? (yes/no): ");
        String addUnitOption = scanner.nextLine().toLowerCase();
        scanner.nextLine(); // Consume the newline character

        if (addUnitOption.equals(addUnitOption)) {
            // Add unit to an existing housing
            System.out.print("Enter the title of the existing housing advertisement: ");
            String existingTitle = scanner.nextLine();
            


            HousingAdvertisement existingAdvertisement = null;
            for (HousingAdvertisement advertisement : housingAdvertisements) {
                if (advertisement.getTitle().equalsIgnoreCase(existingTitle)) {
                    existingAdvertisement = advertisement;
                    break;
                }
            }

            if (existingAdvertisement != null) {
            	// edit so i can add the unit here 
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, hasBalcony,monthlyRait,newInclusiveOfUtilities);
                existingAdvertisement.addUnit(newUnit);
                System.out.println("Unit added to the existing housing successfully!");
            } else {
                System.out.println("Housing advertisement not found. Adding a new housing instead.");
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, hasBalcony,monthlyRait,newInclusiveOfUtilities);
                addNewHousing().addUnit(newUnit);
            }
        } else { 
            // Add a completely new housing
        	Units newUnit = new Units(unitNumber, bedrooms, bathrooms, hasBalcony,monthlyRait,newInclusiveOfUtilities);
            addNewHousing().addUnit(newUnit); 
            
        }
        

    }
    private HousingAdvertisement addNewHousing() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the housing advertisement: ");
        String title = scanner.nextLine();

        System.out.print("Enter the description of the housing advertisement: ");
        String description = scanner.nextLine();

        System.out.print("Enter the location of the housing: ");
        String location = scanner.nextLine();

        System.out.print("Enter the contact information for the housing advertisement: ");
        String contactInformation = scanner.nextLine();

        System.out.print("Enter the owner's name: ");
        String ownerName = scanner.nextLine();

        System.out.print("Enter the owner's contact information: ");
        String ownerContactInfo = scanner.nextLine();

        OwnerClass owner = new OwnerClass(ownerName, ownerContactInfo);

        HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location, owner);
        housingAdvertisements.add(newAdvertisement);
        System.out.println("New housing added successfully!");

        return newAdvertisement;
    }
    
    //The Function Of Modify The Housing Data
    
    public void modifyHousingData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the housing advertisement you want to modify: ");
        String title = scanner.nextLine();

        HousingAdvertisement selectedAdvertisement = null;

        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getTitle().equalsIgnoreCase(title)) {
                selectedAdvertisement = advertisement;
                break;
            }
        }

        if (selectedAdvertisement != null) {
            System.out.println("Housing Advertisement Details:");
            System.out.println("Title: " + selectedAdvertisement.getTitle());
            System.out.println("Description: " + selectedAdvertisement.getDescription());
            System.out.println("Location: " + selectedAdvertisement.getLocation());
            System.out.println("Owner Name: " + selectedAdvertisement.getOwner().getName());
            System.out.println("Contact Information: " + selectedAdvertisement.getOwner().getContactInformation());

            System.out.println("Select the field you want to modify:");
            System.out.println("1. Title");
            System.out.println("2. Description");
            System.out.println("3. Location");
            System.out.println("4. Owner Name");            
            System.out.println("5. Contact Information");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the new title: ");
                    String newTitle = scanner.nextLine();
                    selectedAdvertisement.setTitle(newTitle);
                    break;
                case 2:
                    System.out.print("Enter the new description: ");
                    String newDescription = scanner.nextLine();
                    selectedAdvertisement.setDescription(newDescription);
                    break;
                case 3:
                    System.out.print("Enter the new owner location: ");
                    String newOwnerLocation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setOwnerLocation(newOwnerLocation);
                    break;
                case 4:
                    System.out.print("Enter the new owner Name: ");
                    String newOwnerName = scanner.nextLine();
                    selectedAdvertisement.getOwner().setName(newOwnerName);;
                    break;
                case 5:
                    System.out.print("Enter the new contact information: ");
                    String newContactInformation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setContactInformation(newContactInformation);
                    break;
                default:
                    System.out.println("Invalid choice. Returning to the admin dashboard.");
                    break;
            }
            System.out.println("Housing advertisement data modified successfully!");
        } else {
            System.out.println("Housing advertisement not found. Returning to the admin dashboard.");
        }
    }
    
    public void viewHousingDetailsByOwnerName(String ownerName) {
        boolean found = false;

        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getOwner().getName().equalsIgnoreCase(ownerName)) {
                System.out.println("Title: " + advertisement.getTitle());
                System.out.println("Description: " + advertisement.getDescription());
                System.out.println("Location: " + advertisement.getLocation());
                System.out.println("Owner: " + advertisement.getOwner().getName());
                System.out.println("Contact Information: " + advertisement.getOwner().getContactInformation());
                System.out.println("------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No housing advertisements found for owner: " + ownerName);
        }
    }

}
    
    

    
