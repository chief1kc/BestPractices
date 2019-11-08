package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPagePF;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jscott\\eclipse\\Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// The (driver) in the following line is from WebDriver above.  To pass that functionality to this line
		// This creates an object of the class
		// Place cursor over the 2nd RediffLoginPage, and select Change to '' (objectrepository)
		RediffLoginPagePF rd=new RediffLoginPagePF(driver);
		// Most coding is being handled by classes.  By reading the code below, even a novice can understand what is going on
		rd.EmailId().sendKeys("hello");
		rd.Emailpass().sendKeys("hello");
		rd.Emailsubmit().click();
		rd.EmailHome().click();
		
		RediffHomePage rh=new RediffHomePage(driver);
		rh.HomeSearch().sendKeys("rediff");
		rh.HomeSearchbt().click();
		
		
	}
	
}
