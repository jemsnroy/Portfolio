package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayLinkTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/"); // DONE
		
		Thread.sleep(3000);
		List<WebElement> total = driver.findElements(By.xpath("//nav[@aria-label='Top Categories']"));
		System.out.println(total.size());
		
		//Error in the Next Line (Not able to get the text of the Link).
		System.out.println(total.get(1).getText());
		int i =0;
		while(i<total.size()) {
			System.out.println(total.get(i).getText());
			i++;
		}
		

	}

}
