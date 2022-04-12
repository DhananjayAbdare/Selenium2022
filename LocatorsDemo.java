package selenium_java_project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();  
		driver.get("https://www.google.com"); 							
		driver.get("https://kite.zerodha.com");    // Here we achieve overloading using get() method
		
// locator used as id
		
		WebElement userid = driver.findElement(By.id("userid"));	
		userid.sendKeys("ES0881");
	  //driver.findElement(By.id("userid")).sendKeys("ES0881");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abdare111");
		
// locator used as tagName and className
	
	  //WebElement LoginBtn = driver.findElement(By.tagName("button"));
		WebElement LoginBtn = driver.findElement(By.className("button-orange"));
		LoginBtn.click();
		
		List <WebElement> Links = driver.findElements(By.tagName("a"));   // To find no.of links on the WebPage Zerodha
		System.out.println(Links.size());
		
		driver.get("https://www.facebook.com");
		List <WebElement> LinksFB = driver.findElements(By.tagName("a"));  // To find no.of links on the WebPage Facebook
		System.out.println(LinksFB.size());
	

	}

}