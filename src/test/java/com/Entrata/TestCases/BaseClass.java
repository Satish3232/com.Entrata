package com.Entrata.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.Entrata.Pages.SignInPage;


public class BaseClass {
	
	public WebDriver driver;
	public SignInPage lp;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.entrata.com/entrata/login");
	}

}
