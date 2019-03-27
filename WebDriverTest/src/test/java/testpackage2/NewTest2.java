package testpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;		
public class NewTest2 {		
	    private WebDriver driver;	
	    @BeforeTest
		public void Launch() {	
	    	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			 System.out.println("Driver2 lauched");
		}		
		@Test				
		public void a_GetTitle() {	
			
			
			driver.get("https://qa.optimalblue.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Login")); 	
			driver.manage().window().maximize();
			System.out.println("Second Title  is verified");
			
		}	
		@Test				
		public void b_Fields() {	
		driver.findElement(By.id("btnSubmit")).isDisplayed();
		driver.findElement(By.id("UserName")).sendKeys("obadmin1");
		System.out.println("Submit Field is displaying");

		}
		@Test				
		public void c_Enable() {	
		driver.findElement(By.id("btnSubmit")).isEnabled();	
		System.out.println("Submit Field is enabled");
		}	
	
		@AfterTest
		public void QuitBrowser() {
			driver.quit();	
			System.out.println("Broswer2 is closed");
		}		
}	