package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	//Learn New Things
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		String s =driver.findElement(By.xpath("//input[@name='_nkw']")).getAttribute("placeholder");
		System.out.println(s);
		
		
		//This could be asked by the interviewer :Question: if i entered any value then how can I read It??? Answer: through the getAttribute method and pass value.
		driver.findElement(By.id("gh-ac")).sendKeys("jkFGJKF");
		
		String x = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(x);
	}

}
