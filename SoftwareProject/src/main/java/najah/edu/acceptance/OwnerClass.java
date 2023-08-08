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
	
	
	 static Units u=new Units();
	  private static final List<Units> unit=new ArrayList <Units>();
	
}