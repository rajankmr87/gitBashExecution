package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {

	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(groups = {"smokeTest","regressionTest","sanityTest"})
	public void beforeSuite()
	{
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups = {"smokeTest","regressionTest","sanityTest"})
	public void beforeTest()
	{
		System.out.println("Parallel Exceution ");
	}
	
//	@Parameters("BROWSER")
	@BeforeClass/*(groups = {"smokeTest","regressionTest","sanityTest"})*/
	public void beforeClass() throws Throwable
	{
//		File_Utility flib = new File_Utility();
//		String BROWSER = flib.getKeyAndValuePair("browser");
		
		//cmd prompt
		String BROWSER = System.getProperty("browser");
		System.out.println("launching browser");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		
		}
		sdriver=driver;
	}
	

}