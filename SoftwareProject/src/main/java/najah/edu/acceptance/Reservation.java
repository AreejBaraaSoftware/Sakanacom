package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Reservation {
	 private static final Logger LOGGER = Logger.getLogger(Reservation.class.getName());
	public static ArrayList<Reservation> Reservelist;
	 private  String tenantName;
	 private  int pay;
	 private int getPay() {
		return pay;
	
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	private  String contactInformation;
	private  String checkInDate;
	private  String checkOutDate;
	private  String unitnumber;
	private   static boolean  revflage =false ;
   
    private   static boolean infoflage=false;
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
private   static boolean APPROVED=false ;
    
    public Reservation() {
	super();
}
 static Units n=new Units();
 static AdminClass admin=new AdminClass();
	public static boolean isApproved() {
	return APPROVED;
}

public static void setApproved(boolean approved) {
	APPROVED = approved;
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
    
    private static final List<Units> unit=new ArrayList <Units>();
    private static final List<Reservation> r1=new ArrayList <Reservation>();
    public static void ReverSehome() {
    	n.viewunit();
    	 Scanner scanner = new Scanner(System.in);
    	 LOGGER.log(Level.INFO,"Enter number unit to reseve : ");
         String number = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter name : ");
         String name = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter checkInDate : ");
         String datein = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter checkOutDate : ");
         String dateout = scanner.nextLine();
         LOGGER.log(Level.INFO,"Enter information phone number or any thing to connect  : ");
         String phone = scanner.nextLine();
         LOGGER.log(Level.INFO,"pay the rent : ");
        int pay = scanner.nextInt();
    
  			r1.add(new Reservation (name,phone,datein,dateout,number,pay));
  			revflage=true;
  		 
         
    }
    
    private   static boolean found = false;
    public void viewRevesation() {
    	
          
        for (Reservation Rev : r1 ) {
        	LOGGER.log(Level.INFO,"------------------------------------------");
        	LOGGER.log(Level.INFO,"The date of entry into the unit : {0}",Rev.getCheckInDate()+"");
        	
        	
        	LOGGER.log(Level.INFO,"The date of leaving the residence:{0} ",Rev.getCheckOutDate()+"");
        	
        	
        	LOGGER.log(Level.INFO,"ContactInformation: {0}",Rev.getContactInformation()+"" );
        	
        	
        	LOGGER.log(Level.INFO,"Name:{0} ",Rev.getTenantName()+"" );
        	
        	
        	LOGGER.log(Level.INFO,"The number of the apartment that was rented:{0} ",Rev.getUnitnumber()+"" );
        	
        	
        	LOGGER.log(Level.INFO,"House rent was paid at a rate :{0}", Rev.getPay()+"");
		
        	
        	LOGGER.log(Level.INFO,"------------------------------------------");
                found = true;
            
        
        }

       
    }
    public void viewpersonaldataTenant() {
      
          
        for (Reservation Rev : r1 ) {
           
        	LOGGER.log(Level.INFO,"-----------------------------------------");
        	LOGGER.log(Level.INFO,"getContactInformation: {0}",Rev.getContactInformation()+" ");
		
        	
        	
        	LOGGER.log(Level.INFO,"TenantName:{0} ",Rev.getTenantName()+" ");
		
        	
        
              
        	LOGGER.log(Level.INFO,"----------------------------------------");
                found = true;
            infoflage=true;
        
        }

       
    }

	public String getUnitnumber() {
		return unitnumber;
	}

	
}
