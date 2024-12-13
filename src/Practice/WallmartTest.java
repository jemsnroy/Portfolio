package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WallmartTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Navigate method:
		driver.navigate().to("https://www.walmart.ca/en");

		// command for maximizing window:
		driver.manage().window().maximize();

		// Hover Test:
		WebElement button = driver.findElement(By.xpath("//span[@data-automation='sign-in-message']"));
		Actions signin = new Actions(driver);
		Thread.sleep(3000);
		signin.moveToElement(button).build().perform();

		// Login Test:
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//span[@data-automation='sign-in-message']"));
		click.click();
		WebElement we = driver.findElement(By.id("username"));
		we.sendKeys("sjkfhskfhsfk");
		WebElement we1 = driver.findElement(By.id("password"));
		we1.sendKeys("jfhsdkfjshfk");
		WebElement we2 = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/button[1]"));
		we2.click();

		// Error Test Message:
		Thread.sleep(3000);
		String ExpectedEM = "Please enter a valid email address or phone number.";
		String ActualEM = driver.findElement(By.xpath("//span[@class='css-1lliris erl5ymg4']")).getText();
		System.out.println(ActualEM);

		if (ExpectedEM.equals(ActualEM)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

		// Back Method:
		Thread.sleep(3000);
		driver.navigate().back();

		// Here, I'm getting a pop-up box which is not able to locate:

		// Element Present Test:
		Thread.sleep(30000);
		List<WebElement> Dept = driver.findElements(By.xpath("//div[@data-automation='dept-btn-text']"));
		if (Dept.size() > 0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Absent");
		}

		// Header List Test:
		Thread.sleep(3000);
		List<WebElement> header = driver.findElements(By.xpath("//div[@class='css-1lc0qxd e187axim2']//li"));
		System.out.println(header.size());
		for (WebElement a : header) {
			System.out.println(a.getText());
		}

		// WebElement Test:
		WebElement click1 = driver.findElement(By.xpath("//a[@id='departments-button']"));
		click1.click();

		// List from the box:
		Thread.sleep(3000);
		List<WebElement> select = driver.findElements(By.xpath("//div[@class='css-z0431s e1rio6v35']/div/div/ul/li"));
		System.out.println(select.size());
		System.out.println(select.get(16).getText());
		for (WebElement a : select) {
			System.out.println(a.getText() + "----------->" + a.isSelected());
		}

	}

}
