package najah.edu.acceptance;

import java.util.ArrayList;

public class Units {
    private String unitNumber;
    private int bedrooms;
    private int bathrooms;
    private boolean hasBalcony;
    private double monthlyRent;
    private boolean inclusiveOfUtilities;
    private ArrayList<Reservation> reservations;

    public Units(String unitNumber, int bedrooms, int bathrooms, boolean hasBalcony,double monthlyRent,boolean newInclusiveOfUtilities) {
        this.unitNumber = unitNumber;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasBalcony = hasBalcony;
        this.monthlyRent=monthlyRent;
        this.reservations = new ArrayList<>();
    }

    // Getters and setters for Unit properties
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean hasBalcony() { 
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
    public boolean isInclusiveOfUtilities() {
        return inclusiveOfUtilities;
    }

    public void setinclusiveOfUtilities(boolean inclusiveOfUtilities) {
        this.inclusiveOfUtilities = inclusiveOfUtilities;
    }

	public double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
