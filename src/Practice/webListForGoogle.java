package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webListForGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		Thread.sleep(3000);

		// For getting the total number of Links:
		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));
		System.out.println(listOfLink.size());

		// this will help to get the text of the particuler link:
		System.out.println(listOfLink.get(1).getText());

		for (int i = 0; i < listOfLink.size(); i++) {
			System.out.println(listOfLink.get(i).getText());
		}
	}

}
