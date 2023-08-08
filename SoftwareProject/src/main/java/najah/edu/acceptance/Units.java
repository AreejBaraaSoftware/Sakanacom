package najah.edu.acceptance;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;



public class Units {
	 private static final Logger LOGGER = Logger.getLogger(Units.class.getName());
	 private   static boolean 	availableflage=false;
	 private   static boolean monthlyflage=false;
	 private   static  String photounit;
 
 
    public int getPrice() {
	return price;
}

	public static Boolean getMonthlyflage() {
	return monthlyflage;
}

	public Units() {
		super();
	}
    public boolean isAvailable() {
		return available;
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

	

	

	public void setReservations(List<Reservation> reservations) {
		this.reservations = (ArrayList<Reservation>) reservations;
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
    private static ArrayList<Reservation> reservations;

    
  
    
    
    
   
    
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

   
   

    static List<Reservation> getReservations() {
        return reservations;
    }
   
    
    public boolean isMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(boolean monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	public static ArrayList<Units> unit=new ArrayList <Units>();
	 private   static boolean found = false;
	
    public void viewunit() {
        

        for (Units Unitlist : unit ) {
           
        	LOGGER.log(Level.INFO,"unitnumber: {0}",Unitlist.getUnitNumber()+" ");
        	
        	
        	LOGGER.log(Level.INFO,"bathrooms:{0} ",Unitlist.getBathrooms()+" ");
        	
        	LOGGER.log(Level.INFO,"bedroom:{0} " , Unitlist.getBedrooms()+" ");
        	
        	LOGGER.log(Level.INFO,"monthly:{0} " , Unitlist.isMonthlyRent()+" ");
        
        	LOGGER.log(Level.INFO,"price:{0} " , Unitlist.getPrice()+" ");
        	
            LOGGER.log(Level.INFO,  "------------------------");
                found = true;
            
        
        }

       
    }
    

       
   
   public static void availableornot() {
	   for (Units Unitlist : unit ) {
		   if(Unitlist.isAvailable()) {
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
		   if(Unitlist.isMonthlyRent()) {
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
   
   
  
	
   
   
   
   
    
}