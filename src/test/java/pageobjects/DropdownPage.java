package pageobjects;

import generic.SeleniumClass;

public class DropdownPage extends SeleniumClass{
	
	String xpthaHeader="//div[@id='content']/div/h3";
	String xpathDropdownmenu="//div[@id='dropdown']";
	String xpathSelectedOpton="//div[@id='dropdown']/option[1]";
	String xpathSelectOption1="//div[@id='dropdown']/option[2]";
	String xpathSelectOption2="//div[@id='dropdown']/option[3]";
	
	public void selectValue(String arg1, String arg2) {
		// TODO Auto-generated method stub
		element = this.locateElement(xpathDropdownmenu, "xpath");
		//this.selectValueFromDropdown(arg1, arg2, element);
	}
	
	
	
	 
	 
	

	
}
