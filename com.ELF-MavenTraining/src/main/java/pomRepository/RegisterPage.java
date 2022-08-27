package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		}
	@FindBy(className = "ico-register")
	WebElement clickRegister;
	public void clickRegisterLink()
	{
		clickRegister.click();
	}
	
	@FindBy(id="gender-female")
	WebElement genderbutton;
	
	public void clickgenderbutton() {
		genderbutton.click();
	}
	
	@FindBy(id="FirstName")
	WebElement firstnameTF;
	
	
	public void enterFirstName(String firstname) {
		firstnameTF.sendKeys(firstname);
	}
	
	@FindBy(id="LastName")
	WebElement lastnameTF;
	
	public void enterLastName(String lastname) {
		lastnameTF.sendKeys(lastname);
	}
	
	@FindBy(id="Email")
	 WebElement emailTF;
	 
	 public void enterEmail(String email) {
		 emailTF.sendKeys(email);
	 }
	 
	 @FindBy(id="Password")
	 WebElement passwordTF;
	 
	 public void enterPassword(String pwd) {
		 passwordTF.sendKeys(pwd);
	 }
	 
	 @FindBy(id="ConfirmPassword")
	 WebElement cpwd;
	 
	 public void enterConfirmPassword(String confirmpassword) {
		 cpwd.sendKeys(confirmpassword);
	 }
	 
	 @FindBy(id="register-button")
	 WebElement registerbutton;
	 
	 public void clickbutton() {
		 registerbutton.click();
		 
	 }

}
