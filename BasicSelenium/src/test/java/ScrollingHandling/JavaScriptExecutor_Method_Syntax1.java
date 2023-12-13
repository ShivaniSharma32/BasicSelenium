package ScrollingHandling;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_Method_Syntax1 {


	public static void main(String[] args) throws InterruptedException, IOException {
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
   driver.findElement(By.xpath("//div[@class='block block-manufacturer-navigation']//a")).click();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,100);");
    
    Thread.sleep(3000);
    
    TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File trg = new File("./Screenshots/finalimage.png");
    FileHandler.copy(src, trg);
	}

}
