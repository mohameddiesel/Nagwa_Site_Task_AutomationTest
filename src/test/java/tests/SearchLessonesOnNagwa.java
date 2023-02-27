package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CoursePage;
import pages.HomePage;
import pages.PageBase;
import pages.ResualtPage;

public class SearchLessonesOnNagwa extends TestBase{
	
	PageBase pageBaseObj ;
	HomePage HomePageObj ;
	ResualtPage ResObj ;
	CoursePage CoursePageObj ;

	@Test
	public void ValidateTheSearchQuarey ()
	{		
		HomePageObj=new HomePage(driver);
		ResObj=HomePageObj.SearchForCourse();
	
		ResObj.ChooseTheSecoundCourse();
		
		CoursePageObj = new CoursePage(driver);
		CoursePageObj.GotoWorkSheetSection();
		
		//validate that worksheet has 10 question
		Assert.assertEquals(CoursePageObj.WorksheesSize(), 10);	
	}
}
