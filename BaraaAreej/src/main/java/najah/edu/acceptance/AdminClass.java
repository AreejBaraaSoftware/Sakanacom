
   


        
           
   
+-9+
        LOGGER.log(Level.INFO,"Enter the title of the housing advertisement you want to modify: ");
        String title = scanner.nextLine();
         
       
        HousingAdvertisement selectedAdvertisement = null;
      
        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getTitle().equalsIgnoreCase(title)) {
                selectedAdvertisement = advertisement;
                break;
            }
        }

        if (selectedAdvertisement != null) {
        	 LOGGER.log(Level.INFO,"Housing Advertisement Details:");
        	 LOGGER.log(Level.INFO,"Title: {0}" , selectedAdvertisement.getTitle()+" ");
        	 LOGGER.log(Level.INFO,"Description:{0} " , selectedAdvertisement.getDescription()+" ");
        	 LOGGER.log(Level.INFO,"Contact Information: {0}" , selectedAdvertisement.getOwner().getContactInformation()+" ");

        	 LOGGER.log(Level.INFO,"Select the field you want to modify:");
        	 LOGGER.log(Level.INFO,"1. Title");
        	 LOGGER.log(Level.INFO,"2. Description");
        	 LOGGER.log(Level.INFO,"5. Contact Information");

        	 LOGGER.log(Level.INFO,"Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	 LOGGER.log(Level.INFO,"Enter the new title: ");
                    String newTitle = scanner.nextLine();
                    selectedAdvertisement.setTitle(newTitle);
                    break;
                case 2:
                	 LOGGER.log(Level.INFO,"Enter the new description: ");
                    String newDescription = scanner.nextLine();
                    selectedAdvertisement.setDescription(newDescription);
                    break;
                case 3:
                	 LOGGER.log(Level.INFO,"Enter the new owner location: ");
                    String newOwnerLocation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setOwnerLocation(newOwnerLocation);
                    break;
                case 4:
                	 LOGGER.log(Level.INFO,"Enter the new owner Name: ");
                    String newOwnerName = scanner.nextLine();
                    selectedAdvertisement.getOwner().setName(newOwnerName);;
                    break;
                case 5:
                	 LOGGER.log(Level.INFO,"Enter the new contact information: ");
                    String newContactInformation = scanner.nextLine();
                    selectedAdvertisement.getOwner().setContactInformation(newContactInformation);
                    break;
                default:
                	 LOGGER.log(Level.INFO,"Invalid choice. Returning to the admin dashboard.");
                    break;
            }
            LOGGER.log(Level.INFO,"Housing advertisement data modified successfully!");
            modifedflage=true;
        } else {
        	 LOGGER.log(Level.INFO,"Housing advertisement not found. Returning to the admin dashboard.");
        }
    }
    
    public void viewHousingDetailsByOwnerName(String ownerName) {
        boolean found = false;

        for (HousingAdvertisement advertisement : housingAdvertisements) {
            if (advertisement.getOwner().getName().equalsIgnoreCase(ownerName)) {
            	 LOGGER.log(Level.INFO,"Title: {0}" , advertisement.getTitle()+" ");
            	 LOGGER.log(Level.INFO,"Description:{0} " , advertisement.getDescription()+" ");
            	 LOGGER.log(Level.INFO,"Location:{0} " , advertisement.getLocation()+" ");
            	 LOGGER.log(Level.INFO,"Owner: {0}" , advertisement.getOwner().getName()+" ");
            	 LOGGER.log(Level.INFO,"Contact Information:{0} " , advertisement.getOwner().getContactInformation()+" ");
            	 LOGGER.log(Level.INFO,DASH);
                found = true;
            }
           showdetail=true;
        }

        if (!found) {
        	 LOGGER.log(Level.INFO,"No housing advertisements found for owner: {0}" + ownerName);
        }
    }
	public static Boolean getShowdetail() {
		return showdetail;
	}
	public static void setShowdetail(Boolean showdetail) {
		AdminClass.showdetail = showdetail;
	}
    

	
    
} 

    
