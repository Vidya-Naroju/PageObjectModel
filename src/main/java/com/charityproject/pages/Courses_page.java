package com.charityproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.charityproject.Testbase.Testbase;

public class Courses_page extends Testbase {

	@FindBy(id="keywords")
	WebElement EnterJobType;
	
	@FindBy(id="location")
	WebElement EnterJobLocation;
	
	@FindBy(className="ga-create-event")
	WebElement Search;
	
		
	//create constructor in order to run the 
	public Courses_page() {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterSearchKeyword(String keyword,String location) {
		EnterJobType.sendKeys(keyword);
		EnterJobLocation.sendKeys(location);
		Search.click();
		Assert.assertEquals(driver.getCurrentUrl().contains(keyword), true);
		Assert.assertEquals(driver.getCurrentUrl().contains(location), true);
				
	}
	

	
	
}
