package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchFlipkart {

	
	@Test
	public void m3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		System.out.println("particular Method to execute");
		
	}
}
