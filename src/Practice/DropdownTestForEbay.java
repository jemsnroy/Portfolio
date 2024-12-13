package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestForEbay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		// Technique: 1 for getting list:
		/*
		 * WebElement header = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		 * List<WebElement> listofDD = header.findElements(By.tagName("option"));
		 * System.out.println(listofDD.size());
		 * System.out.println(listofDD.get(0).getText());
		 * 
		 * for (int j = 0; j < listofDD.size(); j++) { if (listofDD.get(j).isSelected())
		 * { System.out.println(listofDD.get(j).getText() + "------->" +
		 * listofDD.get(j).isSelected()); } }
		 */

		// Technique: 2 for getting list:
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				System.out.println(list.get(i).getText() + "---------->" + list.get(i).isSelected());
			}
		}

		/*
		 * for (WebElement a : list) { System.out.println(a.getText()); }
		 */

		Thread.sleep(3000);

		// If I Want to change The Selection
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);

		s.selectByIndex(5);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				System.out.println(list.get(i).getText() + "---------->" + list.get(i).isSelected());
			}
		}
		System.out.println("------------------------After Selection---------------------------");

		Thread.sleep(3000);
		s.selectByValue("15032");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				System.out.println(list.get(i).getText() + "---------->" + list.get(i).isSelected());
			}
		}
		System.out.println("------------------------After Selection---------------------------");

		Thread.sleep(3000);
		s.selectByVisibleText("Collectibles");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				System.out.println(list.get(i).getText() + "---------->" + list.get(i).isSelected());
			}
		}
	}
}
