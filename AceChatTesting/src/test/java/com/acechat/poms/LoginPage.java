package com.acechat.poms;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	@FindBy(id="username-box")
	private WebElement usernameBox;
	@FindBy(id="password-box")
	private WebElement passwordBox;
	@FindBy(id="login-button")
	private WebElement loginButton;
	@FindBy(id="create-account-link")
	private WebElement createAccountLink;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(usernameBox));
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(250))
				.withMessage("Sorry. The password box didn't appear in the allotted 5 seconds.");
		fluentWait.until(ExpectedConditions.visibilityOf(passwordBox));
	}
	
	public void login(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
	}
	
	public void loginByHittingEnterInPasswordBox(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password, Keys.ENTER);
	}
	
	public void createNewAccount() {
		createAccountLink.click();
	}
}
