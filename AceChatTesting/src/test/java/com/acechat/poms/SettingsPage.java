package com.acechat.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	
	@FindBy(id="profile-pic-box")
	private WebElement profilePicBox;
	@FindBy(id="update-profile-pic-button")
	private WebElement updateProfilePicButton;
	@FindBy(id="name-box")
	private WebElement nameBox;
	@FindBy(id="password-box")
	private WebElement passwordBox;
	@FindBy(id="update-password-and-name-button")
	private WebElement updatePasswordAndNameButton;
	@FindBy(id="friends-link")
	private WebElement friendsLink;
	@FindBy(linkText="Settings")
	private WebElement settingsLink;
	@FindBy(id="logout-button")
	private WebElement logoutButton;
	
	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void updateProfilePic(String profilePic) {
		profilePicBox.sendKeys(profilePic);
		updateProfilePicButton.click();
	}
	
	public void updatePasswordAndName(String name, String password) {
		nameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		updatePasswordAndNameButton.click();
	}
	
	public void updatePasswordOnly(String password) {
		passwordBox.sendKeys(password);
	}
	
	public void updateNameOnly(String name) {
		nameBox.sendKeys(name);
	}
	
	public void logout() {
		logoutButton.click();
	}
	
	public void clickSettings() {
		settingsLink.click();
	}
	
	public void clickFriends() {
		friendsLink.click();
	}
}
