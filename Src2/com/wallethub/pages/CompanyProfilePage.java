package com.wallethub.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;



public class CompanyProfilePage {
	
	@FindBy(xpath = "//*[@id='wh-body-inner']/div[2]/div[3]/span")
	private WebElement menu;
	
	@FindBy(xpath= "//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[4]")
	private WebElement subMenu;
	
	
	public CompanyProfilePage(WebDriver driver){
		PageFactory.initElements(driver, this);

}
	public void ClickOnRating(WebDriver driver){
		driver.findElement(By.cssSelector("#footer_cta > span > span > i.af-icon-cross")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions action = new Actions(driver);
		action.moveToElement(menu).click(subMenu).build().perform();
		System.out.println("Rating is given");
		
	}

}
