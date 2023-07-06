package najah.edu.acceptance;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyApp {
	static  login  log= new login();
	static ArrayList <login> users;
	private static Scanner inputadmin;
	private static Scanner inputowner ;
	
	private static Scanner inputtenants;
 public static void main(String[] args) {
		System.out.println("***************Welcome to the housing application****************\n");
	 login.init();
	 login.typeUser();
		int x=login.x;
		System.out.println(x);
		 log.setX(x);
		 if(log.isLoginadmin()==true){

			
		        System.out.println("welacome admin: "+login.user.get(x).getUsername());
		        System.out.println("\n");
		       //menu admin
		        Menuadmin();
			}
			else if (log.isLoginowner()==true) {
				
				
				System.out.println("welacome Owners: "+login. user.get(x).getUsername());
			    System.out.println("\n");
	            //menu
				MenuOwner();
			}
			else {
				
	            System.out.println("welacome to tenants: "+login.user.get(x).getUsername());
	            System.out.println("\n");
	            //menu
	           Menutenats();
			}
		} //main
		
 public static void Menuadmin() {
	  int flgeadmin=1;
	 inputadmin = new Scanner(System.in);
	 while(flgeadmin==1) {
     	   System.out.println("  **************Menu**************  \n ");
			System.out.println("1.requests for advertisement of housing and the ability to accept and reject it                     \n");
			System.out.println("2.Watching reservations via the system     \n");
			System.out.println("3.add and advertise housing units through the system                      \n");
			System.out.println("4.ability to completely modify the housing data     \n");
			System.out.println("5.logout       \n");
     int caseadmin=Integer.parseInt(inputadmin.nextLine());
     switch(caseadmin) {
     case 1:{
    	 
     }//case 1
     case 2:{
    	 
     }//case 2
     case 3:{
    	 
     }//case 3
     case 4:{
    	 
     }//case 4
     case 5:{
    	 flgeadmin =0;
    	 log.setLoginadmin(false);
    	 break;
     }//case 5
     }//switch
     	
 }//while
	if (flgeadmin==0) {
		// new object 
		login newlog=new login();
		System.out.println("***************Welcome to the housing application****************\n");
	 login.init();
	 login.typeUser();
		int x=login.x;
		System.out.println(x);
		 log.setX(x);
		 if(log.isLoginadmin()==true){

			
		        System.out.println("welacome admin: "+login.user.get(x).getUsername());
		        System.out.println("\n");
		       //menu admin
		        Menuadmin();
			}
			else if (log.isLoginowner()==true) {
				
				
				System.out.println("welacome Owners: "+login. user.get(x).getUsername());
			    System.out.println("\n");
	            //menu
				MenuOwner();
			}
			else {
				
	            System.out.println("welacome to tenants: "+login.user.get(x).getUsername());
	            System.out.println("\n");
	            //menu
	            Menutenats();
			}
	 
	 
	}
	 
	 
 } ///switch admin menu
  
 public static void MenuOwner() {
	 int x=login.x;
     int flgeowner=1;
		inputowner = new Scanner(System.in);

     while(flgeowner==1) {
     	System.out.println("****************Menu***************\n ");
     	    System.out.println("1.Add photos     \n");
			System.out.println("2.Residence location and information about him \n");
			System.out.println("3.Available services \n");
			System.out.println("4.The monthly rent (is it inclusive of electricity and water or not)                       \n");
			System.out.println("5.contact information                        \n");	
		    System.out.println("6.Dashboard owner control panel:                       \n");
		    System.out.println("7.logout");
			int caseowner=Integer.parseInt(inputowner.nextLine());
			switch(caseowner) {
			case 1:{
				
			}//case1
			case 2:{
				
			}//case2
			case 3:{
				
			}//case 3
			case 4:{
				
			}//case4
			case 5:{
				
			}//case5
			case 6:{
				
			}//case 6
			case 7:{
				flgeowner=0;
				log.setLoginowner(false);
				break;
			}
			}//switch
 }//while
     if (flgeowner==0) {
 		// new object 
 		login newlog=new login();
 		System.out.println("***************Welcome to the housing application****************\n");
 	  login.init();
 	  login.typeUser();
 		int y=login.x;
 		System.out.println(y);
 		 log.setX(y);
 		 if(log.isLoginadmin()==true){

 			
 		        System.out.println("welacome admin: "+login.user.get(y).getUsername());
 		       System.out.println("\n");
 		       
 		       //menu admin
 		       Menuadmin();
 			}
 			else if (log.isLoginowner()==true) {
 				
 				
 				System.out.println("welacome Owners: "+login. user.get(y).getUsername());
 			    System.out.println("\n");
 			    
 	            //menu
 				MenuOwner();
 			}
 			else {
 				
 	            System.out.println("welacome to tenants: "+login.user.get(y).getUsername());
 	           System.out.println("\n");
 	            //menu
 	           Menutenats();
 			}
 	 
 	 
 	}
 }//MenuOwner
 
 public static void Menutenats() {
	 int flagetenats=1;
		inputtenants = new Scanner(System.in);

        while(flagetenats==1) {
        	System.out.println("****************Menu***************\n ");
        	System.out.println("1.ability to view the available housing\n"); 
			System.out.println("2.ability to view pictures of housing and know their prices, location, and services available in them  \n");
			System.out.println("3.ability to book accommodation via the app\n");
			System.out.println("4.found about the people who live in it, such as ages and university majors\n");
			System.out.println("5.which the tenant can advertise his ownused furniture for sale\n");
			System.out.println("6.presence of a tenant control panel after booking that shows\n");
            System.out.println("7.logout\n");
            int casetenats=Integer.parseInt(inputtenants.nextLine());
			switch(casetenats) {
			case 1:{
			
			}
			case 2:{
				
			}
			case 3:{
				
			}
			case 4: {
				
			}
			case 5:{
				
			}
			case 6:{
				
			}
			case 7:{
				flagetenats=0;
				log.setLogintenants(false);
				break;
			}
			
			}//switch
        }//while
        
        if (flagetenats==0) {
     		// new object 
     		login newlog=new login();
     		System.out.println("***************Welcome to the housing application****************\n");
     	 login.init();
     	 login.typeUser();
     		int z=login.x;
     		System.out.println(z);
     		 log.setX(z);
     		 if(log.isLoginadmin()==true){

     			
     		        System.out.println("welacome admin: "+login.user.get(z).getUsername());
     		       //menu admin
     		        Menuadmin();
     			}
     			else if (log.isLoginowner()==true) {
     				
     				
     				System.out.println("welacome Owners: "+login. user.get(z).getUsername());
     	            //menu
     				MenuOwner();
     			}
     			else {
     				
     	            System.out.println("welacome to tenants: "+login.user.get(z).getUsername());
     	            //menu
     	           Menutenats();
     			}
     	 
     	 
     	}
        
        
        }// tenants
 
}//class MYApp
