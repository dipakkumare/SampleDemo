package generic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class SeleniumClass extends BaseClass {
	
	static WebDriver driver;
	protected WebElement element;
	protected List<WebElement> ListofElements= new ArrayList<WebElement>();   //object declaration
	
	public void selectBrowser (String browserName){
		System.out.println("Selecting" + browserName + "Browser");
		
		String path= this.setPath("\\src\\test\\java\\utils\\");
		
		if (browserName.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver",path + "chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		else if (browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", path+ "geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", path +"IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
			
			
		}
		
		driver.manage().window().maximize();
		
	}
	
	
	public void launchApp(String url){
		System.out.println("Launching" + url);
		driver.get(url);
	}
	
	public void verifyCurrentURL(String expectedURL){
		String actualURL= driver.getCurrentUrl();
		assert actualURL.contains(expectedURL):expectedURL +"is not matching" +actualURL;
		
	}
	
	public void closeApp(boolean closeAll){
		 if (closeAll){
			 driver.quit();
		 }
		 else
			  driver.close();
	}

	
	public WebElement locateElement(String address,String type){
		
		if(type.equalsIgnoreCase("linktext")){
			return driver.findElement(By.linkText(address));
			
		}		
		else if(type.equalsIgnoreCase("id")){
			return driver.findElement(By.id(address));
			
		}
		
		else if(type.equalsIgnoreCase("name")){
			return driver.findElement(By.name(address));
		}
		
		else if(type.equalsIgnoreCase("class")){
			return driver.findElement(By.className(address));
		}
		
		else if(type.equalsIgnoreCase("tagname")){
			return driver.findElement(By.tagName(address));
		}
		else if(type.equalsIgnoreCase("partialLinkText")){
			return driver.findElement(By.partialLinkText(address));

		}
		
		else if(type.equalsIgnoreCase("css")){
			return driver.findElement(By.cssSelector(address));
		}
		else if(type.equalsIgnoreCase("xpath")){
			return driver.findElement(By.xpath(address));
		}
		return null;
	}
	
	
	
public List<WebElement> locateElements(String address,String type){
		
		if(type.equalsIgnoreCase("linktext")){
			return driver.findElements(By.linkText(address));
			
		}
		
		else if(type.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(address));
			
		}
		
		else if(type.equalsIgnoreCase("name")){
			return driver.findElements(By.name(address));
		}
		
		else if(type.equalsIgnoreCase("class")){
			return driver.findElements(By.className(address));
		}
		
		else if(type.equalsIgnoreCase("tagname")){
			return driver.findElements(By.tagName(address));
		}
		else if(type.equalsIgnoreCase("partialLinkText")){
			return driver.findElements(By.partialLinkText(address));

		}
		
		else if(type.equalsIgnoreCase("css")){
			return driver.findElements(By.cssSelector(address));
		}
		else if(type.equalsIgnoreCase("xpath")){
			return driver.findElements(By.xpath(address));
		}
		return null;
	}
	
	public void clickElement(WebElement element){
		
		element.click();
	}
	
	public void switchToAnotherWindow(){
		
		String parentHandle= driver.getWindowHandle();
		Set<String> handle= driver.getWindowHandles();
		
		
		   System.out.println(handle);
		for(String key : handle){
			if (key.equalsIgnoreCase(parentHandle)){
				continue;
			}
			else{
				driver.switchTo().window(key);
				System.out.println(driver.getTitle());
				break;
			}
		}
		
	}
	
	
	public void passValueToTextBox(WebElement element, String value){
		element.sendKeys(value);
	}
	
	
	public LinkedHashSet<String> getLinkTextFromWebElement(List<WebElement> list){
		LinkedHashSet<String> lhs= new LinkedHashSet< String>();
		
		for(WebElement element : list){
			lhs.add(element.getText());
			
			//System.out.println(element.getText());
	
		}
		
		return lhs;	
	}
	
	
	/*public void selectValueFromDropdown(String type,String value ,WebElement delement){
		Select sel= new Select(delement);
		
		if(type.equalsIgnoreCase("index")){
			sel.selectByIndex(Integer);
		}
		else if(type.equalsIgnoreCase("value")){
			
		}
		else if(type.equalsIgnoreCase("text")){
			
		}
	} */
}

