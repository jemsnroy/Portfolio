package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	// HOME WORK

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");

		// find the list of Footer
		List<WebElement> allList = driver
				.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(allList.size());

		// For Each Loop:
		// Syntax: DataType(List of What) Name(anything) : name(From Which List)
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}

	}

}
