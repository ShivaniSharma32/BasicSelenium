package MultipleWebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printAllLinksPresent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
		List<WebElement> allLinkText = driver.findElements(By.xpath("//a"));
		for (WebElement Link: allLinkText)
		{
			System.out.println(Link.getText());
		}
	}

}
