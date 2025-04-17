package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchAmazon {
	@Test
	public void m2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("particular Method to execute");
		
	}
}
