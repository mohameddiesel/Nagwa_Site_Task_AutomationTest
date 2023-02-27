package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage extends PageBase {

	
	public CoursePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class='question-preview']//a")
	WebElement WorksheetSectionLink;
	
	public void GotoWorkSheetSection()
	{	
		ScrollDownAndClickOnTheElement(WorksheetSectionLink);
	}
	
	public int WorksheesSize()
	{
		//put all questions in one list and return the size
		List<WebElement>WorkSheetQuestiones = driver.findElements(By.xpath("//div[@class='one-part-question']"));
		return WorkSheetQuestiones.size();
	}
}
