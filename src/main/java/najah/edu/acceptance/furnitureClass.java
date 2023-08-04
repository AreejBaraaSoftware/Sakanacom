package najah.edu.acceptance;

import java.util.ArrayList;

public class furnitureClass {
	
	    private String type;
	    private String material;
	    private double price;
	    public static boolean Furnitflage;
	   

		public boolean isFurnitflage() {
			return Furnitflage;
		}

		public void setFurnitflage(boolean furnitflage) {
			Furnitflage = furnitflage;
		}

		// Constructor
	    public furnitureClass (String type, String material, double price) {
	        this.type = type;
	        this.material = material;
	        this.price = price;
	    }

	    // Getters and Setters
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
	        System.out.println("Furniture Type: " +f.getType());
	        System.out.println("Material: " + f.getMaterial());
	        System.out.println("Price:$" + f.getPrice());
	        System.out.println("---------------------------------");
	    }
	    }
	    public static ArrayList<furnitureClass> furnit=new ArrayList<furnitureClass>();

	    public static  void initfurniture () {
	    	furnit.add(new furnitureClass("Table", "Wood", 199.99) );
	    	furnit.add(new furnitureClass("chiar", "Wood", 200.99) );
	    	furnit.add(new furnitureClass("TV", "---", 1000) );
	    	Furnitflage=true;
	    	
	    }

		public furnitureClass() {
			super();
		}
 
	    

	   

}
