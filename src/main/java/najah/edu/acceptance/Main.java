package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;



public class Main {
	
	 private   static boolean exitFlage=false ;
	
	
	
	 
	 public static boolean isExitFlage() {
		return exitFlage;
	}
	public static void setExitFlage(boolean exitFlage) {
		Main.exitFlage = exitFlage;
	}
	static AdminClass admin = new AdminClass();
	 static OwnerClass o1=new OwnerClass ("Alaa","059978789");
	  static OwnerClass o2=new OwnerClass ("momen","05998979");
      static Units u=new Units();
	   static User loggedInUser;
	   ArrayList<Reservation> Reservelist;
	   private static final List<User> users = new ArrayList<User>();
	
   
   static   Reservation Rsevev=new Reservation();
    public static void  addTestData() {
    	HousingAdvertisement ad1 = new HousingAdvertisement("Title 1", "Description 1","Nablus",o1);
        HousingAdvertisement ad2 = new HousingAdvertisement("Title 2", "Description 2","Ramallah",o2);
        ad1.setApproved(true);
        ad2.setApproved(true);
        admin.housingAdvertisements.add(ad1);
        admin.housingAdvertisements.add(ad2);     
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
	
	}
}