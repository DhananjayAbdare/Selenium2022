package selenium_java_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // OR ChromeDriver driver = new ChromeDriver(); --------IMP
	//  ChromeDriver driver = new ChromeDriver();
		
//WebDriver-Interface Methods
		driver.get("https://www.google.com");   							 // 1 way to pass or launch URL
		
		//Navigation commands	
		driver.navigate().to("https://www.facebook.com");					 // 2 way to pass URL
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);            // 2 sec.script delay
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
//JavascriptExecutor-Interface
		JavascriptExecutor js = (JavascriptExecutor)driver; 		//Type casting
		js.executeScript("window.location='https://kite.zerodha.com'");		 // 3 way to pass URL
		
		Thread.sleep(2000);
		driver.quit();

	}

}
