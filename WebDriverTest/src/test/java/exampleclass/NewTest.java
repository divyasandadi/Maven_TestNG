package exampleclass;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	    @BeforeTest
		public void beforeTest() {	
	    	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			 System.out.println("Driver lauched");
		}		
		@Test				
		public void a_testEasy() {	
			
			 //driver = new FirefoxDriver();  
			driver.get("https://qa.optimalblue.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Login"));
			System.out.println("Title is verified");
			driver.manage().window().maximize();
			
		}	
		@Test				
		public void b_login() {	
		driver.findElement(By.id("UserName")).isDisplayed();
		driver.findElement(By.id("UserPassword")).isDisplayed();
		System.out.println("Login Fields are displaying");
		}
		@Test				
		public void c_loginenable() {	
		driver.findElement(By.id("UserName")).isEnabled();
		driver.findElement(By.id("UserPassword")).isEnabled();
		driver.findElement(By.id("UserName")).sendKeys("obadmin");
		System.out.println("Login fields are enabled");
		}	
	
		@AfterTest
		public void afterTest() {
			driver.quit();	
			System.out.println("Broswer is closed");
		}		
}	