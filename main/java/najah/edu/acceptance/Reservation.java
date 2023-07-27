package najah.edu.acceptance;

import java.util.ArrayList;

public class Reservation {
    private String tenantName;
    private String contactInformation;
    private String checkInDate;
    private String checkOutDate;
    

    public Reservation(String tenantName, String contactInformation, String checkInDate, String checkOutDate) {
        this.tenantName = tenantName;
        this.contactInformation = contactInformation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) { 
        this.tenantName = tenantName;
    }

    public String getContactInformation() {
        return contactInformation; 
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    

}

