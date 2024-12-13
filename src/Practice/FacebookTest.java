package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		// driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		System.out.println(actualURL);
		if (actualURL.equals(expectedURL)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(2000);
		List<WebElement> li1 = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(li1.size());
		for (WebElement b : li1) {
			System.out.println(b.getText());
		}

		// driver.findElement(By.id("email")).sendKeys("sefgjfgfkjfgf");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("afhgsfjk");
		// driver.findElement(By.id("passContainer")).sendKeys("afjgfjsfg");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("jgshdkgj");

		// driver.findElement(By.name("login")).click();
		WebElement ck = driver.findElement(By.name("login"));
		ck.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		String actualEM = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
		String expectedEM = driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		if (actualEM.equals(expectedEM)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		driver.navigate().back();

		Thread.sleep(2000);
		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Passed ");
		} else {
			System.out.println("Test Failed");
		}
		driver.findElement(By.linkText("Create new account")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Roy");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("gfakdfjg@SDF");

		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select mo = new Select(month);
		mo.selectByVisibleText("Feb");

		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("day"));
		Select dt = new Select(date);
		dt.selectByVisibleText("20");

		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2000");

		List<WebElement> li = driver.findElements(By.xpath("//span[@data-type='radio']/span"));
		System.out.println(li.size());
		for (WebElement a : li) {
			System.out.println(a.getText());
		}

		li.get(1).click();

		driver.findElement(By.name("websubmit")).click();
	}

}
