package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop =new Properties();
		
		FileInputStream ip =new FileInputStream("C:\\Selenium_Training\\FreeCRMTest\\src\\main\\java\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("browser"));
		
			
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\swapna\\chromedriver.exe");
   		
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
        String url =prop.getProperty("URL");
		System.out.println(url);
		
        driver.get("https://reg.ebay.com/reg/PartialReg");
   driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
       driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName")); 
	}

}
