package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginANDListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-1861665770%3A1662524261486552&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmVT7Ybpoqbx_p19MVxpeT5gNpShgOOzWgvgHEBMiu8rW8N997XwYEJ4dYto6SJKI3VGszSVRw");

		driver.findElement(By.id("identifierId")).sendKeys("ahjbsf");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		Thread.sleep(3000);
		String ExpectedEM = "Couldn’t find your Google Account";
		String ActualEM = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(ActualEM);
		
		if(ExpectedEM.equals(ActualEM)) {
			System.out.println("Test Passed");
		}
		Thread.sleep(3000);
		List<WebElement> total = driver.findElements(By.tagName("a"));
		System.out.println(total.size());
		System.out.println(total.get(1).getText());
		
		for(int i =0;i<total.size();i++) {
			System.out.println(total.get(i).getText());
		}

	}

}
