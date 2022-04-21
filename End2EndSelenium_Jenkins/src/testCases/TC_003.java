package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void tc_001() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Namma");
		driver.findElement(By.id("pass")).sendKeys("Bengaluru");
		driver.quit();
		
	}

}
