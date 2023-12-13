package Pop_Up_Handling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Switching_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
        System.out.println("---------");
        
       Set<String> allIDs = driver.getWindowHandles();
       for(String ID:allIDs)
       {
    	 // System.out.println(ID); 
    	   driver.switchTo().window(ID);
    	   System.out.println(driver.getTitle());
    	   if (driver.getTitle().equals("actiTIME - Time Tracking Software"))
    			   {
    		   driver.findElement(By.xpath("//a[text()='Log in']")).click();
    			   }
       }
    	   driver.switchTo().window(main);
    	   driver.quit();
	}

}
