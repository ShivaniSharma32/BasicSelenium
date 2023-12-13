package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
           driver.get("https://www.flipkart.com/");
           driver.manage().window().fullscreen();
          
           driver.findElement(By.xpath("//span[@role='button']")).click();
           //1st webElement 
           WebElement logo = driver.findElement(By.xpath("//a[@title='Flipkart']"));
           String logo_value = logo.getAttribute("title");
           System.out.println(logo_value);
           
           //2ndwebElement
           WebElement login = driver.findElement(By.xpath("//a[@title='Sign in']"));
         String login_value = login.getAttribute("title");
         System.out.println(login_value);
         
         //3rdwebElement
        WebElement Become_seller = driver.findElement(By.xpath("//a[contains(text(),'Become a Seller')]"));
       String Become_seller_title = Become_seller.getAttribute("title");
       System.out.println(Become_seller_title);
         
         
         
	}
	
	

	

}
