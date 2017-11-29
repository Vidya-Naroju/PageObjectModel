package com.charityproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.charityproject.Testbase.Testbase;

public class signin_page extends Testbase{
	@FindBy(className="UserName")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	
	@FindBy(partialLinkText="Forgotten your password?")
	WebElement ForgottenPassword;
	
	@FindBy(id="submit")
	WebElement Signin_SubmitS;
	
	@FindBy(className="btn btn-primary")
	WebElement Register;
	
	
}
