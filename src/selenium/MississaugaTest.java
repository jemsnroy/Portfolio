package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	// Home Work
	// Task:
	// Click on Organization
	// Size and Text.

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		WebElement organization = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		organization.click();
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(list.size());
		for(int i =0; i < list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
