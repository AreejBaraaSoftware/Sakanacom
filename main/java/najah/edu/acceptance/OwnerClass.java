package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;


public class OwnerClass {
	private String name;
    private String contactInformation;
    private String ownerLocation;
    private String password;
    private ArrayList<String> photos;
    
	
    public OwnerClass(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.password="newpass";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
}