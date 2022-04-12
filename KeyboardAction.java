package selenium_java_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		UserName.sendKeys("Dhananjay Abdare");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("dhananjayabdare11@gmail.com");
		
		WebElement CurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAdd.sendKeys("Sasane-Colony Shinde-Angan, Kolhapur-416001");
		
		Actions action = new Actions(driver);
		
// Selecting the current address	
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
// Copy the selected address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("C");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
// Move from one field to another field
		action.sendKeys(Keys.TAB).perform();
		//action.build().perform();
		
// Paste the selected address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
// Move from one field to another field
		action.sendKeys(Keys.TAB).perform();
		//action.build().perform();

// Click on submit button
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));		
		//action.click(SubmitBtn).perform();
		SubmitBtn.click();
		
	}

}