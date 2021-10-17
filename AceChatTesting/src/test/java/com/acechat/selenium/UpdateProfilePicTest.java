package com.acechat.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acechat.poms.LoginPage;
import com.acechat.poms.NewAccountPage;
import com.acechat.poms.SettingsPage;

public class UpdateProfilePicTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("MIKE-ST", "MIKE");		
		Assert.assertEquals("unsuccessfully redirected", "localhost:4200/friends", driver.getCurrentUrl());
	}
	
	@Test
	public void clickSettings() {
		SettingsPage settingsPage = new SettingsPage(driver);
		settingsPage.clickSettings();
		Assert.assertEquals("unsuccessfully redirected", "localhost:4200/settings", driver.getCurrentUrl());
	}
	
	@Test
	public void updateProfilePic() {
		SettingsPage settingsPage = new SettingsPage(driver);
		settingsPage.updateProfilePic("https://www.clipartmax.com/png/small/204-2047648_automation-test-logo-png.png");
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
