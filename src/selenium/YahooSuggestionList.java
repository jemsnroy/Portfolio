package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {
	// HOME WORK
	// TYPE canada and GET SUGGESTION LIST:

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");

		driver.findElement(By.className("_yb_ehpit")).sendKeys("canada");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'_yb_17qmx')]/li"));
		System.out.println(list.size());

		for (WebElement s : list) {
			System.out.println(s.getAttribute("data"));
		}
	}/*FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://ca.yahoo.com/");  
		
		driver.findElement(By.name("p")).sendKeys("canada");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allOptions.size());
		
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}*/


}
