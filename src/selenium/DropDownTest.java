package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	// Learn New Things

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		List<WebElement> allOption = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOption.size());
		System.out.println(allOption.get(1).getText());

		for (int i = 0; i < allOption.size(); i++) {
			if (allOption.get(i).isSelected()) {
				System.out.println(allOption.get(i).getText() + "------>" + allOption.get(i).isSelected());
			}
		}

		// To select from dropdown - to select from the dropdown, we use inbuilt select
		// class from Selenium.
		// For inbuilt class we need to create an object and pass the Argument from
		// where we want to select:

		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);

		// We have 3 methods to select by own from the dropdown (Any one method is good
		// not all 3 are required.):

		// 1. BY INDEX
		s.selectByIndex(2);
		Thread.sleep(3000);

		// 2. BY VALUE: We get value from inspect:
		s.selectByValue("2984");
		Thread.sleep(3000);

		// 3. BY TEXT We get Text from inspect:
		s.selectByVisibleText("Books");
		System.out.println("-----------After Selection-----------");

		for (int i = 0; i < allOption.size(); i++) {
			if (allOption.get(i).isSelected()) {
				System.out.println(allOption.get(i).getText() + "------>" + allOption.get(i).isSelected());
			}
		}

	}
}
