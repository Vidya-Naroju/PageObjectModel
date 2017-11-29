package com.charityproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.charityproject.Testbase.Testbase;
import com.sun.corba.se.spi.orbutil.fsm.Action;

public class JobsSearch_page extends Testbase {
	
	@FindBy(xpath=".//*[@id='pinned1']/div[2]/div[1]/a/img")
	WebElement CharityLogo;
	
	@FindBy(xpath="html/body/header/div[1]/div/ul/li[1]/a[1]")
	WebElement RegisterCV1;
	
	@FindBy(xpath=".//*[@id='navigation']/li[3]/a")
	WebElement VolunteerRoles;
	
	@FindBy(xpath=".//*[@id='navigation']/li[4]/a")
	WebElement Courses1;
	
	@FindBy(xpath="//a[@href='/careeradvice']")
	WebElement CareerAdvice;
	
	@FindBy(className="ga-standart-search")
	WebElement StandardSearch;
	
	@FindBy(className="ga-advanced-search")
	WebElement AdvancedSearch;
	
	@FindBy(partialLinkText="Category")
	WebElement Category;
	
	@FindBy(partialLinkText="Location")
	WebElement Location;
	
	@FindBy(partialLinkText="By Salary")
	WebElement BySalary;
	
	@FindBy(partialLinkText="Sector")
	WebElement Sector;
	
	@FindBy(partialLinkText="Contract")
	WebElement Contract;
	
	@FindBy(partialLinkText="Employer")
	WebElement Employer;
	
	@FindBy(partialLinkText="Job level")
	WebElement JobLevel;
	
	@FindBy(partialLinkText="Apply Filters")
	WebElement ApplyFilters;
	
	@FindBy(className="button secondary open-alert ga-create-alert")
	WebElement Alert_Me_To_Jobs_Like_Thses;
	
	@FindBy(partialLinkText="Sort by:")
	WebElement SortByLabel;
	
	@FindBy(className="ui-selectmenu-text")
	WebElement Date_Posted;
	
	@FindBy(partialLinkText="Find a charity job")
	WebElement Find_A_Charity_Job;
	
	@FindBy(id="keywords")
	WebElement EnterJob;
	
	@FindBy(id="location")
	WebElement EnterJobLocation;
	
	@FindBy(id="submitJobSearch")
	WebElement Search;
	
	public JobsSearch_page() {
	 
		PageFactory.initElements(driver, this);
	}
	//verify logo
	public  boolean  verifylogo() {
		return CharityLogo.isDisplayed();
	}
	
	//click on registerCV
	public RegisterCV_page clickOnRegisterCV() {
		RegisterCV1.click();
		return new RegisterCV_page();
	}
	
	//click on volunteerrole
	public VolunteerRole_page clickOnVolunteer() {
		VolunteerRoles.click();
		return new VolunteerRole_page();
	}
	
	//click on course button
	public Courses_page clickOncourses() {
		Courses1.click();
		return new Courses_page();
	}
	
	//click on Career advice
	public CareerAdvice_page clickOnCareerAdvice() {
		CareerAdvice.click();
		return new CareerAdvice_page();
		}
	
	public void clickonStandardSearch() {
		StandardSearch.click();
			}
	
	public void select_category() {
		Category.click();
		Select sel=new Select(Category);
		sel.selectByVisibleText("Admin (257)");
	}
	
	public void select_location() {
		Location.click();
		Select sel=new Select(Location);
		sel.selectByVisibleText("East Midlands (53)");
	}
}
