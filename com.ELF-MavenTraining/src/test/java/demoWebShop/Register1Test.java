package demoWebShop;

import org.testng.annotations.Test;

import pomRepository.RegisterPage;

public class Register1Test extends BaseTest {
		
		@Test
		public void RegisterTest() {
			
			RegisterPage registerpage=new RegisterPage(driver);
			registerpage.clickRegisterLink();
			registerpage.clickgenderbutton();
			registerpage.enterFirstName("kavya");
			registerpage.enterLastName("chowdary");
			registerpage.enterEmail("kavyachowdary");
			registerpage.enterPassword("kavya");
			registerpage.enterConfirmPassword("kavya");
			registerpage.clickbutton();
			
			
			
			
			
		}
	}

	
	


