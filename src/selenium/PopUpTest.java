package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	// Learn new Things About Pop-up

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		Thread.sleep(10000);
		List<WebElement> pp1 = driver.findElements(
				By.xpath("//img[@src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png']"));
		System.out.println(pp1.size());
		if (pp1.size() > 0) {
			pp1.get(0).click();
		}

		Thread.sleep(3000);
		List<WebElement> pp2 = driver.findElements(By.xpath("//img[@class='close-btn']"));
		System.out.println(pp2.size());
		if (pp2.size() > 0) {
			pp2.get(0).click();
		}

		Thread.sleep(3000);
		List<WebElement> pp3 = driver.findElements(By.xpath("//img[@class='_24EHh']"));
		System.out.println(pp3.size());
		if (pp3.size() > 0) {
			pp3.get(0).click();
		}

		WebElement enterCanada = driver.findElement(By.id("search-key"));
		enterCanada.sendKeys("canada");
	}

}
