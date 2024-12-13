package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // Open Firefox
		driver.get("https://www.facebook.com/"); //Open Facebook
		
		//1. className: className attributes, space in the class name that's why this cann't be used directly.
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ccbdsjfhfjhk");
		// this code will throw an error that compound class name not permitted.
		
		//2. cssSelector: cssSelector attribute, we can not directly paste it for that we need to learn syntax. 
		//driver.findElement(By.cssSelector(null));
	
		//3. id: id attribute - working.
		//driver.findElement(By.id("email")).sendKeys("sjdfhksf");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sjdfhksf");
	
		//4. linkText: linkText attribute is only for link and in our tag there is no link.
		//driver.findElement(By.linkText(null));
		
		//5. name: name attribute - working.
		//driver.findElement(By.name("email")).sendKeys("jhsdfljkh");
		
		//6. partialLinkText: partialLinkText is only for link. 
		//driver.findElement(By.partialLinkText(null)));
	
		//7. tagName: tagName attribute will only work if your tagName is unique or it's first in order.
		//driver.findElement(By.tagName("input")).sendKeys("sdfbsdfjh");
		
		//8. xpath: for this we need to learn syntax.
		//driver.findElement(By.xpath(null));
		
		//PASSWORD
		//driver.findElement(By.name("pass")).sendKeys("dsgsadhgasdgsadhgsd");
			
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("dsgsadhgasdgsadhgsd");
		
		//Login Button
		//driver.findElement(By.name("login")).click();

		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
	}

}
