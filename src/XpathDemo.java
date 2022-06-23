

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class XpathDemo extends LaunchBrowser{

	public static void main(String[] args) throws Exception {

		XpathDemo obj = new XpathDemo();
		obj.browserLaunch("Chrome", "http://automationpractice.com");
		obj.xpathexamples();
	}

	public void xpathexamples() throws Exception {
		
		String value1 = "//input[@id='search_query_top']";
		String srchbtn = "//button[@name = 'submit_search']";
		driver.findElement(By.xpath(value1)).clear();
		driver.findElement(By.xpath(value1)).sendKeys("T-shirts");
		
		driver.findElement(By.xpath(srchbtn)).click();
		driver.findElement(By.xpath(value1)).clear();
		Thread.sleep(3000);
		
		String womenlink = "//a[text()='Women']";   //using text()
		driver.findElement(By.xpath(womenlink)).click();
		
		
		WebElement loginbtn = driver.findElement(By.className("login"));
		loginbtn.click();
		String emailtxtbox = "//input[contains(@class,'is_required')]";
		driver.findElement(By.xpath(emailtxtbox)).sendKeys("example@12345678.com");
		
		String crteaccbtn = "button.btn#SubmitCreate";
		driver.findElement(By.cssSelector(crteaccbtn)).click();
		
		String mrradio = "//input[@type='radio']";
		String mrsradio = "//input[@id='id_gender2']";
		Thread.sleep(3000);
		
		boolean radiocheck = driver.findElement(By.xpath(mrradio)).isSelected();
		if(!radiocheck) {
			driver.findElement(By.xpath(mrsradio)).click();
		}
		
		String firstName = "//input[@id='customer_firstname']";
		driver.findElement(By.xpath(firstName)).sendKeys("Jim");
		
		String lastname = "//input[@id='customer_lastname']";
		driver.findElement(By.xpath(lastname)).sendKeys("carrie");
	
		String emailIdbox = "//input[@id='email']";
		boolean dflag = driver.findElement(By.xpath(emailIdbox)).isEnabled();
		System.out.println("emailidbox is enabled " +dflag);
		
		String passwordbox = "//input[@data-validate='isPasswd']";
		driver.findElement(By.xpath(passwordbox)).sendKeys("admin");
		
		String date_of_birth = "//select[@id='days']";
		Select drop1 = new Select(driver.findElement(By.xpath(date_of_birth)));
		drop1.selectByIndex(3);
		
		String month_of_birth = "//select[@id='months']";
		Select drop2 = new Select(driver.findElement(By.xpath(month_of_birth)));
		drop2.selectByValue("3");
		
		String year_of_birth = "//select[@id='years']";
		Select drop3 = new Select(driver.findElement(By.xpath(year_of_birth)));
		drop3.selectByValue("2016");
		
		String newsletter = "//input[@name='newsletter']";
		driver.findElement(By.xpath(newsletter)).click();
		System.out.println("checked the newsletter box");
		
		String offers = "//div[@class='checker'][@id='uniform-optin']";
		driver.findElement(By.xpath(offers)).click();
		System.out.println("checked the offers box");
		
		String firstname = "//input[@id='lastname']";
		driver.findElement(By.xpath(firstname)).sendKeys("selvam");
		
		String company = "//input[@id='company']";
		driver.findElement(By.xpath(company)).sendKeys("cts");
		
		String address = "//input[@name='address1']";
		driver.findElement(By.xpath(address)).sendKeys("abc");
		
		String city = "//input[@name='city']";
		driver.findElement(By.xpath(city)).sendKeys("greenfield");
		
		String state = "//select[@name='id_state']";
		Select abj = new Select(driver.findElement(By.xpath(state)));
		abj.selectByVisibleText("Alabama");
		
		String postalcode = "//input[@name='postcode']";
		driver.findElement(By.xpath(postalcode)).sendKeys("53220");
		
		String country = "//select[@id='id_country']";
		Select abk = new Select(driver.findElement(By.xpath(country)));
		abk.selectByVisibleText("United States");
		Thread.sleep(3000);
		
		String textarea = "//textarea[@name='other']";
		driver.findElement(By.xpath(textarea)).sendKeys("Hi hello /n anitha");
		
		String phoneno = "//input[@name='phone_mobile']";
		driver.findElement(By.xpath(phoneno)).sendKeys("12348756598");
		
		String aliasadd = "//input[@id='alias']";
		driver.findElement(By.xpath(aliasadd)).sendKeys("nddhdndj hdhd");
		
		Thread.sleep(3000);
		String register = "//button[@id='submitAccount']";
		driver.findElement(By.xpath(register)).click();
		
		driver.close();
		
	}
	
}
