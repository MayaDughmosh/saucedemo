package FourthProjectAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourthTask {
	WebDriver driver= new ChromeDriver();

	@BeforeTest 
	public void SetUp() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test(priority =1)
	public void LoginTest() {
		String UserName="standard_user";
		String Password="secret_sauce";
		WebElement UserNameInput=driver.findElement(By.id("user-name"));
		WebElement PasswordInput=driver.findElement(By.id("password"));
		WebElement LoginButton=driver.findElement(By.id("login-button"));
		
		UserNameInput.sendKeys(UserName);
		PasswordInput.sendKeys(Password);
		LoginButton.click();
		
		
	}
	@Test (priority =2)
	public void Add4ItemsToCartTest() {
		List <WebElement> AddToCartButtons= driver.findElements(By.className("btn_primary"));
		for(int i=0;i<AddToCartButtons.size();i++)
		{
			AddToCartButtons.get(i).click();
			if(i==3) {
				break;
			}
		}
			
		
		
	}
}
