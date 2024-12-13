package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestHW {

	public static void main(String[] args) throws InterruptedException {
/*36
 * selected Item
 * ----------After Selection---------
 * selected Item
 * ----------After Selection---------
 * selected Item
 * ----------After Selection---------*/
	
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allOption = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOption.size());

		
		WebElement box = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select s = new Select(box);
		
		Thread.sleep(3000);
		s.selectByIndex(2);
		String s1 = driver.findElement(By.xpath("//option[@value='550']")).getText();
		System.out.println(s1);
		System.out.println("----------After Selection---------");
		
		Thread.sleep(3000);
		s.selectByIndex(4);
		String s2 = driver.findElement(By.xpath("//option[@value='2984']")).getText();
		System.out.println(s2);
		System.out.println("----------After Selection---------");

		Thread.sleep(3000);
		s.selectByIndex(5);
		String s3 = driver.findElement(By.xpath("//option[@value='267']")).getText();
		System.out.println(s3);
		System.out.println("----------After Selection---------");

	}

}
