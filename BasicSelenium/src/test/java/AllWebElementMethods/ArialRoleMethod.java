package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArialRoleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().fullscreen();
        WebElement Username = driver.findElement(By.cssSelector("[placeholder=\"Username\"]"));
         //  See the ArialRoleMethod In selenium project ..(Arialrolemethod is notvisible here)
        
        driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("verma");
        driver.findElement(By.cssSelector("[for=\"keepLoggedInCheckBox\"]")).click();
        driver.findElement(By.cssSelector("//div[contains(text(),'Login')]")).click();
	}

}
