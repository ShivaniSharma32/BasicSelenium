package Locators_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 //driver.findElement(By.name("field-keywords")).sendKeys("puma");
	 
	 //Passing Text in thesearch box by using CssSelector syntax 1--
	//driver.findElement(By.cssSelector("[aria-label=\"Search Amazon.in\"]")).sendKeys("puma");
	 
	//Passing Text in the search box by using CssSelector shortcut-id approach-1 (#Attribute)
	 //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
	 
	//Passing Text in the search box by using CssSelector shorcut-id approach-2 (htmltag#AttributeValue)
     //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("puma");
     
     //Passing Text in the search box by using CssSelector shortcut-name approach-1 (.Attribute)
     //driver.findElement(By.cssSelector(".nav-a")).click();
     
     //Passing Text in the search box by using CssSelector shortcut-name approach-2(htmltag.AttributeValue)
     driver.findElement(By.cssSelector("a.nav-a")).click();
	}

}
