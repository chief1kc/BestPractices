package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class RediffLoginPagePF {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jscott\\eclipse\\Webdriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	// We are just defining this driver here, but not the rest of the usual code.  That will come from the login class
	WebDriver driver;
	// This line, creates a method from the class.  it creates a constructor
	public RediffLoginPagePF(WebDriver driver)
	{
		// This line marries the WebDriver line above with the WebDriver in the line public
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// This sections defines the object on the page.  If it ever needs to be changed,
	// It will be done here.  then the rest of the code will pick up that change	
	
	@FindBy(css="#login")
	WebElement username;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	// By changing void to WebElement, this allows us to refer to this method in other classes
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Emailpass()
	{
		return password;
	}
	
	public WebElement Emailsubmit()
	{
		return go;
	}
	
	public WebElement EmailHome()
	{
		return home;
	}
	
}