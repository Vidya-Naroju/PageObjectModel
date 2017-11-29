package com.charityproject.Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.charityproject.Testbase.Testbase;
import com.charityproject.pages.Courses_page;
import com.charityproject.pages.Home_page;
import com.charityproject.pages.JobsSearch_page;
import com.charityproject.utils.TestUtil;

public class JobSearch_Test extends Testbase {
	Home_page homepage;
	JobsSearch_page jobsearch ;
	Courses_page courses;
	TestUtil utils;


	public JobSearch_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new Home_page();
		utils= new TestUtil();
		//calling jobsearch  
		jobsearch = homepage.clickOnJobsearch();
	}
	
	@Test(priority=1)
	public void verifyCharityLogo() {
	boolean flag= jobsearch.verifylogo();
	Assert.assertTrue(flag);
	
	}
	
	
	@Test(priority = 2)
	public void RegisterCVTest1() {
		jobsearch.clickOnRegisterCV();
	}
	
	@Test(priority = 3)
	public void VolunteerTest() {
		jobsearch.clickOnVolunteer();
	}
		
	/*@Test(priority = 4)
	public void CoursesTest() {
		jobsearch.clickOncourses();
	}
	
	@Test(priority = 5)
	public void CareeradviceTest() {
		jobsearch.clickOnCareerAdvice();
	}
	
	@Test(priority=6)
	public void StandardSearchTest() {
		jobsearch.clickonStandardSearch();
		jobsearch.select_category();
		jobsearch.select_location();
	}*/

	@AfterMethod
	public void tear() {
		driver.quit();
	}
}
