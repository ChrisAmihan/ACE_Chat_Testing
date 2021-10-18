package com.acechat.gluecode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acechat.poms.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberLoginTest {

	private static WebDriver driver;
	
	@Given("a user is on the login page of Ace Chat")
	public void a_user_is_on_the_login_page_of_ace_chat() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user inputs the correct username and password")
	public void the_user_inputs_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage loginPage = new LoginPage(driver);
		WebElement usernameBox = driver.findElement(By.id("username-box"));
		usernameBox.sendKeys("ethan");
		
		WebElement passwordBox = driver.findElement(By.id("password-box"));
		passwordBox.sendKeys("e");
		
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user is redirected to the main page")
	public void the_user_is_redirected_to_the_main_page() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage loginPage = new LoginPage(driver);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	    throw new io.cucumber.java.PendingException();
	}

}
