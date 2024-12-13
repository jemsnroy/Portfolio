package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		// driver.findElement(By.tagName("a"));
		// WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc
		// SSwjIe']"));
		// List<WebElement> listOfLink = footer.findElements(By.tagName("a"));
		// System.out.println(listOfLink.size());

		// Second Way to find a list of Web Element in just one single line code from
		// any specific area:
		List<WebElement> listOfLink = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(listOfLink.size());

		System.out.println(listOfLink.get(1).getText());

		for (int i = 0; i < listOfLink.size(); i++) {
			System.out.println(listOfLink.get(i).getText());
		}
	}

}
