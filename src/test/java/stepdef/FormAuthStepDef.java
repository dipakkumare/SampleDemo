package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.FormAuthenticationPage;

public class FormAuthStepDef {
	FormAuthenticationPage fap= new FormAuthenticationPage();
	

	@Then("^enter username as \"([^\"]*)\"$")
	public void enter_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fap.enterUserName(arg1);
	}
	
	@Then("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fap.enterPassword(arg1);
	   
	}
	
	
	
	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fap.clickLoginbuttont();
	}
	
	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fap.clickLogOutbuttont();
	}
	

}
