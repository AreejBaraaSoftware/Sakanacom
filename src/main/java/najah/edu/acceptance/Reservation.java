package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Reservation {
	 private static final Logger LOGGER = Logger.getLogger(Reservation.class.getName());
	public static ArrayList<Reservation> Reservelist;
	 public  String tenantName;
	 public  int pay;
	 public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	public  String contactInformation;
	 public  String checkInDate;
	 public  String checkOutDate;
     public  String unitnumber;
   public static boolean  revflage;
   public static boolean infoflage;
   public static boolean isInfoflage() {
	return infoflage;
}

public static void setInfoflage(boolean infoflage) {
	Reservation.infoflage = infoflage;
}

public static boolean isRevflage() {
	return revflage;
}

public static void setRevflage(boolean revflage) {
	Reservation.revflage = revflage;
}

public Reservation(String tenantName, String contactInformation, String checkInDate, String checkOutDate,
			String unitnumber,int pay) {
		super();
		this.tenantName = tenantName;
		this.contactInformation = contactInformation;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.unitnumber = unitnumber;
		this.pay=pay;
	}
public static boolean Approved;
    
    public Reservation() {
	super();
}
public static Units n=new Units();
public static AdminClass admin=new AdminClass();
	public static boolean isApproved() {
	return Approved;
}

public static void setApproved(boolean approved) {
	Approved = approved;
}

	public Reservation(String tenantName, String contactInformation, String checkInDate, String checkOutDate) {
        this.tenantName = tenantName;
        this.contactInformation = contactInformation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) { 
        this.tenantName = tenantName;
    }

    public String getContactInformation() {
        return contactInformation; 
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    public static ArrayList<Units> unit=new ArrayList <Units>();
    public static ArrayList<Reservation> r1=new ArrayList <Reservation>();
    public static void Reversehome() {
    	n.viewunit();
    	 Scanner scanner = new Scanner(System.in);
    	 LOGGER.log(Level.INFO,"Enter number unit to reseve : ");
         String number = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter name : ");
         String name = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter checkInDate : ");
         String Datein = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter checkOutDate : ");
         String Dateout = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter information phone number or any thing to connect  : ");
         String phone = scanner.nextLine();
         LOGGER.log(Level.INFO,"pay the rent : ");
        int pay = scanner.nextInt();
    
  			r1.add(new Reservation (name,phone,Datein,Dateout,number,pay));
  			revflage=true;
  		 
         
    }
    
  
    public void viewRevesation() {
        boolean found = false;
          
        for (Reservation Rev : r1 ) {
        	LOGGER.log(Level.INFO,"------------------------------------------");
        	LOGGER.log(Level.INFO,"The date of entry into the unit : " + Rev.getCheckInDate());
        	LOGGER.log(Level.INFO,"The date of leaving the residence: " + Rev.getCheckOutDate());
        	LOGGER.log(Level.INFO,"ContactInformation: " + Rev.getContactInformation());
        	LOGGER.log(Level.INFO,"Name: " + Rev.getTenantName());
        	LOGGER.log(Level.INFO,"The number of the apartment that was rented: " + Rev.getUnitnumber());
        	LOGGER.log(Level.INFO,"House rent was paid at a rate : " + Rev.getPay());
              
        	LOGGER.log(Level.INFO,"------------------------------------------");
                found = true;
            
        
        }

       
    }
    public void viewpersonaldataTenant() {
        boolean found = false;
          
        for (Reservation Rev : r1 ) {
           
        	LOGGER.log(Level.INFO,"-----------------------------------------");
        	LOGGER.log(Level.INFO,"getContactInformation: " + Rev.getContactInformation());
        	LOGGER.log(Level.INFO,"TenantName: " + Rev.getTenantName());
              
              
        	LOGGER.log(Level.INFO,"----------------------------------------");
                found = true;
            infoflage=true;
        
        }

       
    }

	public String getUnitnumber() {
		return unitnumber;
	}

	public void setUnitnumber(String unitnumber) {
		this.unitnumber = unitnumber;
	} 

}

