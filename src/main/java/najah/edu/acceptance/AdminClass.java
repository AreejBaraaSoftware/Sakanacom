package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminClass {
	public static Boolean showdetail;
	public static Boolean addflage;
	public static Boolean getAddflage() {
		return addflage;
	}
	public static void setAddflage(Boolean addflage) {
		AdminClass.addflage = addflage;
	}

	public static Boolean state;
	public static Boolean modifedflage;
	public static Boolean getModifedflage() {
		return modifedflage;
	}
	public static void setModifedflage(Boolean modifedflage) {
		AdminClass.modifedflage = modifedflage;
	}

	public static boolean HOUSEADED;
	public static boolean isHOUSEADED() {
		return HOUSEADED;
	}
	public static void setHOUSEADED(boolean hOUSEADED) {
		HOUSEADED = hOUSEADED;
	}
	
	public static Boolean getState() {
		return state;
	}
	public static void setState(Boolean state) {
		AdminClass.state = state;
	}
	
	public static ArrayList<HousingAdvertisement> housingAdvertisements;
    public AdminClass() {
        housingAdvertisements = new ArrayList<HousingAdvertisement>();   
    }
    
    	
    public static  void viewmanagmenthouse() {
    	 for (int i = 0; i < housingAdvertisements.size(); i++) {
 	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
 	        System.out.println((i + 1) + ". " + advertisement.getTitle() + " - " + advertisement.getDescription());
 	        System.out.println("   Approved: " + (advertisement.isApproved() ? "Yes" : "No"));
 	    }

    }
    public static  void manageHousingAdvertisements() {
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
	        	
	        	state=true;
	            selectedAdvertisement.setApproved(true);
	            System.out.println("Advertisement accepted.");
	        } else if (decision.equals("R")) {
	        	
	        	state=true;
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

            for (int j = 0; j < advertisement.getUnits().size(); j++) {
                ArrayList<Reservation> reservations = advertisement.getUnits().get(j).getReservations();
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
	public static ArrayList<Units> unit=new ArrayList <Units>();

    private int  price ;
    public void addHousingUnit() {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the unit number: ");
        String unitNumber = scanner.nextLine();
        
         System.out.print("Enter the photo: ");
           String photo= scanner.nextLine();

        System.out.print("Enter the number of bedrooms: ");
        int bedrooms = scanner.nextInt();

        System.out.print("Enter the number of bathrooms: ");
        int bathrooms = scanner.nextInt();
        
        System.out.print("Does the unit available ? (true/false): ");
        boolean available = scanner.nextBoolean();

        System.out.print("monthlyRait:is it inclusive of electricity and water or not? (true/false):");
        boolean monthlyRait = scanner.nextBoolean();
        
        
        System.out.print("Do you want to add this unit to an existing housing? (true/false): ");
        boolean addUnitOption = scanner.nextBoolean(); 
        System.out.println(" ");

        if (addUnitOption==true) {
        	 System.out.println("------------------------------------------------------ ");
            // Add unit to an existing housing
            System.out.println("Enter the title of the existing housing advertisement: ");
            String existingTitle =scanner.next();
            
            System.out.println("Enter the price of the home: ");
            price = scanner.nextInt();

            HousingAdvertisement existingAdvertisement = null;
            for (HousingAdvertisement advertisement : housingAdvertisements) {
                if (advertisement.getTitle().equalsIgnoreCase(existingTitle)) {
                    existingAdvertisement = advertisement;
                    break;
                }
            }

            if (existingAdvertisement != null) {
            	// edit so i can add the unit here 
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
                existingAdvertisement.setApproved(true);
                existingAdvertisement.addUnit(newUnit);
                System.out.println("Unit added to the existing housing successfully!");
               
            } else {
                System.out.println("Housing advertisement not found. Adding a new housing instead.");
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
                addNewHousing().addUnit(newUnit);
            }
        } else { 
        	

			// Add a completely new housing
        	Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
            addNewHousing().addUnit(newUnit); 
            
            
        }
        addflage=true;

    }
   
   
    public  HousingAdvertisement addNewHousing() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the housing advertisement: ");
        String title = scanner.nextLine();

        System.out.print("Enter the description of the housing advertisement: ");
        String description = scanner.nextLine();

        System.out.print("Enter the location of the housing: ");
        String location = scanner.nextLine();

        System.out.print("Enter the contact information for the housing advertisement: ");
        String contactInformation = scanner.nextLine();

        

        OwnerClass owner = new OwnerClass("Alaa", "05998455");

        HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location, owner);
        newAdvertisement.setApproved(true);
        housingAdvertisements.add(newAdvertisement);
        System.out.println("New housing added successfully!");
        HOUSEADED=true;
        return newAdvertisement;
    }
   
    Main n=new Main();
    public void informationho() {
    	HousingAdvertisement ad1 = new HousingAdvertisement("Title 1", "Description 1","Nablus",o1);
        HousingAdvertisement ad2 = new HousingAdvertisement("Title 2", "Description 2","Ramallah",o2);
         
        ad1.setApproved(true);
        ad2.setApproved(true);
         
        housingAdvertisements.add(ad1);
        housingAdvertisements.add(ad2);
        
        
        for (HousingAdvertisement advertisement : housingAdvertisements) {
            
            System.out.println("Title: " + advertisement.getTitle());
            System.out.println("Description: " + advertisement.getDescription());
            System.out.println("Location: " + advertisement.getLocation());
            System.out.println("Owner: " + advertisement.getOwner().getName());
            System.out.println("Contact Information: " + advertisement.getOwner().getContactInformation());
            System.out.println("------------------------");
           
        }
       showdetail=true;
        
        
        
    }
    public void viewhouse1() {
    	
       for (HousingAdvertisement advertisement : housingAdvertisements) {
          
               System.out.println("Title: " + advertisement.getTitle());
               System.out.println("Description: " + advertisement.getDescription());
               System.out.println("Location: " + advertisement.getLocation());
               System.out.println("Owner: " + advertisement.getOwner().getName());
               System.out.println("Contact Information: " + advertisement.getOwner().getContactInformation());
               System.out.println("------------------------");
              
           }
          showdetail=true;
     
    }
   // public static ArrayList<HousingAdvertisement> housing;
    public static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	 public static OwnerClass o2=new OwnerClass ("momen","05998979");
   
	 public void modifyHousingData() {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the housing advertisement you want to modify: ");
        String title = scanner.nextLine();
          // n.addTestData();
       
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
            System.out.println("Contact Information: " + selectedAdvertisement.getOwner().getContactInformation());

            System.out.println("Select the field you want to modify:");
            System.out.println("1. Title");
            System.out.println("2. Description");
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
            modifedflage=true;
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
           showdetail=true;
        }

        if (!found) {
            System.out.println("No housing advertisements found for owner: " + ownerName);
        }
    }
	public static Boolean getShowdetail() {
		return showdetail;
	}
	public static void setShowdetail(Boolean showdetail) {
		AdminClass.showdetail = showdetail;
	}
    

	
    
} 

    
