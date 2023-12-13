package KeyboardStrokeHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsing_Robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_SHIFT);//This line is for uppercase 
		rc.keyPress(KeyEvent.VK_S);
		
		rc.keyRelease(KeyEvent.VK_SHIFT);//This libe is for lowercase
		rc.keyRelease(KeyEvent.VK_S);
		
		
		
	}

}
