package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver ; //this is the actual driver which is running
	@BeforeSuite
	public void SetupEnv () //we Setup the environment here
	{
		String chromePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nagwa.com/en/");
	}
	@AfterSuite
	public void Quit()
	{
		driver.quit();
		}

}
