package ScrollingHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass_ScrollToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]")).click();
		Thread.sleep(2000);
		List<WebElement> listofitem = driver.findElements(By.xpath("//div[@class='sub-category-grid']//h2"));
		for(WebElement item:listofitem)
		{
			if (item.getText().equals("Notebooks"))
			{
			item.click();
			break;
			}
		}
	}
}
    // Actions class is not applicable for version 3 , it is applicable for version 4 or above.
		// rest program is on 'selenium version 4''
	
