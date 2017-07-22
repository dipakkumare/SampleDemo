package stepdef;

import cucumber.api.java.en.Then;
import generic.SeleniumClass;
import pageobjects.DropdownPage;

public class DropdownStepdef extends SeleniumClass {
	
	DropdownPage ddp= new DropdownPage();
	
	
	 @Then("^select  value by \"([^\"]*)\" with \"([^\"]*)\"$")
	 public void select_value_by_with(String arg1, String arg2) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	//this.locateElement(idDropdownPage, "id");
	ddp.selectValue(arg1,arg2);	
		
	 
	 }
}
