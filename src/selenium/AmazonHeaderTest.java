package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	//HOME WORK
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		Thread.sleep(6000);
		List<WebElement> total = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(total.size());
		System.out.println(total.get(1).getText());
		
		// Traditional For loop:
		for (int i = 0; i < total.size(); i++) {
			System.out.println(total.get(i).getText());

		}
		
	}

}
