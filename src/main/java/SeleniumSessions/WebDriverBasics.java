package SeleniumSessions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\swapna\\chromedriver.exe");
	   		
         WebDriver driver =new ChromeDriver();
         driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
         //driver.findElement(By.xpath("//*[@type='submit')]".click();
         
        	
        
       driver.findElement(By.xpath("//*[@id=\"dd1\"]/form/input[7]")).click();
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       
       		
       
        	 Thread.sleep(5000);
        	Alert alert = driver.switchTo().alert();
             System.out.println(alert.getText()); 
             String text =alert.getText();
             if (text.equals("Please enter email address")) {
            	System.out.println("Correc Alert message");
             }
             else {
            	System.out.println("Incorrect Alert message");
             
             }
             alert.accept();//clicks on ok of the alert
             
             
        	
        				 

	}
}