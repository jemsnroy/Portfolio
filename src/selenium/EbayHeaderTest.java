package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	// HOME WORK

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		// find the list of Header
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
		System.out.println(allList.size());

		// For Each Loop:
		// Syntax: DataType(List of What) Name(anything) : name(From Which List)
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}

	}

}
