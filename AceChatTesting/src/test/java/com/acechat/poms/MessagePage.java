package com.acechat.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

	@FindBy(id="message-box")
	private WebElement messageBox;
	@FindBy(id="send-message-button")
	private WebElement sendMessageButton;
	@FindBy(id="friends-link")
	private WebElement friendsLink;
	@FindBy(id="settings-link")
	private WebElement settingsLink;
	@FindBy(id="logout-button")
	private WebElement logoutButton;
	
	public MessagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sendMessage(String message) {
		messageBox.sendKeys(message);
		sendMessageButton.click();
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
