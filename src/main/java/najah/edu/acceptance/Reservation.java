package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
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
    	 System.out.print("Enter number unit to reseve : ");
         String number = scanner.nextLine();
         System.out.print("Enter name : ");
         String name = scanner.nextLine();
         System.out.print("Enter checkInDate : ");
         String Datein = scanner.nextLine();
         System.out.print("Enter checkOutDate : ");
         String Dateout = scanner.nextLine();
         System.out.print("Enter information phone number or any thing to connect  : ");
         String phone = scanner.nextLine();
         System.out.print("pay the rent : ");
        int pay = scanner.nextInt();
       //  for (Units Unitlist : unit ) {
  		  // if(Unitlist.getUnitNumber().equals(number)) {
  			r1.add(new Reservation (name,phone,Datein,Dateout,number,pay));
  			revflage=true;
  		 
         
    }
    
   // public static ArrayList<Units> unit=new ArrayList <Units>();
    public void viewRevesation() {
        boolean found = false;
          
        for (Reservation Rev : r1 ) {
        	   System.out.println("------------------------------------------");
                System.out.println("The date of entry into the unit : " + Rev.getCheckInDate());
                System.out.println("The date of leaving the residence: " + Rev.getCheckOutDate());
                System.out.println("ContactInformation: " + Rev.getContactInformation());
                System.out.println("Name: " + Rev.getTenantName());
                System.out.println("The number of the apartment that was rented: " + Rev.getUnitnumber());
                System.out.println("House rent was paid at a rate : " + Rev.getPay());
               // System.out.println("Reservation: " + Unitlist.getReservations());
                System.out.println("------------------------------------------");
                found = true;
            
        
        }

       
    }
    public void viewpersonaldataTenant() {
        boolean found = false;
          
        for (Reservation Rev : r1 ) {
           
        	   System.out.println("-----------------------------------------");
                System.out.println("getContactInformation: " + Rev.getContactInformation());
                System.out.println("TenantName: " + Rev.getTenantName());
              
               // System.out.println("Reservation: " + Unitlist.getReservations());
                System.out.println("----------------------------------------");
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

