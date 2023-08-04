package najah.edu.acceptance;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
    ArrayList <LoginSteps> founduser=new ArrayList<LoginSteps>();
    
   @Given("Given  I have the following username and passowrd in the store")
   public void userisfound (DataTable table) {
       List<List<String>> rows = table.asLists(String.class);

       for (List<String> columns: rows) {
           founduser.add(new LoginSteps(columns.get(0), columns.get(1)));
       }
       
   }
   
   
   @When("I search for name by username <{string}> and by Password <{string}> and Role<{string}>")
   public void iSearchForNameByUsernameAndByPasswordAndRole(String string, String string2, String string3) {
       LoginSteps.authenticatelogin();
     
   }
   
   
   
   @Then("I find {int} Tenant")
   public void iFindTenant(Integer int1) {
	   assertTrue(LoginSteps.getxmas()>-1);
	//   Main.tenantDashboard();
   }
   
  
      @When("I search for name by username <{string}> and by password <{string}>,this user not found")
      public void i_search_for_name_by_username_and_by_password_this_user_not_found(String string, String string2) {
    	  LoginSteps.usernotfound ();
}

      @Then("I find {int} Owner")
      public void iFindOwner(Integer int1) {
    	  assertTrue(LoginSteps.getxmas()>-1);
    	// Main.ownerDashboard();
      }

      
   @Then("I find  {int} Admin")
   public void iFindAdmin(Integer int1) {
	   	 assertTrue(LoginSteps.getxmas()>-1);
	   	// Main.adminDashboard();

   }

   @When("I search for name by username <{string}> and by Password <{string}>and Role<{string}>")
   public void iSearchForNameByUsernameAndByPasswordAndRole1(String string, String string2, String string3) {
	   LoginSteps.authenticatelogin();
     //  throw new io.cucumber.java.PendingException();
   }

	
	
	

	}