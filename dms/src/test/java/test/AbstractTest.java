package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://akademijait.vtmc.lt:8180/dvs/#/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
