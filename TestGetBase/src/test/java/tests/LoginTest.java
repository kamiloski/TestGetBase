package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("https://getbase.com/");
	}
	
	@Test()
	public void goToLoginPage(){
		driver.findElement(By.xpath("//*[@id='global-nav']/div/div/div[3]/ul/li[1]/a")).click();
		Assert.assertEquals(driver.getTitle(), "Login to Base");
	}
	
	@Test(dependsOnMethods = "goToLoginPage")
	public void logInBase(){
		driver.findElement(By.id("user_email")).sendKeys("ciupakabrans@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("testbase");;
	}
	
	
	
	
}
