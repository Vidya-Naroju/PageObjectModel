package com.charityproject.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.charityproject.Testbase.Testbase;

public class Home_page extends Testbase{
	
	@FindBy(className="ga-homepage-charityjob")
	WebElement CharityLogo;
	
	@FindBy(xpath="//a[@href='/jobs']")
	WebElement Job_search;
	
	@FindBy(xpath="//a[@href='/courses']")
	WebElement Courses;
	
	@FindBy(linkText="Register")
	WebElement RegisterCV;
	
	@FindBy(className="sign-in")
	WebElement SignIn;
	
	
	public Home_page() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verify_Logo() {
		return CharityLogo.isDisplayed();
	}
	
	public String verify_pagetitle() {
		return driver.getTitle();
		
	}
	public JobsSearch_page clickOnJobsearch() {
	Job_search.click();
	return new JobsSearch_page();
	}
	
	public Courses_page clickOncourses() {
		Courses.click();
		return new Courses_page();
	}
	
	public RegisterCV_page clickOnRegisterCV() {
		RegisterCV.click();
		return new RegisterCV_page();
	}
	
	public signin_page clickOnsigninButton() {
		SignIn.click();
		return new signin_page();
		
	}
	
	
	

}
