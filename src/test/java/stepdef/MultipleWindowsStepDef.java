package stepdef;

import cucumber.api.java.en.Then;
import generic.SeleniumClass;
import pageobjects.MultipleWindowsPage;

public class MultipleWindowsStepDef extends SeleniumClass {

	MultipleWindowsPage mwp= new MultipleWindowsPage();
	
	@Then("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mwp.clickOnLink();
	}

	@Then("^switch to anather window$")
	public void switch_to_anather_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mwp.switchToAnotherWindow();
	}

}
