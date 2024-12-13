package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		
		//click on the create new account:
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]"))
				.click();
		
		Thread.sleep(4000);
		
		//add lastname
		//enter 10 digit mobile number.
		//enter password.
		//Select July
		//Select 10
		//Select 2000
		
		//click on male button.
		
		//click on signup.
		//driver.findElement(By.name("firstname")).sendKeys("jemish");
		driver.findElement(By.name("lastname")).sendKeys("Roy");
		driver.findElement(By.name("reg_email__")).sendKeys("6546546546");
		driver.findElement(By.id("password_step_input")).sendKeys("ajkhsdfjkh");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("7");
		
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s2 = new Select(date);
		s2.selectByValue("10");
		
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("2000");
	
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@data-type='radio']/span"));
		System.out.println(list.size());
		for(WebElement a : list) {
			System.out.println(a.getText());
		}
		
		Thread.sleep(3000);
		
		list.get(1).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")).click();

	}
}
