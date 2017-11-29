package com.charityproject.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.charityproject.Testbase.Testbase;
import com.charityproject.pages.Courses_page;
import com.charityproject.pages.Home_page;
import com.charityproject.pages.JobsSearch_page;
import com.charityproject.pages.RegisterCV_page;
import com.charityproject.utils.TestUtil;

public class RegisterCV_Test extends Testbase {
	Home_page homepage;
	JobsSearch_page jobsearch;
	Courses_page courses;
	RegisterCV_page register;
	TestUtil utils;
	String sheetName = "Charity_registration";

	public RegisterCV_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();

		// create objects of homepages
		homepage = new Home_page();
		utils = new TestUtil();
		register = homepage.clickOnRegisterCV();
	}

/*	@Test(priority = 1)
	public void VerifyRegisterPage() {
		Assert.assertTrue(driver.getCurrentUrl().contains("candidateregister"), "candidateregister");
	}*/

	@DataProvider(name="register")
	public Object[][] getRegisterTestdata() {
		Object data[][] = TestUtil.getTestData(sheetName);
		System.out.println(data);
		return data;
	
	}

	@Test(dataProvider="register")
	public void registerDetails(String FirstName, String Surname, String Emailid, String Password,
			String confirmPassword) throws InterruptedException {
		System.out.println("entered into register method");
		register.EnterFirstname(FirstName);
		register.EnterSurname(Surname);
		register.EnterEmailId(Emailid);
		register.EnterPassword(Password);
		register.EnterConfirmPassword(confirmPassword);
		register.UploadCV();
		Thread.sleep(4000);
		// register.Radiobutton1();
		Thread.sleep(4000);
		register.Submit();

	}

}
