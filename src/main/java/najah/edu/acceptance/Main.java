package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;
import najah.edu.acceptance.AdminClass;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
	 private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	public static  boolean adminflag=false;
	public static  boolean userflage=false;
	public static  boolean Exitflage=false;
	public static  boolean ownerflage=false;
	public static boolean isExitflage() {
		return Exitflage;
	}
	public static void setExitflage(boolean exitflage) {
		Exitflage = exitflage;
	}
	public static  boolean tenantflage=false;
	 public static AdminClass admin = new AdminClass();
	 public static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	 public static OwnerClass o2=new OwnerClass ("momen","05998979");
     public static Units u=new Units();
	public static User loggedInUser;
	public static ArrayList<User> users = new ArrayList<User>();
	
    public static void userlogin () {
    	ArrayList<User> users = new ArrayList<User>();
    	users.add(new User("Baraa", "T***", "tenant")); 
	    users.add(new User("Areej", "A***", "admin")); 
	    users.add(new User("Alaa", "O***", "owner"));   	
    }
    public static   Reservation R1=new Reservation();
    public static void  addTestData() {
    	HousingAdvertisement ad1 = new HousingAdvertisement("Title 1", "Description 1","Nablus",o1);
        HousingAdvertisement ad2 = new HousingAdvertisement("Title 2", "Description 2","Ramallah",o2);
        ad1.setApproved(true);
        ad2.setApproved(true);
        admin.housingAdvertisements.add(ad1);
        admin.housingAdvertisements.add(ad2);     
    }
    public static void  addTestDataRes() {
    Reservation reservation1 = new Reservation("John Doe", "john.doe@example.com", "2023-07-01", "2023-07-08");
    Reservation reservation2 = new Reservation("Jane Smith", "jane.smith@example.com", "2023-07-05", "2023-07-12");
    Reservation.setApproved(true);
    Reservation .setApproved(true);
   R1.Reservelist.add(reservation1);
   R1.Reservelist.add(reservation2);
    }
    public static void unitlist() {
    	Units unit1 = new Units("101", 2, 1, true,false,"photo1.txt",4000);
        Units unit2 = new Units("102", 3, 2, false,true,"photo2.txt",2000);
        unit1.setApproved1(true);
        unit2.setApproved1(true);
        u.unit.add(unit1);
        u.unit.add(unit2); 
    }
	public static void main(String[] args) {
		addTestData();
		userlogin();
	}
}
