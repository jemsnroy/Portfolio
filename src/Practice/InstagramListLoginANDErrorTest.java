package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramListLoginANDErrorTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");

		String ExpectedURL = "https://www.instagram.com/";
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);

		if (ExpectedURL.equals(ActualURL)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(3000);

		WebElement specific = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]"));
		List<WebElement> total = specific.findElements(By.tagName("a"));
		System.out.println(total.size());
		System.out.println(total.get(0).getText());

		for (int i = 0; i < total.size(); i++) {
			System.out.println(total.get(i).getText());
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("jkgfsadskfvjn");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("ahfgdbhvhd");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]"))
				.click();
		
		Thread.sleep(3000);
		String ExpectedEM = "The username you entered doesn't belong to an account. Please check your username and try again.";
		String ActualEM = driver.findElement(By.id("slfErrorAlert")).getText();
		System.out.println(ActualEM);

		if (ActualEM.equals(ExpectedEM)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
