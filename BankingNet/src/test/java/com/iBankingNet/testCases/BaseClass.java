package com.iBankingNet.testCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String url = "http://demo.guru99.com/v4/index.php"; 
	public String userId = "mngr299628"; 
	public String userPassword = "mUjenYq"; 
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}

}
