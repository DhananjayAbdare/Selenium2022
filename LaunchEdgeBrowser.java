package selenium_java_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com"); 
	}

}
