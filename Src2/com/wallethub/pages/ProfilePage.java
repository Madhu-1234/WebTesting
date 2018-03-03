package com.wallethub.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy (css= "#review751148 > p")
	WebElement review;
	
	public ProfilePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void Verify(){
		
		String actualReview = review.getText();
		String expectedReview = "I have had a positive experience with the customer service provided. I am really glad with the overall help and business.I have had a positive experience with the customer service provided. I am really glad with the overall help and business.";
		assertEquals(actualReview, expectedReview);
		System.out.println("Strings are compared");
		
	}

}
