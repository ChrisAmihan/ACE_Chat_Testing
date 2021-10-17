package com.acechat.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendsPage {
	
	@FindBy(id="add-button-1")
	private WebElement addButton1;
	@FindBy(id="block-button-1")
	private WebElement blockButton1;
	@FindBy(id="all-users-tab")
	private WebElement allUsersTab;
	@FindBy(id="pending-friends-tab")
	private WebElement pendingFriendsTab;
	@FindBy(id="approved-friends-tab")
	private WebElement approvedFriendsTab;
	@FindBy(id="block-person-button")
	private WebElement blockPersonButton;
	@FindBy(id="chat-1")
	private WebElement chat1;
	@FindBy(id="mute-button-1")
	private WebElement muteButton1;
	@FindBy(id="delete-button-1")
	private WebElement deleteButton1;
	@FindBy(linkText="Create New Chat")
	private WebElement newChatLink;
	@FindBy(linkText="Settings")
	private WebElement settingsLink;
	@FindBy(id="friends-link")
	private WebElement friendsLink;
	@FindBy(id="logout-button")
	private WebElement logoutButton;
	
	public FriendsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addFriend() {
		addButton1.click();
	}
	
	public void blockFriend() {
		blockButton1.click();
	}
	
	public void logout() {
		logoutButton.click();
	}
	
	public void blockApprovedFriend() {
		approvedFriendsTab.click();
		blockPersonButton.click();
	}
	
	public void clickSettings() {
		settingsLink.click();
	}
	
	public void clickFriends() {
		friendsLink.click();
	}
	
	public void clickNewChat() {
		newChatLink.click();
	}
	
	public void muteChat1() {
		muteButton1.click();
	}
	
	public void deleteChat1() {
		deleteButton1.click();
	}
	
	//TODO
	public void searchChats(String chatName) {
		
	}
	
}
