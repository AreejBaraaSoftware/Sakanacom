package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AdminClass {
	private static final Logger LOGGER = Logger.getLogger(AdminClass.class.getName());
	 static final String DASH = " -------------------------------------------------";

	 private   static boolean showdetail = false;
	 
	 private static boolean addflage=false;
	

	 public static boolean isAddflage() {
		return addflage;
	}
	

	private   static boolean state=false;
	 private   static boolean modifedflage=false;
	public static Boolean getModifedflage() {
		return modifedflage;
	}

	
	private   static boolean add;
	public static boolean isHOUSEADED() {
		return add;
	}
	
	
	public static Boolean getState() {
		return state;
	}
	
	 static List<HousingAdvertisement> housingAdvertisements;

    public AdminClass() {
     housingAdvertisements = new ArrayList<HousingAdvertisement>(); 
    	
    }
    
    	
    public static  void viewmanagmenthouse() {
    	 for (int i = 0; i < housingAdvertisements.size(); i++) {
 	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
 	       LOGGER.log(Level.INFO," {0} ", (i + 1));
	       
	        LOGGER.log(Level.INFO, advertisement.getTitle());
	      
	        LOGGER.log(Level.INFO,  advertisement.getDescription());
	        LOGGER.log(Level.INFO,"   Approved: " );
	        LOGGER.log(Level.INFO,(advertisement.isApproved() ? "Yes" : "No"));
 	    }

    }
    public static  void manageHousingAdvertisements() {
    	Scanner scanner = new Scanner(System.in);

    	 LOGGER.log(Level.INFO,"Housing Advertisements:");
	    for (int i = 0; i < housingAdvertisements.size(); i++) {
	        HousingAdvertisement advertisement = housingAdvertisements.get(i);
	        LOGGER.log(Level.INFO," {0} " ,(i + 1));
	      
	        LOGGER.log(Level.INFO, advertisement.getTitle());
	       
	        LOGGER.log(Level.INFO,  advertisement.getDescription());
	        LOGGER.log(Level.INFO,"   Approved: " );
	        LOGGER.log(Level.INFO,(advertisement.isApproved() ? "Yes" : "No"));
	    }

	    LOGGER.log(Level.INFO,"Enter the advertisement number to accept/reject (0 to cancel): ");
	    int choice = scanner.nextInt();
	    scanner.nextLine(); 

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
	       
    }
    
	    }
    }
    private static ArrayList<Units> unit=new ArrayList <Units>();

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
        
        
        LOGGER.log(Level.INFO,"Do you want to add this unit ? (true): ");
        boolean addUnitOption = scanner.nextBoolean(); 
        LOGGER.log(Level.INFO, " ");

        if (addUnitOption==true) {
        	 LOGGER.log(Level.INFO,"------------------------------------------------------ ");
         
            
            LOGGER.log(Level.INFO,"Enter the price of the home: ");
            price = scanner.nextInt();

         HousingAdvertisement existingAdvertisement = null;
            

            if (existingAdvertisement == null) {
            	
            
                 Units newUnit = new Units(unitNumber, bedrooms, bathrooms, available,monthlyRait,photo,price);
                 addNewHousing().addUnit(newUnit);
              
               
            }
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

    

    

    OwnerClass owner = new OwnerClass("Alaa", "05998455");

    HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location, owner);
    newAdvertisement.setApproved(true);
    housingAdvertisements.add(newAdvertisement);
    LOGGER.log(Level.INFO,"New housing added successfully!");
    add=true;
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
            
        	 LOGGER.log(Level.INFO,"Title:{0} " , advertisement.getTitle()+" ");
        	 LOGGER.log(Level.INFO,"Description:{0} " , advertisement.getDescription()+" ");
        	 LOGGER.log(Level.INFO,"Location:{0} " , advertisement.getLocation()+" ");
        	 LOGGER.log(Level.INFO,"Owner:{0} " , advertisement.getOwner().getName()+" ");
        	 LOGGER.log(Level.INFO,"Contact Information: {0}" , advertisement.getOwner().getContactInformation()+" ");
        	 LOGGER.log(Level.INFO,DASH);
           
        }
       showdetail=true;
        
        
        
    }
  
   
     static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	 static OwnerClass o2=new OwnerClass ("momen","05998979");
   
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
        	 LOGGER.log(Level.INFO,"Title: {0}" , selectedAdvertisement.getTitle()+" ");
        	 LOGGER.log(Level.INFO,"Description:{0} " , selectedAdvertisement.getDescription()+" ");
        	 LOGGER.log(Level.INFO,"Contact Information: {0}" , selectedAdvertisement.getOwner().getContactInformation()+" ");

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
                	 LOGGER.log(Level.INFO,"Enter the new contact information: ");
                    String newContactInformation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setContactInformation(newContactInformation);
                    break;
               
            }
            LOGGER.log(Level.INFO,"Housing advertisement data modified successfully!");
            modifedflage=true;
        } 
    }
    
    public void viewHousingDetailsByOwnerName(String ownerName) {
        boolean found = false;

        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getOwner().getName().equalsIgnoreCase(ownerName)) {
            	 LOGGER.log(Level.INFO,"Title: {0}" , advertisement.getTitle()+" ");
            	 LOGGER.log(Level.INFO,"Description:{0} " , advertisement.getDescription()+" ");
            	 LOGGER.log(Level.INFO,"Location:{0} " , advertisement.getLocation()+" ");
            	 LOGGER.log(Level.INFO,"Owner: {0}" , advertisement.getOwner().getName()+" ");
            	 LOGGER.log(Level.INFO,"Contact Information:{0} " , advertisement.getOwner().getContactInformation()+" ");
            	 LOGGER.log(Level.INFO,DASH);
                found = true;
            }
           showdetail=true;
        }

      
    }
	public static Boolean getShowdetail() {
		return showdetail;
	}
	

	
    
} 

    
