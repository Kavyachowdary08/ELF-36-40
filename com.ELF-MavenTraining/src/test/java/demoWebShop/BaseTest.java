package demoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void SetUpBrowser(@Optional("firefox")String browserName) {
		
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if(browserName.contains("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
	
	else {
		System.out.println("Browser name not specified");
		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
}

@AfterClass
public void browserTearDown() {
	driver.quit();
	}
}

