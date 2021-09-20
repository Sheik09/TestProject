package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArcPOM {

	public WebDriver driver;

	public ArcPOM(WebDriver driver) {
		this.driver = driver;
		
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userName")
	@CacheLookup
	WebElement username;
	@FindBy(id = "password")
	@CacheLookup
	WebElement password;
	@FindBy(css="[type='submit']")
	@CacheLookup
	WebElement Loginbtn;
	
	
	
	@FindBy(xpath= "//li[@class='points-counter']")
  WebElement pointcount;

	@FindBy(xpath= "//li[@class=\"rank-counter\"]")
	  WebElement rankcounter;
	
	@FindBy(xpath= "//a[@id=\"nav_arc_linchpin_link\"]")
	  WebElement linchpin;
	
	@FindBy(id="sign_out")
	  WebElement logout;
	
	
	
	public void setUserName(String usern) {
		username.sendKeys(usern);
		
	}
	
	public void setpassword(String passrd) {
		
		password.sendKeys(passrd);
	}

	public void clicklogin() {
		Loginbtn.click();
	}

	public void printcount() {
		String s=pointcount.getText();
		System.out.println(s);
		
    }
	
	public void printrank() {
		String se=rankcounter.getText();
		System.out.println(se);
	}
	
	public void clicklinchpin() {
		linchpin.click();
	}
	
	
	public void clickLogout() {
		logout.click();
	}
	
}
