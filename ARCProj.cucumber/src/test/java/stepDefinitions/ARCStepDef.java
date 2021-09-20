package stepDefinitions;

import Base.BaseClass;
import PageObjects.ArcPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ARCStepDef extends BaseClass {
	
	public ArcPOM ar;
	
	@Given("^User has logged in to ARC Application using valid data$")
	public void user_has_logged_in_to_ARC_Application_using_valid_data() {
		
			BaseClass.InitialiseBrowser();
			
			ar=new ArcPOM(driver);
			
			BaseClass.swithtoframe();
			ar.setUserName("Sheikn");
			ar.setpassword("Aug@2021");
			
			ar.clicklogin();
	}

	@And("^Get user rank and user points$")
	public void get_user_rank_and_user_points() throws Throwable {
		
		//String s=	driver.getCurrentUrl();
		////if(s=="https://arc.emids.com/social#feeds") {
			//System.out.println("move to next line");
			
			ar.printcount();
			ar.printrank();
		}
	   
	

	@When("^User click on First course present under linchpin$")
	public void user_click_on_First_course_present_under_linchpin() throws Throwable {

		ar.clicklinchpin();

		BaseClass.switchtochield();
		
		
	  
	}

	@Then("^User Navigate to main page$")
	public void user_Navigate_to_main_page() throws Throwable {
	    
		
		String s=	driver.getCurrentUrl();
		if(s=="https://arc.emids.com/social#feeds") {
			System.out.println("move to next line");
		}
	}

	@And("^User log out from the application$")
	public void user_log_out_from_the_application() throws Throwable {
	    
		ar.clickLogout();
		
		BaseClass.closeBrowser();
	}


}
