package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySignInTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca");
		
		
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='g-yolo-overlay-holder']/iframe")));
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='Sign in with Google Dialog']")));
		Thread.sleep(1000);
		List<WebElement> pop = driver.findElements(By.id("close"));
		System.out.println(pop.size());
		if(pop.size()>0) {
			pop.get(0).click();
		}
		
	}

}
