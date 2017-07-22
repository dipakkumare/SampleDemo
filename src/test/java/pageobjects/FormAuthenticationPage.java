package pageobjects;

import generic.SeleniumClass;

public class FormAuthenticationPage extends SeleniumClass {
	
	String xpathUserName="//input[@id='username']";
	String xpathPassword="//input[@id='password']";
	String xpathLoginButton="//form[@id='login']/button";
	String xpathErrorMsg="//div[@id='flash']";
	String xpthaLogoutBotton="//div[@id='content']/div/a";
	String xpthaWelcomeText="//div[@id='content']/div/h4";
	String xpthaHeader="//div[@id='content']/div/h2";
	
	public void enterUserName(String uname){
		element = this.locateElement(xpathUserName, "xpath");
		this.passValueToTextBox(element, uname);
	}
	
	
	public void enterPassword( String pword){
		element = this.locateElement(xpathPassword, "xpath");
		this.passValueToTextBox(element, pword);	
	}
	
	
	public void clickLoginbuttont(){
		element = this.locateElement(xpathLoginButton, "xpath");
		this.clickElement(element);
	}
	
	public void clickLogOutbuttont(){
		element = this.locateElement(xpthaLogoutBotton, "xpath");
		this.clickElement(element);
		
	}
}
