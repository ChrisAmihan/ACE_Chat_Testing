package com.acechat.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acechat.poms.FriendsPage;
import com.acechat.poms.LoginPage;

public class LoginTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://acechat2021.s3-website-us-east-1.amazonaws.com/");
	}
	
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("ethan", "e");
		WebDriverWait wait2 = new WebDriverWait(driver, 3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("unsuccessfully redirected", "http://acechat2021.s3-website-us-east-1.amazonaws.com/login", driver.getCurrentUrl());
	}
	
	@Test
	public void logout() {
		FriendsPage friendsPage = new FriendsPage(driver);
		WebDriverWait wait2 = new WebDriverWait(driver, 3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		friendsPage.logout();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("unsuccesfully redirected", "http://acechat2021.s3-website-us-east-1.amazonaws.com/login", driver.getCurrentUrl());
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
