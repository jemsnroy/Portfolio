package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NikeLinkLoginErrorTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");

		WebElement fromHeader = driver.findElement(
				By.xpath("//div[@class='pre-l-wrapper mauto-sm d-sm-flx flx-dir-sm-r flx-jc-sm-sb flx-wr-sm-nw']"));
		List<WebElement> total = fromHeader.findElements(By.tagName("a"));
		System.out.println(total.size());
		// System.out.println(total.get(0).getText());
		for (int i = 0; i < total.size(); i++) {
			System.out.println(total.get(i).getText());
		}

		Thread.sleep(3000);
		driver.findElement(By.id("hf_title_signin_membership")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("adshfkdhf@hdvS");
		driver.findElement(By.name("password")).sendKeys("gjksfgdsfjjhdkg");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();

		Thread.sleep(3000);
		String ExpectedEM = "Please enter a valid email address.";
		String ActualEM = driver.findElement(By.className("error")).getText();
		System.out.println(ActualEM);
		if (ExpectedEM.equals(ActualEM)) {
			System.out.println("TestPassed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
