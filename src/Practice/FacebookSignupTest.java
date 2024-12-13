package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		WebElement signup = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		signup.click();

		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Roy");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("flkjsdhfsjkf");

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);

		s.selectByValue("10");

		Thread.sleep(3000);
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);

		s1.selectByIndex(15);

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);

		s2.selectByVisibleText("2021");

		Thread.sleep(3000);
		List<WebElement> rb = driver.findElements(By.xpath("//span[@class='_5k_3']/span"));
		System.out.println(rb.size());
		for(int i = 0;i<rb.size();i++) {
			System.out.println(rb.get(i).getText());
		}

		Thread.sleep(3000);
		rb.get(1).click();
		
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.name("websubmit"));
		click.click();

	}

}
