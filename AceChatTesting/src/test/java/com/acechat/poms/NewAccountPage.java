package com.acechat.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	@FindBy(id="username-box")
	private WebElement usernameBox;
	@FindBy(id="name-box")
	private WebElement nameBox;
	@FindBy(id="password-box")
	private WebElement passwordBox;
	@FindBy(id="profile-pic-box")
	private WebElement profilePicBox;
	@FindBy(id="create-account-button")
	private WebElement createAccountButton;
	
	public NewAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void createNewAccount(String username, String name, String password, String profilePicUrl) {
		usernameBox.sendKeys(username);
		nameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		profilePicBox.sendKeys(profilePicUrl);
		createAccountButton.click();
	}
}
