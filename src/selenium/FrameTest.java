package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {
	
	//Very Important:
	//Learn New About iframe:

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}

		List<WebElement> box = driver.findElements(By.id("draggable"));
		System.out.println(box.size());
		if (box.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}

		System.out.println("-----------------------Switched to the frame-------------------");
		driver.switchTo().frame(0); // By Index
		// driver.switchTo().frame("name or id"); //Only for name or id , in this case
		// we can not use this option, as don't have id or name.
		// driver.switchTo().frame(By.className("ddweaf")); //By webElement

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}

		box = driver.findElements(By.id("draggable"));
		System.out.println(box.size());
		if (box.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}
		
		System.out.println("----------------Switch to the main Page----------------");
		
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}

		box = driver.findElements(By.id("draggable"));
		System.out.println(box.size());
		if (box.size() > 0) {
			System.out.println("Yes, it is Present.");
		} else {
			System.out.println("No, it is not Present");
		}

	}

}
