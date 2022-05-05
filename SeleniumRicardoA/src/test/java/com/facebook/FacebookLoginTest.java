package com.facebook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.poc.FacebookLoginPage;

public class FacebookLoginTest {
	
	WebDriver driver;
	Base base;
	FacebookLoginPage facebookLogin;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.setupChromeDriver();
		facebookLogin = new FacebookLoginPage(driver);
		System.out.println("BeforeTest");
	}

	@Test
	public void tc001() {
		
		System.out.println("TC001");
		
		base.launchBrowser("");
		
		facebookLogin.loginFacebook("", "");
	}

	@Test
	public void tc002() {
		System.out.println("TC002");
	}

	@Test
	public void tc003() {
		System.out.println("TC003");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

}
