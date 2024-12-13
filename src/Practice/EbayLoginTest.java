package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/"); // DONE
		driver.findElement(By.linkText("register")).click();
		
		//Error in clicking checkbox.
		Thread.sleep(3000);
		driver.findElement(By.id("checkbox")).click();
	}

}
