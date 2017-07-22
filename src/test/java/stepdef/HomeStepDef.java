package stepdef;

import java.util.LinkedHashSet;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef {
		
	HomePage hp = new HomePage(); 

	@When("^user selects \"([^\"]*)\" browser$")
	public void user_selects_browser(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    hp.selectBrowser(arg1);
		
	}

	@When("^launches \"([^\"]*)\"$")
	public void launches(String arg1){
	    // Write code here that turns the phrase above into concrete actions
	   hp.launchApp(arg1);
		System.out.println("step 1");
	}
	
	@Then("^verify \"([^\"]*)\" is present in url$")
	public void verify_is_present_in_url(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		hp.verifyCurrentURL(arg1);
		System.out.println("step 11");
	}

	@Then("^click on \"([^\"]*)\"link$")
	public void click_on_link(String arg1){ 
	    // Write code here that turns the phrase above into concrete actions
		hp.clickLink(arg1);
		System.out.println("step 12");
	}

	@After    // hook
	@Then("^close application$")
	public void close_application(){
	    // Write code here that turns throw new PendingException();
		hp.closeApp(true); //true= all windows get closed.. false= focused window get closed
		System.out.println("step 5");
		
	}
	
	
	@Then("^get all links present on home page$")
	public void get_all_links_present_on_home_page() {
	  
		LinkedHashSet<String> lhs=hp.getAllLinks();
	   System.out.println(lhs.size());
		hp.verifyAllLinks(lhs);
	   
	}

	
}

	
	
