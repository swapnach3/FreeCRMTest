package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapSession {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\swapna\\chromedriver.exe");
  		
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       //dynamic wait
       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
       driver.findElement(By.xpath("//button[contains(@class,'btn btn-info btn-sm dropdown-toggle')]")).click();
       List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));
       
       System.out.println(list.size());
       
       for (int i=0;i<list.size();i++){
    	   System.out.println(list.get(i).getText());
    	   if(list.get(i).getText().contains("Bootstrap")) {
    	   list.get(i).click();
    	   break;
    	   
       }
       
      	
	}

}
}
