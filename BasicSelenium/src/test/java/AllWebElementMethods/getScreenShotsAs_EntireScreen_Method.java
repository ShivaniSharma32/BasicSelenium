package AllWebElementMethods;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getScreenShotsAs_EntireScreen_Method {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
         Thread.sleep(2000);
         TakesScreenshot ts=(TakesScreenshot) driver;
         
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        File trg = new File("./Screenshots/godaddy.png");
        
        FileHandler.copy(src, trg);
        Thread.sleep(2000);
        driver.close();
	}

}
