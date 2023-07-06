package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
public login() {};
	
	private   static boolean isLoginadmin =false;
	private  static  boolean isLoginowner =false;
	private static boolean isLogintenants =false;
	private static boolean blockuser =false;
	 String password;
	 String username;
	 public static int x;
	 


public login(String username, String password) {
		
		this.username=username;
		this.password=password;
		
		
	}


public static void setX(int x) {
	login.x = x;
}
public static boolean isLoginadmin() {
	return isLoginadmin;
}
public static void setLoginadmin(boolean isLoginadmin) {
	login.isLoginadmin = isLoginadmin;
}
public static boolean isLoginowner() {
	return isLoginowner;
}
public static void setLoginowner(boolean isLoginowner) {
	login.isLoginowner = isLoginowner;
}
public static boolean isLogintenants() {
	return isLogintenants;
}
public static void setLogintenants(boolean isLogintenants) {
	login.isLogintenants = isLogintenants;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
private static Scanner inputusername;
private static Scanner inputpassword;
static ArrayList <login> user= new ArrayList<login>();
private   static boolean isLogin =false;
	
public static  void init () {
	 user.add(new login("areej","##"));
	 user.add(new login("alaa","123")); //tenates
	 user.add(new login("Baraa","##"));
	 user.add(new login("majd","11111"));//owner
	 
}
public static int cheacklogin() {
	
	init();
	 boolean flagpass=false;
	 boolean flageusername=false;
	System.out.println("Enter Username");
	 inputusername=new Scanner(System.in);
	 String UserName=inputusername.nextLine();
	
	 for(int i=0;i<user.size();i++) {
		 if(user.get(i).username.equals(UserName)) {
				System.out.println("Enter password ");
				inputpassword=new Scanner(System.in);
				 String Password=inputpassword.nextLine();
				 if(user.get(i).password.equals(Password)) {
					 flagpass=true; // user enterpassword true and username true
				return i;
				 }//if password
				 else {
						System.out.println(" Error please enter the correct password ");
						 String Password1 =inputusername.nextLine(); //new password
						if(user.get(i).password.equals(Password1)) {
							flagpass =true; // correct password
		                    return i;
		                    }
				 }
				 flageusername= true; // username true the login true 
		 }//if username
	 }//forloop
	 
	 if(flageusername==false) { // wrong user name
			System.out.println(" Error please Enter  the correct Username  ");
			String username1=inputusername.nextLine();
			for(int i=0;i<user.size();i++) {
				 if(user.get(i).username.equals(username1)) {
					System.out.println("Enter password : ");
					String pass=inputpassword.nextLine();
					if(user.get(i).password.equals(pass)) {
						flagpass =true;
						return i;
					}
	 
					else {
						System.out.println(" Error please enter password again) :");
						String pass1=inputpassword.nextLine();
						if(user.get(i).password.equals(pass1)) {
							flagpass =true;
		                    return i;}
				 }
					flageusername=true;
				 }
			}
			 if(flageusername==false) {
					System .out.print(" you are not user\n");
					isLoginadmin = true;
				}
			 if(flagpass==false) {
					System .out.print("\n you are blocked Error\n");
					blockuser =true;
				}
			
			
	 }
	 return -1; // error login 
			
	 } // cheacklogin

public static void notfoundUser () {
	
	if(blockuser==true) {
		x=-1;
	}
}
	
public static void typeUser() {
		
		int count=0;
		String type;
		x=  cheacklogin(); // Userlogin in the application 
		
		type=user.get(x).getPassword(); // the password is used the type is specified
		
		for(int j=0;j<type.length();j++) {
			 if(Character.isDigit(type.charAt(j)))
				
			      count++;
			 }
		
		
		if("##".equals(type))
	    {   
			
				isLoginadmin=true;
				

			
		}
		
		else if(count==5) { 
			
			
			isLoginowner =true;
			}
			
		else {
			
			isLogintenants =true;
		}
		
		if(x==-1) {
			blockuser =true;
		}
		
		
	}
	
	


}


