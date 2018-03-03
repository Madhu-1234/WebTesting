package com.wallethub.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;


public class ReviewPage {
	
	@FindBy(className = "drop-arrow")
	private WebElement Dropdown;
	
	@FindBy(xpath = "//*[@id='reviewform']/div[1]/div/ul/li[2]/a")
	private WebElement Health;
	
	@FindBy(id= "review-content")
	private WebElement Comments;
	
	@FindBy(css="#overallRating > a:nth-child(5)")
	private WebElement Rating;
	
	@FindBy(css = "#reviewform > div.content > div.submit > input")
	private WebElement Submit;
	
	
	public ReviewPage(WebDriver driver){
		PageFactory.initElements(driver, this);

}
	public void ChoosePolicyDropdown(){
		Dropdown.click();
		Health.click();
		
	}
	public void EnterRatingAndComments(WebDriver driver) throws InterruptedException{
		Actions actions = new Actions(driver);
		WebElement fiveStars = driver.findElement(By.cssSelector("#overallRating > a:nth-child(5)"));
		actions.moveToElement(Rating).click(fiveStars).build().perform();
		Thread.sleep(5000);
		Comments.sendKeys("I have had a positive experience with the customer service provided. I am really glad with the overall help and business.I have had a positive experience with the customer service provided. I am really glad with the overall help and business. ");
		Thread.sleep(5000);
		System.out.println("Comment is given.");
		
		actions.moveToElement(Rating).click(fiveStars).build().perform();
		Thread.sleep(5000);		
		driver.findElement(By.className("minchars"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Submit.click();
		
	}


}
