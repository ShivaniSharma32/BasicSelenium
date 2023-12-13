package Pop_Up_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_Popup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://jqueryui.com/datepicker/");
     
     driver.switchTo().frame(0);
     driver.findElement(By.xpath("//input[contains(@id,'datepicker')]")).click();
     driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
     
	}
	

}
