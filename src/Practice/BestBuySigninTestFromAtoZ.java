package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuySigninTestFromAtoZ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.bestbuy.ca/identity/en-ca/signin?tid=KO3xQpOVPdchctTy2M0cKtdWk1WyPBXHjfjOdQhVwQB6aHuslhQM5U1uHiANDG%252BJFsgKiGSRz6GUKwpviAdmqC6x8WocPgBs1UDI5ObKkxwLachsJJjumKYqaezHRQ5rYcVgMT3Ce135UgDqPWk3bP1E%252FElXQKMhYoR6obSirEVEBUKVdrHYi0P24DxBk%252FFtZk2rzuxHH8PLOJvb3b%252FaHTg7ZSkSNzJn4Pu8lIn%252FlbzSdIEuP79gwN3jV5NfVL3NFaS0%252BUWzptPuTcSPnxNtZfVD%252FZOd5ZXdFezfpF9Sl%252BLPzx3F6fyfgdzigegmMzYR");
		// Email:

		// by Name:
		// driver.findElement(By.name("username")).sendKeys("sdkjfhsj");

		// id:
		driver.findElement(By.id("username")).sendKeys("jKDGS@aaugd");

		// xpath: Abs. xpath:
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("eufyewoiuyewo");

		// xpath: Att. xpath:
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shjgfskjf");

		// Password:
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("djagdjgd");

		// sign in:
		driver.findElement(By.className("GSYpm")).click();

		Thread.sleep(3000);

		String expectedEM = "Please enter a valid email address.";
		String actualEM = driver.findElement(By.className("error-msg")).getText();
		System.out.println(actualEM);
		
		if(expectedEM.equals(actualEM)) {
			System.out.println("TestPass.");
		}
		else{
			System.out.println("TestFailed");
		}
	}

}
