package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	// Learn new action(Drag and Drop):

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println(drop.getText());

		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();

		ew.until(ExpectedConditions.textToBePresentInElement(drop, "Dropped!"));

		System.out.println(drop.getText());
		if (drop.getText().equals("Dropped!")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

}
