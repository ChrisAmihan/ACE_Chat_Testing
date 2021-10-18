package com.acechat.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acechat.poms.LoginPage;
import com.acechat.poms.NewAccountPage;

public class CreateNewAccountTest {
	
	private static WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);
	NewAccountPage newAccountPage = new NewAccountPage(driver);
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://acechat2021.s3-website-us-east-1.amazonaws.com");
	}
	
	@Test
	public void redirectToCreateNewAccountPage() {
		loginPage.createNewAccount();
		Assert.assertEquals("unsuccessfully redirected", "http://acechat2021.s3-website-us-east-1.amazonaws.com/new-user", driver.getCurrentUrl());
	}
	
	@Test
	public void createNewAccount() {
		//NewAccountPage newAccountPage = new NewAccountPage(driver);
		newAccountPage.createNewAccount("TestUser3", "TestName3", "TestPass3", "");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		Assert.assertEquals("unsuccessfully redirected", "http://acechat2021.s3-website-us-east-1.amazonaws.com/new-user", driver.getCurrentUrl());
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
