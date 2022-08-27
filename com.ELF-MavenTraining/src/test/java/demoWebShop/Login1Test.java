package demoWebShop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class Login1Test extends BaseTest{
	

	@Test
	public void Login1() {
		
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.clickLogin();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmail("kavyachowdary@gmail.com");
		loginpage.enterPassword("kavya");
		
		
	}

}
