package demoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WishlistTest {
	
	@Test
	public void Wishlist() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Health Book']")).click();
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
	}

}
