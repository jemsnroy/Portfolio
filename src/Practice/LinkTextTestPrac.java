package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTestPrac {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.google.in");
	
	//driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.partialLinkText("mai")).click();
	
	String actualTitle = driver.getTitle();
	String expTitle = "Gmail";
	System.out.println(actualTitle);
	if(actualTitle.equals(expTitle)) 
	{
		System.out.println("Test is Passed.");
	}
	else 
	{
	System.out.println("Test is Failed.");	
	}
	
	/*String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://accounts.google.com/v3/signin/identifier?dsh=S-1576793091%3A1662201696064387&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmWzkn8CPu0S8Ez7-Xjrsdu2eo1zLbhr1a0piTKrkUKTt1Tk79wXpo7YWjw5Rc8OCfet1oUW";
	System.out.println(actualUrl);
	if(actualUrl.equals(expectedUrl)) 
	{
		System.out.println("Test is Passed.");
	}
	else 
	{
	System.out.println("Test is Failed.");	
	}*/
}
}
