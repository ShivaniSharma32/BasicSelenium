package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment_5 {

	public static void main(String[] args) {
		String password="1234";
		String Username="Shivani";
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
        WebElement Usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
         Usernamefield.sendKeys(Username);
        String Username_Value = Usernamefield.getAttribute("value");
        System.out.println(Username_Value);
        
        if(Username.equals(Username_Value))
        {
        	System.out.println("Username field is accepting the data");
        }
        else
        {
        	System.out.println("Username field is not accepting the data");
        }
        
        
        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
        passwordfield.sendKeys(password);
        String password_value = passwordfield.getAttribute("value");
        System.out.println(password_value);
        
        if(password.equals(password_value))
        {
        	System.out.println("Password field is accepting the data");
        }
        else
        {
        	System.out.println("Password field is not accepting the data");
        }
        
     
	}
	

}
