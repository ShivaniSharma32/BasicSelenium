package MultipleWebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicProgramFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> allradiobuttons = driver.findElements(By.xpath("//li[@class='answer']/label"));
		
		
		for(WebElement radioButton: allradiobuttons)
		{
			radioButton.click();
			String d = radioButton.getText();
		System.out.println(d);
		}
		
		
		
		
		
		
	

	}

}
