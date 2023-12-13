package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttribute_Method {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
        WebElement Usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
         Usernamefield.sendKeys("Shivani");
        String Username_Value = Usernamefield.getAttribute("value");
        System.out.println(Username_Value);
        
        
	}

}
