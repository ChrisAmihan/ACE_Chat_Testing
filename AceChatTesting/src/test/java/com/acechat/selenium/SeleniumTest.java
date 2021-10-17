package com.acechat.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acechat.poms.FriendsPage;
import com.acechat.poms.LoginPage;

public class SeleniumTest {
	
	private static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		
		WebElement usernameBox = driver.findElement(By.id("username-box"));
		
		usernameBox.sendKeys("ethan");
		
		WebElement passwordBox = driver.findElement(By.id("password-box"));
		
		passwordBox.sendKeys("e");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		loginButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		driver.quit();
	}
	
}
