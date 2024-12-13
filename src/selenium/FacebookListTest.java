package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//HOME WORK
public class FacebookListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		/*
		 * WebElement footer = driver.findElement(By.
		 * xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		 * List<WebElement> total = footer.findElements(By.tagName("a"));
		 * System.out.println(total.size());
		 */

		// Second Way to find a list of Web Element in just one single line code from
		// any specific area:
		List<WebElement> total = driver
				.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
		System.out.println(total.size());
		System.out.println(total.get(1).getText());

		for (int i = 0; i < total.size(); i++) {
			System.out.println(total.get(i).getText());
		}

	}

}
