package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	// HOME WORK

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");

		// find the list under ternding now
		List<WebElement> allList = driver
				.findElements(By.xpath("//div[@class='bd']//a"));
		System.out.println(allList.size());

		// Traditional For loop:
		/*
		 * for(int i = 0; i <allLink.size();i++) {
		 * System.out.println(allLink.get(i).getText()); }
		 */

		// For Each Loop:
		// Syntax: DataType(List of What) Name(anything) : name(From Which List)
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}

	}

}
