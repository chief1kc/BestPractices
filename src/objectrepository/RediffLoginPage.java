package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
// update
public class RediffLoginPage {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jscott\\eclipse\\Webdriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	// We are just defining this driver here, but not the rest of the usual code.  That will come from the login class
	WebDriver driver;
	// This line, creates a method from the class.  it creates a constructor
	public RediffLoginPage(WebDriver driver)
	{
		// This line marries the WebDriver line above with the WebDriver in the line public
		this.driver=driver;
	}
	// This sections defines the object on the page.  If it ever needs to be changed,
	// It will be done here.  then the rest of the code will pick up that change
	By username= By.cssSelector("#login1");
	By password= By.cssSelector("#password");
	By go= By.name("proceed");
	By home= By.linkText("Home");
	
	
	// By changing void to WebElement, this allows us to refer to this method in other classes
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Emailpass()
	{
		return driver.findElement(password);
	}
	
	public WebElement Emailsubmit()
	{
		return driver.findElement(go);
	}
	
	public WebElement EmailHome()
	{
		return driver.findElement(home);
	}
	
}