package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.ebay.ca/");

		driver.manage().window().maximize();

		List<WebElement> box = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(box.size());
		for (int i = 0; i < box.size(); i++) {
			if (box.get(i).isSelected()) {
				System.out.println(box.get(i).getText() + "-------->" + box.get(i).isSelected());
			}
		}

		WebElement st = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select op = new Select(st);
		op.selectByVisibleText("Automotive");
		for (int i = 0; i < box.size(); i++) {
			if (box.get(i).isSelected()) {
				System.out.println(box.get(i).getText() + "-------->" + box.get(i).isSelected());
			}
		}

		Thread.sleep(3000);
		Select op1 = new Select(st);
		op1.selectByVisibleText("Books");
		for (int i = 0; i < box.size(); i++) {
			if (box.get(i).isSelected()) {
				System.out.println(box.get(i).getText() + "-------->" + box.get(i).isSelected());
			}
		}

	}

}
