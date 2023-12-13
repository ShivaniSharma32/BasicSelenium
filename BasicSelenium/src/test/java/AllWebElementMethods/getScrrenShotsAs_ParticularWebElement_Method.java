package AllWebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getScrrenShotsAs_ParticularWebElement_Method {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
         Thread.sleep(2000);
         
         WebElement signbutton = driver.findElement(By.xpath("//button[@id='submitBtn']"));
         
         File src = signbutton.getScreenshotAs(OutputType.FILE);
         
         File trg = new File("./Screenshots/signbutton.png");
         
         FileHandler.copy(src, trg);
         Thread.sleep(2000);
         driver.close();
        
	}

}