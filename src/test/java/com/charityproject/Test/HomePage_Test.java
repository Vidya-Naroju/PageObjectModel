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

public class HomePage_Test extends Testbase {
	Home_page homepage;
	JobsSearch_page jobsearch ;
	Courses_page courses;
	TestUtil utils;

	public HomePage_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		utils=new TestUtil();
		// create objects of homepages
		homepage = new Home_page();
	}
	
	
	@Test(priority=1)
	public void homepageLogoTest() {
	boolean flag=homepage.verify_Logo();
	Assert.assertTrue(flag);
		
	}
	
	@Test(priority=2)
	public void HomepageTitleTest() {
		Assert.assertEquals(homepage.verify_pagetitle(),"The UK's largest specialist website for charity jobs, third sector and not-for-profit jobs| Find a career with meaning");
	}
	
	@Test(priority=3)
	public void JobsearchTest() {
		homepage.clickOnJobsearch();
	}

	@Test(priority=4)
	public void CourseTest() {
		homepage.clickOncourses();
	}
	
	@Test(priority=5)
	public void RegisterCVTest() {
		homepage.clickOnRegisterCV();
	}
	
	@Test(priority=6)
	public void clickOnSignInButtontest() {
		homepage.clickOnsigninButton();
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();

	}
}
