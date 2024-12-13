package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	//We learn about the how to find the total number of rows and column through the nested for-loop from any web site.
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.w3schools.com/html/default.asp");
		
		driver.findElement(By.linkText("HTML Tables")).click();
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(column.size());
		
		for(int i=2;i<=row.size();i++) {
			for(int j=1;j<=column.size();j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("|");
			}
			System.out.println();
		}
		
	}

}
