package com.wallethub.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(css = "#join-light > form > div > nav > ul > li:nth-child(2) > a")
	private WebElement LoginBtn;
	
	@FindBy(name= "em")
	private WebElement Email;
	
	@FindBy(name= "pw1")
	private WebElement Password;
	
	@FindBy(css= "#join-light > form > div > div.btns > button")
	private WebElement SubmitBtn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);

}
	public void Login(String username, String passwd){
		LoginBtn.click();
		Email.sendKeys(username);
		Password.sendKeys(passwd);
		SubmitBtn.click();
		System.out.println("User could log in.");
		
	}
}
