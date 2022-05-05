package com.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private WebDriver driver;
	
	/**
	 * Constructor SeleniumWrapper Class 
	 * @author Ricardo Avalos 
	 * @param driver
	 * @return N/A
	 * @throws N/A
	 */
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Launch browser
	 * @author ricardo.avalos
	 * @param
	 * @return
	 * @throws
	 * @date
	 */
	public WebDriver setupChromeDriver() {
		 ChromeOptions chromeOpt = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();		  
		 driver = new ChromeDriver(chromeOpt);
		 return driver;
	}
	
	/*
	 * Launch browser
	 * @author ricardo.avalos
	 * @param
	 * @return
	 * @throws
	 * @date
	 */
	public void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	/*
	 * Type text into text box object
	 * @author ricardo.avalos
	 * @param locator
	 * @param inputText
	 * @return
	 * @throws
	 * @date
	 */
	public void type(By locator, String inputText) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * Click object
	 * @author ricardo.avalos
	 * @param
	 * @return
	 * @throws
	 * @date
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/*
	 * Driver close
	 * @author ricardo.avalos
	 * @param
	 * @return
	 * @throws
	 * @date
	 */
	public void closeBrowser() {
		driver.close();
	}

}
