package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;


public class TenantClass {
	 private static final Logger LOGGER = Logger.getLogger(TenantClass.class.getName());
	 private static final List<TenantClass> Tenant= new ArrayList<TenantClass>();
	
	 private static  String name;
	 private static   String phone;
	 private static  String location;
private String getName() {
	return name;
}
private  void setName(String name) {
	TenantClass.name = name;
}
private  String getPhone() {
	return phone;
}
private  void setPhone(String phone) {
	TenantClass.phone = phone;
}
private String getLocation() {
	return location;
}
private  void setLocation(String location) {
	TenantClass.location = location;
}
  
public TenantClass(String name,String phone,String location) {
	this.name=name;
	this.phone=phone;
	this.location=location;
}
public TenantClass() {
	super();
}

public static  void  inti() {
	Tenant.add(new TenantClass("Ahmad","087899","nabluse"));
	Tenant.add(new TenantClass("Baraa","087899","ramalah"));
}
private static  Units n1=new Units();
public static  void payprice () {
		n1.viewunit();
	 Scanner scanner = new Scanner(System.in);
	 LOGGER.log(Level.INFO,"Enter number unit to reseve : ");
    String number = scanner.nextLine();
    LOGGER.log(Level.INFO,"Enter information phone number or any thing to connect  : ");
    String phone = scanner.nextLine();
    
  
}

}


