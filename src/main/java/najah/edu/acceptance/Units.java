package najah.edu.acceptance;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Scanner;


public class Units {
	 private static final Logger LOGGER = Logger.getLogger(Units.class.getName());
 public static Boolean 	availableflage;
 public static Boolean monthlyflage;
 public static String photounit;
 
 
    public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	public static String getPhotounit() {
	return photounit;
}
public static void setPhotounit(String photounit) {
	Units.photounit = photounit;
}
	public static Boolean getMonthlyflage() {
	return monthlyflage;
}
public static void setMonthlyflage(Boolean monthlyflage) {
	Units.monthlyflage = monthlyflage;
}
	public Units() {
		super();
	}
    public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	private boolean available;
	private String unitNumber;
    private int bedrooms;
    private int price;
    private int bathrooms;
    private boolean approved1;
    public boolean isApproved1() {
		return approved1;
	}

	public void setApproved1(boolean approved1) {
		this.approved1 = approved1;
	}

	public boolean isHasBalcony() {
		return hasBalcony;
	}

	public void setInclusiveOfUtilities(boolean inclusiveOfUtilities) {
		this.inclusiveOfUtilities = inclusiveOfUtilities;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	public static Boolean getAvailableflage() {
		return availableflage;
	}
	public static void setAvailableflage(Boolean availableflage) {
		Units.availableflage = availableflage;
	}
	private boolean hasBalcony;
    private boolean monthlyRent;
    private boolean inclusiveOfUtilities;
    private ArrayList<Reservation> reservations;

    
    public Units( String unitNumber,String photounit) {
    	this.unitNumber=unitNumber;
    	this.photounit=photounit;
    }
    
    
    
    public Units(String unitNumber, int bedrooms, int bathrooms, boolean available,boolean monthlyRent) {
        this.unitNumber = unitNumber;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.available = available;
        this.monthlyRent=monthlyRent;
        this.reservations = new ArrayList<Reservation>();
    }
    
    public Units(String unitNumber, int bedrooms, int bathrooms, boolean available,boolean monthlyRent,String photounit,int price ) {
        this.unitNumber = unitNumber;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.available = available;
        this.monthlyRent=monthlyRent;
        this.photounit=photounit;
        this.price=price;
        this.reservations = new ArrayList<Reservation>();
    }
    // Getters and setters for Unit properties
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean hasBalcony() { 
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
    public boolean isInclusiveOfUtilities() {
        return inclusiveOfUtilities;
    }

    public void setinclusiveOfUtilities(boolean inclusiveOfUtilities) {
        this.inclusiveOfUtilities = inclusiveOfUtilities;
    }

	
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    public static void unitavailabele() {
   	 
    }
    
    public boolean isMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(boolean monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	public static ArrayList<Units> unit=new ArrayList <Units>();
    public void viewunit() {
        boolean found = false;

        for (Units Unitlist : unit ) {
           
        	LOGGER.log(Level.INFO,"unitnumber: " + Unitlist.getUnitNumber());
        	LOGGER.log(Level.INFO,"bathrooms: " + Unitlist.getBathrooms());
        	LOGGER.log(Level.INFO,"bedroom: " + Unitlist.getBedrooms());
        	LOGGER.log(Level.INFO,"monthly: " + Unitlist.isMonthlyRent());
        	LOGGER.log(Level.INFO,"price: " + Unitlist.getPrice());
             
            	LOGGER.log(Level.INFO,  "------------------------");
                found = true;
            
        
        }

       
    }
    public void viewunitphoto() {
        boolean found = false;

        for (Units Unitlist : unit ) {
        	LOGGER.log(Level.INFO, "unitnumber:"+Unitlist.getUnitNumber());
        
        	LOGGER.log(Level.INFO, "photo:"+Unitlist.getPhotounit());
            
                
               
              
        	LOGGER.log(Level.INFO,  "------------------------");
                found = true;
            
        
        }

       
    }
   public static void availableornot() {
	   for (Units Unitlist : unit ) {
		   if(Unitlist.isAvailable()==true) {
			   LOGGER.log(Level.INFO,Unitlist.getUnitNumber());
			   LOGGER.log(Level.INFO," yes available");
			   availableflage=true;
		   }
		   else {
			   LOGGER.log(Level.INFO,Unitlist.getUnitNumber());
			   LOGGER.log(Level.INFO," Not available"); 
		   }
	   }
	   
   }
    
   public static void informationaboutmonthlyrent() {
	   for (Units Unitlist : unit ) {
		   if(Unitlist.isMonthlyRent()==true) {
			   LOGGER.log(Level.INFO,Unitlist.getUnitNumber());
			   LOGGER.log(Level.INFO,"yes inclusive of electricity and water  ");
			  monthlyflage=true;
		   }
		   else {
			   LOGGER.log(Level.INFO,Unitlist.getUnitNumber());
			   LOGGER.log(Level.INFO,"no inclusive of electricity and water "); 
		   }
	   }
   }
   
   
   public static Boolean flagepicture;
	
	public static Boolean getFlagepicture() {
		return flagepicture;
	}

	public static void setFlagepicture(Boolean flagepicture) {
		OwnerClass.flagepicture = flagepicture;
	}
   
   
	
	
   public static void addphoto() {
	   Units unit1 = new Units("101","");
       Units unit2 = new Units("102","");
    
       unit.add(unit1);
       unit.add(unit2);
	  
		   Scanner scanner = new Scanner(System.in);
		   LOGGER.log(Level.INFO,"Enter the unit number: ");
	        String unitNumber = scanner.nextLine();
	        for ( int i=0;i<unit.size();i++) {
		   if(unit.get(i).getUnitNumber().equals(unitNumber)) {
			   LOGGER.log(Level.INFO,"Enter the photo: ");
		        String photo = scanner.nextLine();
		        unit.get(i).setPhotounit(photo);
		        flagepicture=true;
			   
		   }
	        }
	   
      
   }
	
	
	
	public static void viewphotounit() {
		
		 boolean found = false;

	        for (Units Unitlist : unit) {
	            
	        	LOGGER.log(Level.INFO,"numberunit: " + Unitlist.getUnitNumber());
	        	LOGGER.log(Level.INFO,"photo: " + Unitlist.getPhotounit());
	               
	                found = true;
	           
	           
	        }

	        if (!found) {
	        	LOGGER.log(Level.INFO,"Not found  Unit " );
	        }
	}
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
