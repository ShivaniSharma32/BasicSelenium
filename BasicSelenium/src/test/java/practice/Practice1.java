package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		driver.findElement(By.xpath("//span[text()='Beauty']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//img[@class='kJjFO0 _3DIhEh']"));
		for (WebElement wb:elements)
		{
			System.out.println(wb.getAttribute("alt"));
			if(wb.getAttribute("alt").equals("hc"))
				
					{
				wb.click();
				break;
					}
			
		}
		
	
	}
	}
