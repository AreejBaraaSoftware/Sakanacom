package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class furnitureClass {
	 private static final Logger LOGGER = Logger.getLogger(furnitureClass.class.getName());
	
	    private String type;
	    private String material;
	    private double price;
	   // public static boolean Furnitflage;
	    private   static boolean furnitFlage =false;

		
		
	    public static boolean isFurnitFlage() {
			return furnitFlage;
		}


		public static void setFurnitFlage(boolean furnitFlage) {
			furnitureClass.furnitFlage = furnitFlage;
		}


		public furnitureClass (String type, String material, double price) {
	        this.type = type;
	        this.material = material;
	        this.price = price;
	    }

	  
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	   
	    public void displayInfo() {

	        for (furnitureClass f : furnit ) {
	        	 LOGGER.log(Level.INFO,"Furniture Type:{0}",f.getType()+"");
	        	 
	        	
	        	 LOGGER.log(Level.INFO,"Material:{0}",f.getMaterial()+"");
	        	
	        	
	        	 LOGGER.log(Level.INFO,"Price:${0} " ,f.getPrice()+"");
	        	
	        	 LOGGER.log(Level.INFO,"-----------------------------------------");
	    }
	    }
	    public static List<furnitureClass> furnit=new ArrayList<furnitureClass>();

	    public static  void initfurniture () {
	    	furnit.add(new furnitureClass("Table", "Wood", 199.99) );
	    	furnit.add(new furnitureClass("chiar", "Wood", 200.99) );
	
	    	furnitFlage=true;
	    	
	    }

		public furnitureClass() {
			super();
		}
 
	    

	   

}
