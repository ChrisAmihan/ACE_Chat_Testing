package com.acechat.selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acechat.poms.LoginPage;
import com.acechat.poms.NewAccountPage;

public class CreateNewAccountTest {
private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
	}
	
	@Test
	public void redirectToCreateNewAccountPage() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.createNewAccount();
		Assert.assertEquals("unsuccessfully redirected", "http://localhost:4200/new-user", driver.getCurrentUrl());
	}
	
	@Test
	public void createNewAccount() {
		NewAccountPage newAccountPage = new NewAccountPage(driver);
		newAccountPage.createNewAccount("TestUser", "TestName", "TestPass", "");
		Assert.assertEquals("unsuccessfully redirected", "http://localhost:4200/login", driver.getCurrentUrl());
	}
	
	@AfterClass
	public static void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
