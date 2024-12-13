package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayMaximizeElementSelectClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.ebay.ca");
		driver.manage().window().maximize();

		List<WebElement> elementTest = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(elementTest.size());
		System.out.println(elementTest.get(0).getText());

		if (elementTest.size() > 0) {
			System.out.println("Yes, Element is Present");
		} else {
			System.out.println("No, Element is not Present");
		}

		Thread.sleep(3000);
		for (int i = 0; i < elementTest.size(); i++) {
			if (elementTest.get(i).isSelected()) {
				System.out.println(elementTest.get(i).getText() + "----------->" + elementTest.get(i).isSelected());
			}
		}

		System.out.println("-------------After Selection----------------");

		WebElement box = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select option = new Select(box);

		Thread.sleep(3000);
		option.selectByIndex(5);
		for (int i = 0; i < elementTest.size(); i++) {
			if (elementTest.get(i).isSelected()) {
				System.out.println(elementTest.get(i).getText() + "----------->" + elementTest.get(i).isSelected());
			}
		}

		System.out.println("-------------After Selection----------------");

		Thread.sleep(3000);
		option.selectByValue("2984");
		for (int i = 0; i < elementTest.size(); i++) {
			if (elementTest.get(i).isSelected()) {
				System.out.println(elementTest.get(i).getText() + "----------->" + elementTest.get(i).isSelected());
			}
		}

		System.out.println("-------------After Selection----------------");

		Thread.sleep(3000);
		option.selectByVisibleText("Business & Industrial");
		for (int i = 0; i < elementTest.size(); i++) {
			if (elementTest.get(i).isSelected()) {
				System.out.println(elementTest.get(i).getText() + "----------->" + elementTest.get(i).isSelected());
			}
		}

	}

}
