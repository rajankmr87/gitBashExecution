package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstCodeTest {

//	public static void main(String[] args) {
//	
//		System.out.println("This is the First Code");
//	}

	
	@Test
	public void m1()
	{
		String URL = System.getProperty("url");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		System.out.println("particular Method to execute");
		
	}
}


