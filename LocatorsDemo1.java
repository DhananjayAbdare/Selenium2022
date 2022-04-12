package selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
// locators used as name
		
		WebElement EmailAdd = driver.findElement(By.name("email"));
		EmailAdd.sendKeys("dhananjayabdare11@gmail.com");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("Kaju@2017");
		
		//WebElement LoginBtn = driver.findElement(By.name("login"));
		//LoginBtn.click();

// locators- link text
		//WebElement ForgotPassword = driver.findElement(By.linkText("Forgotten password?"));
		//ForgotPassword.click();
		
// locators- partial link text
		WebElement PartialFgotPassword = driver.findElement(By.partialLinkText("Forgott"));
		PartialFgotPassword.click();
	
		driver.get("https://kite.zerodha.com");
	
// locators- linkText and partialLinkText used for Zerodha WebPage
		//WebElement ForgotPass = driver.findElement(By.linkText("Forgot user ID or password?"));
		//ForgotPass.click();
		                                                                                                                                                                                                                                                                                              
		//WebElement PartialFgotPass = driver.findElement(By.partialLinkText("user"));
		//PartialFgotPass.click();
		
// locators- cssSeletor
		
		WebElement userid = driver.findElement(By.cssSelector("input#userid"));  // id attribute
		userid.sendKeys("ES0881");
		
		WebElement PassWord = driver.findElement(By.cssSelector("input[type='password']"));  // other attribute
		PassWord.sendKeys("abdare111");
		
		WebElement LoginBtn = driver.findElement(By.cssSelector("button.button-orange.wide"));  //classname attribute
		LoginBtn.click();
		
		Thread.sleep(2000);
		WebElement PIN = driver.findElement(By.cssSelector("input[autofocus='autofocus']"));
		PIN.sendKeys("123456");
		
		WebElement ContinueBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		ContinueBtn.click();
		
		
	}

}
