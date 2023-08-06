package najah.edu.acceptance;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
public class OwnerClass {
	 private static final Logger LOGGER = Logger.getLogger(OwnerClass.class.getName());
	  private   static boolean owneraddhouse =false ;
	
	  static boolean flagepicture=false;
	
	public static Boolean getFlagepicture() {
		return flagepicture;
	}

	public static void setFlagepicture(Boolean flagepicture) {
		OwnerClass.flagepicture = flagepicture;
	}

	public static Boolean getOwneraddhouse() {
		return owneraddhouse;
	}

	public static void setOwneraddhouse(Boolean owneraddhouse) {
		OwnerClass.owneraddhouse = owneraddhouse;
	}

	private String name;
    private String contactInformation;
    private String ownerLocation;
 
    
	
    public OwnerClass(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }
    
	public OwnerClass() {
		
	}

	public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getOwnerLocation() {
		return ownerLocation;
	}

	public void setOwnerLocation(String ownerLocation) {
		this.ownerLocation = ownerLocation;
	}
	
	public HousingAdvertisement owneraddNewHousing() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the title of the housing advertisement: ");
        String title = scanner.nextLine();

        LOGGER.log(Level.INFO,"Enter the description of the housing advertisement: ");
        String description = scanner.nextLine();

        LOGGER.log(Level.INFO,"Enter the location of the housing: ");
        String location = scanner.nextLine();

        HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location,this);
        
        newAdvertisement.setApproved(false);
        
        AdminClass.housingAdvertisements.add(newAdvertisement);
        LOGGER.log(Level.INFO,"New housing added successfully!");
          owneraddhouse=true;

        return newAdvertisement;
    }
	 static Units u=new Units();
	  private static final List<Units> unit=new ArrayList <Units>();
	
}
