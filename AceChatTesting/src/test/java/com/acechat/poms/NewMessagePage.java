package com.acechat.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMessagePage {

	@FindBy(id="group-name-box")
	private WebElement groupNameBox;
	@FindBy(id="name-box")
	private WebElement nameBox;
	@FindBy(id="send-button")
	private WebElement sendButton;
	@FindBy(id="friends-link")
	private WebElement friendsLink;
	@FindBy(id="settings-link")
	private WebElement settingsLink;
	@FindBy(id="logout-button")
	private WebElement logoutButton;
	
	public NewMessagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	/**
	 * This method creates a new chat group with one other person.
	 * @param groupName
	 * @param name
	 */
	public void createNewChat1(String groupName, String name) {
		groupNameBox.sendKeys(groupName);
		nameBox.sendKeys(name);
		sendButton.click();
	}
	
	//TODO: Fix logic and create id's in JS
	public void createNewChat2(String groupName, String name1, String name2) {
		groupNameBox.sendKeys(groupName);
		nameBox.sendKeys(name1);
		//Click 1st person here to add to list
		nameBox.sendKeys(name2);
		//Click 2nd person here to add to list
		sendButton.click();
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
