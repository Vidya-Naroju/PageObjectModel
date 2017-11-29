package com.charityproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.charityproject.Testbase.Testbase;

public class RegisterCV_page extends Testbase{

	@FindBy(id="email")
	WebElement EmailAddress;
	
	@FindBy(id="FirstName")
	WebElement Firstname;
	
	@FindBy(id="Surname")
	WebElement Surname;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="password2")
	WebElement password2;
	
	@FindBy(name="CvFile")
	WebElement CVUpload;
		
	@FindBy(xpath="//input[@value='true']")
	WebElement radioButton;
	
	@FindBy(xpath="//input[@type='submit' and @value='Register']")
	WebElement SubmitRegister;
	
	@FindBy(className="btn button-tertiary ga-candidate-sign-in")
	WebElement Signin;
	

	public RegisterCV_page() {
		PageFactory.initElements(driver, this);
	}
	

	public void EnterFirstname(String FirstName) {
		Firstname.sendKeys(FirstName);
	}
	//this is relate/points to the local variable
	public void EnterSurname(String Surname) {
		this.Surname.sendKeys(Surname);
	}

	public void EnterEmailId(String Emailid) {
		EmailAddress.sendKeys(Emailid);
	}
	public void EnterPassword(String Password) {
		this.Password.sendKeys(Password);
	}
	
	public void EnterConfirmPassword(String confirmPassword) {
		 password2.sendKeys(confirmPassword);
	}
	
	public void UploadCV() {
		
	}
	
	public void Radiobutton1() {
		Testbase.scrollintoview(radioButton);
		System.out.println("not working");
		radioButton.click();
	}
	
	public void Submit() {
		Testbase.scrollintoview(SubmitRegister);
		SubmitRegister.click();
		
	}
	
	
	public signin_page ClickonSignIn() {
		Signin.click();
		return new signin_page();
		
	}
	
}
