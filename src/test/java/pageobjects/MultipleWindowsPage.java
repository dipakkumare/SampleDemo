package pageobjects;

import generic.SeleniumClass;

public class MultipleWindowsPage extends SeleniumClass {
	String xpathOpeningText="//div[@id='content']/div/h3";
	String xpathClickButton="//div[@id='content']/div/a";
	String xpathNewWindowText="html/body/div[1]/h3";

	
	public void clickOnLink(){
		
	element= this.locateElement(xpathClickButton, "xpath");
	this.clickElement(element);
	
		
	}
}
