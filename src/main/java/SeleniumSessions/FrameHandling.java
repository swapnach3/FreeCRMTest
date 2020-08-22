package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\swapna\\chromedriver.exe");
   		
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://ui.freecrm.com/");
        
       	
       
      driver.findElement(By.name("email")).sendKeys("chs8757@gmail.com");
      
      driver.findElement(By.name("password")).sendKeys("Test@123");
      driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
      
      		Thread.sleep(3000);
      		//driver.switchTo().frame("Twitter settings iframe");
      		//WebElement contact =driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span)"));
      	//	driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Contacts')]")).click();
      		driver.findElement(By.linkText("Contacts")).click();
      		
           System.out.println("Element clicked ");
      		//driver.close();
	}

}
