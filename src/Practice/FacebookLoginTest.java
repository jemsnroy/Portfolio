package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> listofpage = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li"));
		System.out.println(listofpage.size());
		System.out.println(listofpage.get(0).getText());
		
		for(WebElement a : listofpage) {
			System.out.println(a.getText());
		}
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("fhjdgkdshgk@ksjfhakjf");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ajfkhfjkfh");
		
		WebElement login = driver.findElement(By.name("login"));
		login.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		String ExpectedEm = "The email or mobile number you entered isn’t connected to an account. Find your account and log in."; 
		String actualEm = driver.findElement(By.xpath("(//div[@id='email_container'])/div[2]")).getText();
		System.out.println(actualEm);
		
		if(ExpectedEm.equals(actualEm)) {
			System.out.println("Test paased");
		}else {
			System.out.println("Test Failed");
		}
	}

}
