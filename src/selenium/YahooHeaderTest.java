package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	// HOME WORK

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");

		// find the list of Header
		List<WebElement> allList = driver.findElements(By.xpath("//ul[contains(@class,'_yb_1uvnf _yb_u4g3y')]/li/a"));
		System.out.println(allList.size());

		// For Each Loop:
		// Syntax: DataType(List of What) Name(anything) : name(From Which List)
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}

	}

}
