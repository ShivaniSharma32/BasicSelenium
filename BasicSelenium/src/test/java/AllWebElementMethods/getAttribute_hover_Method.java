package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttribute_hover_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
        driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//span[@role='button']")).click();
       WebElement hoverText = driver.findElement(By.xpath("//a[@title='Cart']"));
    		String CartHoverText = hoverText.getAttribute("title"); 
    		System.out.println(CartHoverText);
    
	}

}
