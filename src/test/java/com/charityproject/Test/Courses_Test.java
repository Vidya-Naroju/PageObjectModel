package com.charityproject.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.charityproject.Testbase.Testbase;
import com.charityproject.pages.Courses_page;
import com.charityproject.pages.Home_page;
import com.charityproject.pages.JobsSearch_page;
import com.charityproject.utils.TestUtil;

public class Courses_Test extends Testbase {
	Home_page homepage;
	JobsSearch_page jobsearch ;
	Courses_page courses;
	TestUtil utils;


public Courses_Test() {
	super();
}

@BeforeMethod
public void Setup() {
	initialization();
	homepage=new Home_page();
	utils= new TestUtil();
	courses=homepage.clickOncourses();
	//courses=jobsearch.clickOncourses();
}

@Test
public void clickonsearch() {
	courses.EnterSearchKeyword("testing", "london");
	}
}
