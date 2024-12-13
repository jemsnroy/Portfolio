package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	// click on shop
	// size and Text (Everything)

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca/");

		WebElement shop = driver.findElement(By.xpath("//li[@data-automation='shop']"));
		shop.click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']/div/a"));
		System.out.println(list.size());
		for (WebElement a : list) {
			System.out.println(a.getText());
		}
	}

}
