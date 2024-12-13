package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	//HOME WORK
	//TYPE iphone and GET SUGGESTION LIST: 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		driver.findElement(By.name("_nkw")).sendKeys("iphone");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/a"));
		System.out.println(list.size());

		for (WebElement a : list) {
			System.out.println(a.getText());
		}
	}

}
