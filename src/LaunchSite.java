

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSite {

	public static void main(String[] args) throws Exception  {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anitha Selvasundaram\\eclipse-workspace\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha Selvasundaram\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://automationpractice.coms");
		Thread.sleep(5000);
		
		//driver = new FirefoxDriver();
		//driver.get("https://www.firefox.com");
		
		String title = driver.getTitle();
		System.out.println("Page title \t" + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Page Url \t" + currentUrl);
		
		String pagesrc = driver.getPageSource();
		System.out.println("Page source" + pagesrc);
		
		driver.close();
	
	}

}