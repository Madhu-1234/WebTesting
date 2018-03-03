package com.wallethub.testScripts;

import org.testng.annotations.Test;
import com.wallethub.pages.CompanyProfilePage;
import com.wallethub.pages.LoginPage;
import com.wallethub.pages.ProfilePage;
import com.wallethub.pages.ReviewPage;

public class VerifyReviewSubmissionTest extends BaseTest{
	
	@Test
	public void VerifyReview() throws InterruptedException{
		
		CompanyProfilePage pp = new CompanyProfilePage(driver);
		pp.ClickOnRating(driver);
		ReviewPage rp = new ReviewPage(driver);
		rp.ChoosePolicyDropdown();
		rp.EnterRatingAndComments(driver);
		LoginPage lp = new LoginPage(driver);
		String username= "madhusmita.m12@gmail.com";
		String passwd = "P@ssw0rd" ;
		lp.Login(username,passwd);	
		driver.get("https://wallethub.com/profile/madhusmita_m12/reviews/");
		ProfilePage p = new ProfilePage(driver);
		p.Verify();
		
		
	}

}
