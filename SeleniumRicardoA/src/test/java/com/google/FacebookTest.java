package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
  @Test
  public void setup() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("https://es-la.facebook.com/");
	  
	  // Locators
	  
//	  ID
//	  NAME
//	  LINK TEXT
//	  PARTIAL LINK TEXT
//	  CLASS NAME
//	  TAG NAME (CSS)
//	  CSS
//	  Xpath ---> Ruta Logica de un XML
	  
//	  	1- Xpath absoluto (Nunca usarlo como automatizadores)
	  
//	  	/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button
	  
//	  	2- Xpath relativo (Siempre utilizarlo como automatizadores)
	  
	  	//button[@name='login']
	  
	  driver.findElement(By.id("email")).sendKeys("automationtest@automation.com");
	  driver.findElement(By.id("pass")).sendKeys("automation123");
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  
	  driver.close();
	  
	  // Framework de pruebas
//	  TEST NG
	  
	  Assert.assertEquals("Hola", "Hello");
	  
	  
  }
}
