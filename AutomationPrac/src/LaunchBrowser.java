

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowser extends LaunchSite{

	WebDriver driver ;
		
		public void browserLaunch(String btype, String url) {
			//Setting driver props
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anitha Selvasundaram\\eclipse-workspace\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha Selvasundaram\\eclipse-workspace\\chromedriver.exe");
			if(btype.equalsIgnoreCase("firefox") || btype.equalsIgnoreCase("ff")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
			driver.get(url);
		}
		
		public void closeBrowser() {
			driver.close();
		}
	}

