package baseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseClass {

	public WebDriver driver;
	public static Properties repository; 
	
	
	
	
	/**
	   * This method will call config.properties file
	   * @return noting.
	   * @exception IOException On input error.
	   */
	
	
	public void loadProperties() throws Exception {   
		repository = new Properties();
		FileInputStream Input = new FileInputStream("C:\\Users\\Tonmoy\\git\\SeleniumMavenProject1\\Selenium_maven\\config\\config.Properties");
        repository.load(Input);
	
	}
	
	
	/**
	   * This method will select browser based on config.properties file
	   * @param browser type  
	   * @return Browser
	   */
	
	public WebDriver selectWebDriver(String browser) {
		if(browser.equals("chrome") || browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tonmoy\\eclipse-workspace\\Selenium_maven\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		  else if(browser.equals("firefox") || browser.equals("FIREFOX")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tonmoy\\eclipse-workspace\\Selenium_maven\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver(); 
		  return driver; }
		 
		return null;
	}
	
	
	/**
	   * This method will fetch url from config.properties file
	   * @param url   
	   * @return none
	   */
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	/**
	   * This method will close any open windows
	   * We can re-use it anywhere in any test class.
	   * @param none   
	   * @return none
	   */
	
	public void closeWindow() {
		driver.close();
	}
	
	/**
	   * This method will be the main method
	   * @param none   
	   * @return none
	   * @throws Exception
	   */
	
	public void Run() throws Exception{
		loadProperties();
		selectWebDriver(repository.getProperty("browser"));
		getUrl(repository.getProperty("url"));
		Thread.sleep(3000);
		closeWindow();
	}
	
}
