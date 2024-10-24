package com.Entrata.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Entrata.Pages.SignInPage;

public class SignInPageTestCases extends BaseClass {
	
	@Test(priority=1)
	
	public void verifyUrl() {
		
		String url = lp.getUrl();
		Assert.assertTrue(url.contains("Sso login"));
		System.out.println("URL is valid: " + url);
		
	}
	
	@Test(priority=2)

	
	public void verifyTitel() {
		
		String Title = lp.getAppTitle();
		Assert.assertTrue(Title.contains("Sign in to Entrata"));
		System.out.println("Title is valid: " + Title);
		
	}
	
	@Test(priority=3)
	
	public void LoginTest() {
		
		lp.dosignin("Student", "Password123");
		Assert.assertTrue(driver.getCurrentUrl().contains("The username and password provided are not valid. Please try again."));
		System.out.println("Pass: Login Completed " );
		
		
		
	}
	
	@Test(priority=4)
	
	public void negativeUserenameTest() {
		
		lp.dosignin("IncorrectUser", "Password123");
		Assert.assertTrue(driver.getCurrentUrl().contains("The username and password provided are not valid. Please try again."));
		System.out.println("Pass: Username is  incorrect" );
		
		
		
	}
	
	@Test(priority=5)
	
	public void negativePasswordTest() {
		
		lp.dosignin("Student", "Incorrectpassword");
		Assert.assertTrue(driver.getCurrentUrl().contains("The username and password provided are not valid. Please try again."));
		System.out.println("Pass: Password is  incorrect " );
	
		
		
	}

}
