package com.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
