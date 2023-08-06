package najah.edu.acceptance;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
public class HousingAdvertisement {
	 private static final Logger LOGGER = Logger.getLogger(HousingAdvertisement.class.getName());
    private String title;
    private String description;
    private String location;
    private boolean approved;
    private ArrayList<Units> units;
    private OwnerClass owner;

    public HousingAdvertisement(String title, String description,String location,OwnerClass owner) {
        this.title = title;
        this.description = description;
        this.location=location;
        this.approved = false;
        this.setOwner(owner);
        this.units = new ArrayList<Units>();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    public void addUnit(Units unit) {
        units.add(unit);
    }

    public void removeUnit(Units unit) {
        units.remove(unit);
    }

    public ArrayList<Units> getUnits() {
        return units;
    }
	public OwnerClass getOwner() {
		return owner;
	}
	public void setOwner(OwnerClass owner) {
		this.owner = owner;
	}
	
	
	
}

