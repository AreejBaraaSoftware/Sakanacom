package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;


public class OwnerClass {
	public static Boolean owneraddhouse ;
	public static Boolean flagepicture;
	
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
    private ArrayList<String> photos;
    
	
    public OwnerClass(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }
    
	public OwnerClass() {
		// TODO Auto-generated constructor stub
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

	public ArrayList<String> getPhotos() {
		return photos;
	}
	public void addPhoto(String photo) {
	    photos.add(photo);
	}

	public String getOwnerLocation() {
		return ownerLocation;
	}

	public void setOwnerLocation(String ownerLocation) {
		this.ownerLocation = ownerLocation;
	}
	
	public HousingAdvertisement owneraddNewHousing() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the housing advertisement: ");
        String title = scanner.nextLine();

        System.out.print("Enter the description of the housing advertisement: ");
        String description = scanner.nextLine();

        System.out.print("Enter the location of the housing: ");
        String location = scanner.nextLine();

        HousingAdvertisement newAdvertisement = new HousingAdvertisement(title, description, location,this);
        
        newAdvertisement.setApproved(false);
        
        AdminClass.housingAdvertisements.add(newAdvertisement);
        System.out.println("New housing added successfully!");
       owneraddhouse=true;

        return newAdvertisement;
    }
	 public static Units u=new Units();
	public static ArrayList<Units> unit=new ArrayList <Units>();
	
}