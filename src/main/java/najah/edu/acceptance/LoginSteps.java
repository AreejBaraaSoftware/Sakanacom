package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
public class LoginSteps {
	 private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());
	public LoginSteps() {
		 LOGGER.log(Level.INFO," ");

	}
	 String password;
	 String username;
	
	private   static boolean isLoginadmin =false;
	private  static  boolean isLogincustomer =false;
	//private  static  boolean isLoginowner =false;
	private static boolean isLoginworker =false;
	private static boolean isLoginonuser =false;
	private static boolean f0 =false;
	private static boolean f1 =false;
	private static boolean f2 =false;

	private static int x;
	public LoginSteps(String username, String password) {
		
		this.username=username;
		this.password=password;
		
		
	}
	public int getx() {
		return getxmas();
	}
	public static void setx(int x) {
		LoginSteps.setxnan(x);
	}
	public boolean getisLoginadmin() {
		return isLoginadmin ;	
	}
	public static void setisLoginadmin(boolean isLoginadmin) {

		LoginSteps.isLoginadmin = isLoginadmin;		
	}
	
	public boolean getisLogincustomer() {
		return isLogincustomer ;	
	//   return	isLoginowner;
	}
	public static void setisLogincustomer(boolean isLogincustomer) {
		LoginSteps.isLogincustomer = isLogincustomer;	

	}
	
	public boolean getisLoginworker() {
		return isLoginworker ;	
	}
	public static void setisLoginworker(boolean isLoginworker) {
		LoginSteps.isLoginworker = isLoginworker;		
	}
	
	public boolean getisLoginonuser() {
		return isLoginonuser ;	
	}
	public static void setisLoginonuser(boolean isLoginonuser) {
		LoginSteps.isLoginonuser = isLoginonuser;		
	}
	
	
	public String getName() {
		return username ;	
	}
	public void setName(String name) {
		this.username = name;		
	}
	public String getpassword() {
		return password ;	
	}
	public void setpassword(String password) {
		this.password = password;		
	}
	Scanner input=new Scanner(System.in);
	private final static List <LoginSteps> userslogin= new ArrayList<LoginSteps>();
	static List <LoginSteps> workerlogin= new ArrayList<LoginSteps>();
    private static List<LoginSteps> ownerlogin = new ArrayList<LoginSteps>();

	boolean isLogin =false;
	 protected int failsauthentication;
	private static Scanner input2;
	private Scanner input3;
	
	private Scanner input4;


     public static  void  inti() {
    	 userslogin.add(new LoginSteps("Areej","A***"));
    	 

     }
     public static  void  inti1() {
    	 workerlogin.add(new LoginSteps("Baraa","T***"));
    	 
     }
     
     public static  void  inti2() {
         ownerlogin.add(new LoginSteps("Alaa","O***"));
    	 
     }
     


     
     
	public static int authenticatelogin () {
		 inti();
		 inti1();
		 inti2();

		 boolean flag=false;
		 boolean flag0=false;
		 boolean flag1=false;

		 LOGGER.log(Level.INFO,"Enter Username : ");
		input2 = new Scanner(System.in);
		String username=input2.nextLine();
		
		for(int i=0;i<userslogin.size()&&i<workerlogin.size() && i<ownerlogin.size();i++) {
			 if(userslogin.get(i).username.equals(username)) {
				 LOGGER.log(Level.INFO,"Enter password : ");
				String pass=input2.nextLine();
				if(userslogin.get(i).password.equals(pass)) {
					flag = true;
					f0=true;
					return i;
				}
				else {
					 LOGGER.log(Level.INFO, "please enter password again");
					String pas=input2.nextLine();
					if(userslogin.get(i).password.equals(pas)) {
						flag =true;
						f0=true;
	                    return i;}
			 }
			  flag0=true; }
			 else  
				 if(workerlogin.get(i).username.equals(username) ) {
					 LOGGER.log(Level.INFO,"Enter password : ");
						String pass=input2.nextLine();
						if(workerlogin.get(i).password.equals(pass)) {
							flag = true;
							f1=true;
							return i;
						}
						else {
							 LOGGER.log(Level.INFO, "please enter password again");
							String pas=input2.nextLine();
							if(workerlogin.get(i).password.equals(pas)) {
								flag =true;
								f0=true;
			                    return i;}
					 }
					  flag1=true;
					  }
				 
		
			 
				 else {
					 if(ownerlogin.get(i).username.equals(username) ) {
						 LOGGER.log(Level.INFO,"Enter password : ");
							String pass=input2.nextLine();
							if(ownerlogin.get(i).password.equals(pass)) {
								flag = true;
								f1=true;
								return i;
							}
							else {
								 LOGGER.log(Level.INFO, "please enter password again");
								String pas=input2.nextLine();
								if(ownerlogin.get(i).password.equals(pas)) {
									flag =true;
									f0=true;
				                    return i;}
						 }
						  flag0=true; }
				 
				 }
				 //ownerlogin
				 
			 }
			 
			 
		if(!flag0) {
			for(int i=0;i<userslogin.size()&&i<workerlogin.size() && i<ownerlogin.size();i++) {
				 if(userslogin.get(i).username.equals(username)) {
					 LOGGER.log(Level.INFO,"Enter password : ");
					String pass=input2.nextLine();
					if(userslogin.get(i).password.equals(pass)) {
						flag = true;
						f0=true;
						return i;
					}
					else {
						 LOGGER.log(Level.INFO, "please enter password again");
						String pas=input2.nextLine();
						if(userslogin.get(i).password.equals(pas)) {
							flag =true;
							f0=true;
		                    return i;}
				 }
				  flag0=true; }
				 else {
					 if(workerlogin.get(i).username.equals(username)) {
						 LOGGER.log(Level.INFO,"Enter password : ");
							String pass=input2.nextLine();
							if(workerlogin.get(i).password.equals(pass)) {
								flag = true;
								f1=true;
								return i;
							}
							else {
								 LOGGER.log(Level.INFO, "please enter password again");
								String pas=input2.nextLine();
								if(workerlogin.get(i).password.equals(pas)) {
									flag =true;
									f1=true;
				                    return i;}
						 }
						  flag0=true; }
					 
					 
					 else {
						 if(ownerlogin.get(i).username.equals(username)) {
							 LOGGER.log(Level.INFO,"Enter password : ");
								String pass=input2.nextLine();
								if(ownerlogin.get(i).password.equals(pass)) {
									flag = true;
									f1=true;
									return i;
								}
								else {
									 LOGGER.log(Level.INFO,"please enter password again");
									String pas=input2.nextLine();
									if(ownerlogin.get(i).password.equals(pas)) {
										flag =true;
										f1=true;
					                    return i;}
							 }
							  flag0=true; }
					 }
				 }
				 }
		}
		
		 if(!flag0) {
			 LOGGER.log(Level.INFO,"you are not user");
				isLoginonuser =true;
			}
		 if(!flag) {
			
			 LOGGER.log(Level.INFO,"you are blocked");
				isLoginonuser =true;
			}
	return -1;
		}
		
	public static void  usernotfound () {
		
		if(isLoginonuser) {
			setxnan(-1);
		}
		
		
	}
	
	public static void  whostheuser () {
		int count1=0;
		String str=null;
		String as=null;
		String dx=null;
		setxnan(authenticatelogin ());
		if(getxmas()>-1) {
			if(f0) {str=userslogin.get(getxmas()).getpassword();}
		    if(f1) {as=workerlogin.get(getxmas()).getpassword();}
		    if(f2) {dx=ownerlogin.get(getxmas()).getpassword();}

		if(str!=(null) ) {
		for(int k=0;k<str.length();k++) {
			 if(Character.isDigit(str.charAt(k))) {
				
			      count1++;}
		}}
		if( as!=(null) ) {
		for(int k=0;k<as.length();k++) {
			 if(Character.isDigit(as.charAt(k))) {
			count1++;}}
		}
		
		if("A***".equals(str))
	    {   
			
				isLoginadmin=true;
				f0=false;
				f1=false;
			
		}
		if("T***".equals(str)){
			
			isLogincustomer =true;
			f0=false;
			f1=false;
		}
		
		
		if("O***".equals(str)) { 
			
			
			isLoginworker =true;
			f0=false;
			f1=false;
			}
			
		
		if(getxmas()==-1) {
			isLoginonuser =true;
		}
		
		
	}
		
	}
	public static int getxmas() {
		return x;
	}
	public static void setxnan(int x) {
		LoginSteps.x = x;
	}
	public static List <LoginSteps> getUserslogin() {
		return userslogin;
	}
	public static List <LoginSteps> getWorkerlogin() {
		return workerlogin;
	}	
	
	public static List <LoginSteps> getownerlogin() {
		return ownerlogin;
	}	
	
	
	
	
	
	
	
	
	 
	
}

