package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
public ResualtPage SearchForCourse()
{
	ClickOnBtn(SearchBtn);
	SetTextAndPressEnter(SearchBox,"Addition");
	
	//Here we will return new object from ResualtPage
	return new ResualtPage(driver);
}	
}
