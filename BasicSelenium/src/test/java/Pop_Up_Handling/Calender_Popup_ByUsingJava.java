package Pop_Up_Handling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_Popup_ByUsingJava {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://jqueryui.com/datepicker/");
	     
	     driver.switchTo().frame(0);
	    Calendar cal = Calendar.getInstance();
	   Date date = cal.getTime();
	   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
	   String modifyDate = sdf.format(date);
	     
	     driver.findElement(By.xpath("//input[contains(@id,'datepicker')]")).sendKeys(modifyDate,Keys.ESCAPE);
         
	}

}
