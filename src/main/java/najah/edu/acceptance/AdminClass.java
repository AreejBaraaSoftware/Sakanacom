package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AdminClass {
	private static final Logger LOGGER = Logger.getLogger(furnitureClass.class.getName());
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
 	       LOGGER.log(Level.INFO,(i + 1) + ". " + advertisement.getTitle() + " - " + advertisement.getDescription());
 	      LOGGER.log(Level.INFO,"   Approved: " + (advertisement.isApproved() ? "Yes" : "No"));
 	    }

    }
    public static  void manageHousingAdvertisements() {
    	Scanner scanner = new Scanner(System.in);

    	 LOGGER.log(Level.INFO,"Housing Advertisements:");
	    for (int i = 0; i < housingAdvertisements.size(); i++) {
	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
	        LOGGER.log(Level.INFO,(i + 1) + ". " + advertisement.getTitle() + " - " + advertisement.getDescription());
	        LOGGER.log(Level.INFO,"   Approved: " + (advertisement.isApproved() ? "Yes" : "No"));
	    }

	    LOGGER.log(Level.INFO,"Enter the advertisement number to accept/reject (0 to cancel): ");
	    int choice = scanner.nextInt();
	    scanner.nextLine(); // Consume the newline character

	    if (choice >= 1 && choice <= housingAdvertisements.size()) {
	        HousingAdvertisement selectedAdvertisement = housingAdvertisements.get(choice - 1);
	        LOGGER.log(Level.INFO,"Do you want to accept or reject the advertisement? (A/R): ");
	        String decision = scanner.nextLine().toUpperCase();

	        if (decision.equals("A")) {
	        	
	        	state=true;
	            selectedAdvertisement.setApproved(true);
	            LOGGER.log(Level.INFO,"Advertisement accepted.");
	        } else if (decision.equals("R")) {
	        	
	        	state=true;
	            selectedAdvertisement.setApproved(false);
	            LOGGER.log(Level.INFO,"Advertisement rejected.");
	        } else {
	        	 LOGGER.log(Level.INFO,"Invalid decision. Returning to the admin dashboard.");
	        }
	    } else if (choice == 0) {
	    	 LOGGER.log(Level.INFO,"Returning to the admin dashboard.");
	    } else {
	    	 LOGGER.log(Level.INFO,"Invalid advertisement number. Returning to the admin dashboard.");
	    }
    }
    
    public void viewReservations() {
        for (int i = 0; i < housingAdvertisements.size(); i++) {
            HousingAdvertisement advertisement = housingAdvertisements.get(i);

            for (int j = 0; j < advertisement.getUnits().size(); j++) {
                ArrayList<Reservation> reservations = advertisement.getUnits().get(j).getReservations();
                if (reservations.isEmpty()) {
                	 LOGGER.log(Level.INFO,"No reservations found for the housing advertisement.");
                } else {
                	 LOGGER.log(Level.INFO,"Reservations for the housing advertisement: " + advertisement.getTitle());
                    for (Reservation reservation : reservations) {
                    	 LOGGER.log(Level.INFO,"Tenant: " + reservation.getTenantName());
                    	 LOGGER.log(Level.INFO,"Contact Information: " + reservation.getContactInformation());
                    	 LOGGER.log(Level.INFO,"Check-in Date: " + reservation.getCheckInDate());
                    	 LOGGER.log(Level.INFO,"Check-out Date: " + reservation.getCheckOutDate());
                    	 LOGGER.log(Level.INFO," ");
                    }
                }
            }
        }
    }
	public static ArrayList<Units> unit=new ArrayList <Units>();

    private int  price ;
    public void addHousingUnit() {
    	
        Scanner scanner = new Scanner(System.in);
        
        LOGGER.log(Level.INFO,"Enter the unit number: ");
        String unitNumber = scanner.nextLine();
        
        LOGGER.log(Level.INFO,"Enter the photo: ");
           String photo= scanner.nextLine();

           LOGGER.log(Level.INFO,"Enter the number of bedrooms: ");
        int bedrooms = scanner.nextInt();

        LOGGER.log(Level.INFO,"Enter the number of bathrooms: ");
        int bathrooms = scanner.nextInt();
        
        LOGGER.log(Level.INFO,"Does the unit available ? (true/false): ");
        boolean available = scanner.nextBoolean();

        LOGGER.log(Level.INFO,"monthlyRait:is it inclusive of electricity and water or not? (true/false):");
        boolean monthlyRait = scanner.nextBoolean();
        
        
        LOGGER.log(Level.INFO,"Do you want to add this unit to an existing housing? (true/false): ");
        boolean addUnitOption = scanner.nextBoolean(); 
        LOGGER.log(Level.INFO," ");

        if (addUnitOption==true) {
        	 LOGGER.log(Level.INFO,"------------------------------------------------------ ");
           
        	 LOGGER.log(Level.INFO,"Enter the title of the existing housing advertisement: ");
            String existingTitle =scanner.next();
            
            LOGGER.log(Level.INFO,"Enter the price of the home: ");
            price = scanner.nextInt();

            HousingAdvertisement existingAdvertisement = null;
            for (HousingAdvertisement advertisement : housingAdvertisements) {
                if (advertisement.getTitle().equalsIgnoreCase(existingTitle)) {
                    existingAdvertisement = advertisement;
                    break;
                }
            }

            if (existingAdvertisement != null) {
            	 
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
                existingAdvertisement.setApproved(true);
                existingAdvertisement.addUnit(newUnit);
                LOGGER.log(Level.INFO,"Unit added to the existing housing successfully!");
               
            } else {
                System.out.println("Housing advertisement not found. Adding a new housing instead.");
                Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
                addNewHousing().addUnit(newUnit);
            }
        } else { 
        	

			
        	Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
            addNewHousing().addUnit(newUnit); 
            
            
        }
        addflage=true;

    }
   
   
    public  HousingAdvertisement addNewHousing() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the title of the housing advertisement: ");
        String title = scanner.nextLine();

        LOGGER.log(Level.INFO,"Enter the description of the housing advertisement: ");
        String description = scanner.nextLine();

        LOGGER.log(Level.INFO,"Enter the location of the housing: ");
        String location = scanner.nextLine();

        LOGGER.log(Level.INFO,"Enter the contact information for the housing advertisement: ");
        String contactInformation = scanner.nextLine();

        

        OwnerClass owner = new OwnerClass("Alaa", "05998455");

        HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location, owner);
        newAdvertisement.setApproved(true);
        housingAdvertisements.add(newAdvertisement);
        LOGGER.log(Level.INFO,"New housing added successfully!");
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
            
        	 LOGGER.log(Level.INFO,"Title: " + advertisement.getTitle());
        	 LOGGER.log(Level.INFO,"Description: " + advertisement.getDescription());
        	 LOGGER.log(Level.INFO,"Location: " + advertisement.getLocation());
        	 LOGGER.log(Level.INFO,"Owner: " + advertisement.getOwner().getName());
        	 LOGGER.log(Level.INFO,"Contact Information: " + advertisement.getOwner().getContactInformation());
        	 LOGGER.log(Level.INFO,"------------------------");
           
        }
       showdetail=true;
        
        
        
    }
    public void viewhouse1() {
    	
       for (HousingAdvertisement advertisement : housingAdvertisements) {
          
    	   LOGGER.log(Level.INFO,"Title: " + advertisement.getTitle());
    	   LOGGER.log(Level.INFO,"Description: " + advertisement.getDescription());
    	   LOGGER.log(Level.INFO,"Location: " + advertisement.getLocation());
    	   LOGGER.log(Level.INFO,"Owner: " + advertisement.getOwner().getName());
    	   LOGGER.log(Level.INFO,"Contact Information: " + advertisement.getOwner().getContactInformation());
    	   LOGGER.log(Level.INFO,"------------------------");
              
           }
          showdetail=true;
     
    }
   
    public static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	 public static OwnerClass o2=new OwnerClass ("momen","05998979");
   
	 public void modifyHousingData() {
    	
        Scanner scanner = new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the title of the housing advertisement you want to modify: ");
        String title = scanner.nextLine();
         
       
        HousingAdvertisement selectedAdvertisement = null;
      
        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getTitle().equalsIgnoreCase(title)) {
                selectedAdvertisement = advertisement;
                break;
            }
        }

        if (selectedAdvertisement != null) {
        	 LOGGER.log(Level.INFO,"Housing Advertisement Details:");
        	 LOGGER.log(Level.INFO,"Title: " + selectedAdvertisement.getTitle());
        	 LOGGER.log(Level.INFO,"Description: " + selectedAdvertisement.getDescription());
        	 LOGGER.log(Level.INFO,"Contact Information: " + selectedAdvertisement.getOwner().getContactInformation());

        	 LOGGER.log(Level.INFO,"Select the field you want to modify:");
        	 LOGGER.log(Level.INFO,"1. Title");
        	 LOGGER.log(Level.INFO,"2. Description");
        	 LOGGER.log(Level.INFO,"5. Contact Information");

        	 LOGGER.log(Level.INFO,"Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	 LOGGER.log(Level.INFO,"Enter the new title: ");
                    String newTitle = scanner.nextLine();
                    selectedAdvertisement.setTitle(newTitle);
                    break;
                case 2:
                	 LOGGER.log(Level.INFO,"Enter the new description: ");
                    String newDescription = scanner.nextLine();
                    selectedAdvertisement.setDescription(newDescription);
                    break;
                case 3:
                	 LOGGER.log(Level.INFO,"Enter the new owner location: ");
                    String newOwnerLocation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setOwnerLocation(newOwnerLocation);
                    break;
                case 4:
                	 LOGGER.log(Level.INFO,"Enter the new owner Name: ");
                    String newOwnerName = scanner.nextLine();
                    selectedAdvertisement.getOwner().setName(newOwnerName);;
                    break;
                case 5:
                	 LOGGER.log(Level.INFO,"Enter the new contact information: ");
                    String newContactInformation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setContactInformation(newContactInformation);
                    break;
                default:
                	 LOGGER.log(Level.INFO,"Invalid choice. Returning to the admin dashboard.");
                    break;
            }
            LOGGER.log(Level.INFO,"Housing advertisement data modified successfully!");
            modifedflage=true;
        } else {
        	 LOGGER.log(Level.INFO,"Housing advertisement not found. Returning to the admin dashboard.");
        }
    }
    
    public void viewHousingDetailsByOwnerName(String ownerName) {
        boolean found = false;

        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getOwner().getName().equalsIgnoreCase(ownerName)) {
            	 LOGGER.log(Level.INFO,"Title: " + advertisement.getTitle());
            	 LOGGER.log(Level.INFO,"Description: " + advertisement.getDescription());
            	 LOGGER.log(Level.INFO,"Location: " + advertisement.getLocation());
            	 LOGGER.log(Level.INFO,"Owner: " + advertisement.getOwner().getName());
            	 LOGGER.log(Level.INFO,"Contact Information: " + advertisement.getOwner().getContactInformation());
            	 LOGGER.log(Level.INFO,"------------------------");
                found = true;
            }
           showdetail=true;
        }

        if (!found) {
        	 LOGGER.log(Level.INFO,"No housing advertisements found for owner: " + ownerName);
        }
    }
	public static Boolean getShowdetail() {
		return showdetail;
	}
	public static void setShowdetail(Boolean showdetail) {
		AdminClass.showdetail = showdetail;
	}
    

	
    
} 

    
