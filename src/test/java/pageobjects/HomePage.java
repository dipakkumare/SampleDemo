package pageobjects;

import java.util.LinkedHashSet;

import generic.SeleniumClass;

public class HomePage extends SeleniumClass {
	
	 private String linkTextHomeLinks = "%s";
	 private String tagNameHomeLinks="a";
	 
	
	public void clickLink(String  linkName){
		
		linkTextHomeLinks = String.format(linkTextHomeLinks, linkName);
		System.out.println(linkTextHomeLinks);
		element = this.locateElement(linkTextHomeLinks, "linktext");
		this.clickElement(element);
		
	}
	
	public LinkedHashSet<String> getAllLinks(){
		
		this.ListofElements=super.locateElements(tagNameHomeLinks, "tagName");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs=super.getLinkTextFromWebElement(this.ListofElements);
		
		this.writeExcel("abc.xlsx",lhs);
		
		return lhs;
	}
	
	public void verifyAllLinks(LinkedHashSet<String>linktextList){
		//read excle sheet , pass linktxet, compare(how to compare list values)
		
	}

}
