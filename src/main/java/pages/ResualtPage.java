package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResualtPage extends PageBase {

	public ResualtPage(WebDriver driver) {
		super(driver);
	}

	//select the secoundCourse only as the Task Requirement
	WebElement SecoundCourse = driver.findElement(By.xpath("//div[@class='results']//ul//li[2]//a"));

	public void ChooseTheSecoundCourse()
	{
		ScrollDownAndClickOnTheElement(SecoundCourse);
	}
	
}
