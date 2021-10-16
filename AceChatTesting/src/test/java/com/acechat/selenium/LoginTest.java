package com.acechat.selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acechat.poms.LoginPage;

public class LoginTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
	}
	
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("ethan", "e");		
		Assert.assertEquals("unsuccessfully redirected", "http://localhost:4200/login", driver.getCurrentUrl());
	}
	
	@AfterClass
	public static void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
