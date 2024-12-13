package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S1476480780%3A1663531220306931&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqfZ6268xceHL-dTyRArOjtepV_J4etNQH64oOfADrdpCS5M3duocLSuDUuBL3X78i-yyE2YQ");

		driver.findElement(By.linkText("Help")).click();

		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());

		Iterator<String> itr = allWindows.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);

		driver.switchTo().window(childWindow); // Handle of Window
		System.out.println(driver.getTitle()); // Help Page

		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle()); // Gmail Page
		driver.quit();

	}

}
