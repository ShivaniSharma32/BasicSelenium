package Drop_Down_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Select_ByUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("mno");
		Thread.sleep(3000);
		s.selectByVisibleText("doc 3");
		Thread.sleep(3000);
		
		List<WebElement> AllOptions = s.getOptions();
		for(WebElement wb:AllOptions)
		{
			System.out.println(wb.getText());
		}
        driver.close();
        
	}

}
